package pkg.Controllers;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import pkg.Models.LoginModel;
import pkg.Models.UserModel;
import pkg.Views.AddCustomer;
import pkg.Views.AdminPanelView;
import pkg.Views.DialogBox;
import pkg.Views.ManageProduct;

public class AdminController {
	private LoginModel loginModel;
	private UserModel userModel;
	private RoutesController routesController;
	private AdminPanelView adminPanelView;
	private AddCustomer addCustomer;
	private ManageProduct manageProduct;
	public AdminController(LoginModel loginModel, UserModel userModel, RoutesController routesController){
		this.userModel = userModel;
		this.loginModel = loginModel;
		this.routesController = routesController;
		this.addCustomer = new AddCustomer();
		addCustomer.getBtnAddCustomer().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = addCustomer.getNameBox().getText();
				String phoneNumber = addCustomer.getPhoneNumber().getText();
				String email = addCustomer.getEmailBox().getText();
				String address = addCustomer.getAddressBox().getText();
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
				if (address.equals("")) {
					if(flagError == 1) {
						msg = msg.replace(" And ", ", ");
						msg += " And ";
					}
					msg += "Address";
					
					flagError = 1;
				}
				if(flagError == 0) {

//					String name  = "";
//					String address = "";
//					String phoneNo = "";
//					try {
//						if(checkLogin(email, pass) == false) {
////						JOptionPane.showMessageDialog(new JFrame(), "Wrong Email or Password Entered", "Error", JOptionPane.ERROR_MESSAGE );
//							DialogBox dialogBox= new DialogBox("Wrong Email or Password Entered", "Error");
//							dialogBox.setVisible(true);
//							
//						}else {
//							id = getId();
//							name = getName();
//							address = getAddress();
//							email = getEmail();
//							phoneNo = getPhoneNo();
//							type = getType();
//							loginView.setVisible(false);
//							if(type) {
////								routesController.setLoginModel(loginModel);
//								routesController.goToSales(name);
//							}else {
//								routesController.goToAdmin(name);
//							}
//							
////							JOptionPane.showMessageDialog(new JFrame(), "Welcome " + name + "\nYour ID: " + Integer.toString(id) + "\nYour Address: " + address + "\nYour Phone No: " + phoneNo + "\nYour Email: " + email + "\nYour Type: " + type, "Login Details", JOptionPane.INFORMATION_MESSAGE);
//						}
//					} catch (HeadlessException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					
					
				}else {
					DialogBox dialogBox= new DialogBox( msg, "Error");
					dialogBox.setVisible(true);
//					JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE );
				}
				
			}
			
		});
		this.manageProduct = new ManageProduct();
		this.adminPanelView = new AdminPanelView(addCustomer, manageProduct);
	}
	public void loadAdmin(String name) {
		this.adminPanelView.setName(name);
		this.adminPanelView.setVisible(true);
		
	}
}
