package pkg.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import pkg.Models.BillModel;
import pkg.Models.CustomerModel;
import pkg.Models.LoginModel;
import pkg.Views.DialogBox;
import pkg.Views.SaleView;
import pkg.Models.UserModel;
import pkg.Models.ItemModel;
/**
 * Sales Controller
 * @author mubi
 *
 */
public class SalesController {
	private LoginModel loginModel;
	private UserModel userModel;
	private RoutesController routesController;
	private SaleView saleView;
	private CustomerModel customerModel;
	private ItemModel itemModel;
	private BillModel billModel;
	private ArrayList<ItemModel> itemList;
	/**
	 * Constructor of Sales Controller
	 * @param loginModel Login Model
	 * @param userModel User Model
	 * @param itemModel Item Model
	 * @param billModel Bill Model
	 * @param customerModel Customer Model
	 * @param routesController Routes Controller
	 * @throws SQLException Sql Exception
	 */
	public SalesController(LoginModel loginModel, UserModel userModel, ItemModel itemModel, BillModel billModel,CustomerModel customerModel, RoutesController routesController) throws SQLException{
		this.userModel = userModel;
		
		this.loginModel = loginModel;
		this.routesController = routesController;
		this.saleView = new SaleView();
		this.customerModel = customerModel;
		this.itemModel = itemModel;
		this.itemList = itemModel.getProducts();
		this.billModel = billModel;
		for(ItemModel item: itemList) {
			this.saleView.getModel2().addElement(item.getName());
		}
		
		
		saleView.getBtnCheckout().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = saleView.getTextName().getText();
				String phoneNumber = saleView.getTextPhone().getText();
				String address = saleView.getTextAddress().getText();
				int flagError = 0;
				String msg = "Please Enter ";
				if (name.equals("")) {
					msg += "Name";
					flagError = 1;
				}
				
				if (phoneNumber.equals("")) {
					if(flagError == 1) {
						msg = msg.replace(" And ", ", ");
						msg += " And ";
					}
					msg += "Phone Number";
					
					flagError = 1;
				}
				if (address.equals("")) {
					if(flagError == 1) {
						msg = msg.replace(" And ", ", ");
						msg += " And ";
					}
					msg += "Address";
					
					flagError = 1;
				}
				if(flagError == 0) {

					//Adding Customer to database
					boolean flag = billModel.addSale(name, address, phoneNumber);
					if(!flag) {
						DialogBox dialogBox= new DialogBox("Sale Was Not Added...Sorry", "Error");
						dialogBox.setVisible(true);
					}
					else {
						saleView.getTextName().setText("");
						saleView.getTextPhone().setText("");
						saleView.getTextAddress().setText("");
						DialogBox dialogBox= new DialogBox("Sale Added Successfully...", "Success");
						dialogBox.setVisible(true);
						saleView.getTextQuantity().setText("");
						saleView.getTotalPrice().setText("0.00");
					}
					//Adding the billed items array to database
					//Emptying the JTable
					DefaultTableModel model = (DefaultTableModel)saleView.getTable().getModel();
					model.setRowCount(0);
					
					
				}else {
					DialogBox dialogBox= new DialogBox( msg, "Error");
					dialogBox.setVisible(true);
//					JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE );
				}
				
			}
			
		});
		
		saleView.getTextQuantity().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String product = saleView.getTextProduct().getSelectedItem().toString();
				int quantity = Integer.parseInt(saleView.getTextQuantity().getText());
				int id = 0;
				int price = 0;
				int cost = 0;
				int flagError = 0;
				boolean isAvailable;
				String msg = "Please Enter ";
				if (product.equals("")) {
					msg += "Product Name";
					flagError = 1;
				}
				
				if (quantity <= 0) {
					if(flagError == 1) {
						msg = msg.replace(" And ", ", ");
						msg += " And ";
					}
					msg += "Quantity";
					
					flagError = 1;
				}
				if(flagError == 0) {
					for(ItemModel item:itemList) {
						if (item.getName().equals(product)) {
							billModel.addItem(item.getId(), quantity);
							DefaultTableModel model = (DefaultTableModel)saleView.getTable().getModel();
							model.addRow(new Object[]{model.getRowCount() + 1, product, item.getPrice(), quantity, (Integer.parseInt(item.getPrice()) * quantity)});
							Double total = ((Double.parseDouble(saleView.getTotalPrice().getText())) + (Integer.parseInt(item.getPrice()) * quantity));
							saleView.getTotalPrice().setText(Double.toString(total));
							saleView.getTextQuantity().setText("");
							break;
						}
					}
//						try {
//							isAvailable = itemModel.getProductInfo(product, id, price);
//							if(isAvailable) {
//								cost = price * quantity;
//								//Adding to Jtable
//								DefaultTableModel model = (DefaultTableModel)saleView.getTable().getModel();
//								model.addRow(new Object[]{id, product, price, quantity, cost});
//								saleView.getTextQuantity().setText("");
//								//Storing in array to store it in database later
//							}
//							else {
//								DialogBox dialogBox= new DialogBox("Product not Available!", "Error");
//								dialogBox.setVisible(true);
//							}
//						} catch (SQLException e1) {
							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
						
					
				
				}else {
					DialogBox dialogBox= new DialogBox( msg, "Error");
					dialogBox.setVisible(true);
//					JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE );
				}
			}
			
		});
	}
	/**
	 * Load Sales Page
	 * @param name Name of the Page
	 */
	public void loadSales(String name) {
		this.saleView.setName(name);
		this.saleView.setVisible(true);
	}
	
}
