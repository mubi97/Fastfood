package pkg.Controllers;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import pkg.Models.*;
import pkg.Views.*;


public class AdminController {
	private LoginModel loginModel;
	private UserModel userModel;
	private RoutesController routesController;
	private AdminPanelView adminPanelView;
	private AddCustomer addCustomer;
	private ManageProduct manageProduct;
	private ItemModel itemModel;
	private CustomerModel customerModel;
	private ManageUsers manageUsers;
	private AddDeal addDeal;
	private ArrayList<ItemModel> itemList;
	public AdminController(LoginModel loginModel, UserModel userModel, CustomerModel customerModel, ItemModel itemModel, RoutesController routesController) throws SQLException{

		this.userModel = userModel;
		this.customerModel = customerModel;
		this.loginModel = loginModel;
		this.itemModel = itemModel;
		this.routesController = routesController;
		this.itemList = itemModel.getProducts();
		this.addCustomer = new AddCustomer();
		this.manageUsers = new ManageUsers();
		this.manageProduct = new ManageProduct();
		this.addDeal = new AddDeal();
		
		addCustomer.getBtnAddCustomer().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = addCustomer.getNameBox().getText();
				String phoneNumber = addCustomer.getPhoneNumber().getText();
				String address = addCustomer.getAddressBox().getText();
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

					boolean flagInsert = customerModel.addCustomer(name, address, phoneNumber);
					if(!flagInsert) {
						DialogBox dialogBox= new DialogBox("Customer Was Not Added...Sorry", "Error");
						dialogBox.setVisible(true);
					}else {
						addCustomer.getNameBox().setText("");
						addCustomer.getPhoneNumber().setText("");
						addCustomer.getAddressBox().setText("");
						DialogBox dialogBox= new DialogBox("Customer Added Successfully...", "Success");
						dialogBox.setVisible(true);
					}
					
					
				}else {
					DialogBox dialogBox= new DialogBox( msg, "Error");
					dialogBox.setVisible(true);
//					JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE );
				}
				
			}
			
		});
		
        for (int i = 0 ; i < itemList.size() ; i++ ) {
        	this.manageProduct.getModel().addRow(new Object[]{i + 1, itemList.get(i).getName(), itemList.get(i).getPrice()});
        }
		manageProduct.getBtnAddProduct().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = manageProduct.getProductBox().getText();
				int price = Integer.parseInt(manageProduct.getPriceBox().getText());
				int flagError = 0;
				String msg = "Please Enter ";
				if (name.equals("")) {
					msg += "Name";
					flagError = 1;
				}
				
				if (price <= 0) {
					if(flagError == 1) {
						msg = msg.replace(" And ", ", ");
						msg += " And ";
					}
					msg += "Price";
					flagError = 1;
				}
				if(flagError == 0) {

					boolean flagInsert = itemModel.addItem(name, price);
					if(!flagInsert) {
						DialogBox dialogBox= new DialogBox("Item Was Not Added...Sorry", "Error");
						dialogBox.setVisible(true);
					}else {
						manageProduct.getModel().addRow(new Object[]{manageProduct.getModel().getRowCount() + 1, name, Integer.toString(price)});
						manageProduct.getProductBox().setText("");
						manageProduct.getPriceBox().setText("");
						DialogBox dialogBox= new DialogBox("Item Added Successfully...", "Success");
						dialogBox.setVisible(true);
					}
					
					
				}else {
					DialogBox dialogBox= new DialogBox( msg, "Error");
					dialogBox.setVisible(true);
//					JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE );
				}
				
			}
			
		});
		
		manageUsers.getBtnAddUser().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = manageUsers.getNameBox().getText();
				String email = manageUsers.getEmailBox().getText();
				String phoneNumber = manageUsers.getPhoneBox().getText();
				String password = manageUsers.getPasswordBox().getText();
				String cpass = manageUsers.getCpassBox().getText();
				int type = 1;
				if(manageUsers.getType()) {
					type = 1;
				}
				else
					type = 0;
				int flagError = 0;
				String msg = "Please Enter ";
				
				if (name.equals("")) {
					msg += "Name";
					flagError = 1;
				}
				
				if (email.equals("")) {
					if(flagError == 1) {
						msg = msg.replace(" And ", ", ");
						msg += " And ";
					}
					msg += "Email";
					
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
				if(password.equals(cpass)) {
					DialogBox dialogBox= new DialogBox("Confirmed Password doesn't Match!", "Error");
					dialogBox.setVisible(true);
				}
				if(flagError == 0) {

					boolean flagInsert = userModel.addUser(name, email, phoneNumber, password, type);
					if(!flagInsert) {
						DialogBox dialogBox= new DialogBox("User Was Not Added...Sorry", "Error");
						dialogBox.setVisible(true);
					}else {
						manageUsers.getNameBox().setText("");
						manageUsers.getEmailBox().setText("");
						manageUsers.getPhoneBox().setText("");
						manageUsers.getPasswordBox().setText("");
						manageUsers.getCpassBox().setText("");
						DialogBox dialogBox= new DialogBox("User Added Successfully...", "Success");
						dialogBox.setVisible(true);
					}
					
					
				}else {
					DialogBox dialogBox= new DialogBox( msg, "Error");
					dialogBox.setVisible(true);
//					JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE );
				}
				
			}
			
		});
		this.adminPanelView = new AdminPanelView(addCustomer, manageProduct, addDeal, manageUsers);
	}
	public void loadAdmin(String name) {
		this.adminPanelView.setName(name);
		this.adminPanelView.setVisible(true);
		
	}
}
