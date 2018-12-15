/**
 * 
 */
package pkg.Controllers;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pkg.Main;
import pkg.Models.*;
import pkg.Views.*;

/**
 * @author Hams Ansari
 * @param <LoginController>
 *
 */
public class LoginController {

	private LoginView loginView;
	private LoginModel loginModel;
	private RoutesController routesController;
	
	public LoginController (LoginModel loginModel, RoutesController routesController) {
		this.loginView = new LoginView();
		this.routesController = routesController;
		this.loginModel = loginModel;
		this.loginView.setActionListener(new ButtonListener());
		
	}
	public void loadLogin(){
		this.loginView.setVisible(true);
	}
	public Boolean checkLogin(String email, String password) throws SQLException {
		return loginModel.checkLogin(email, password);
	}
	
	public int getId() {
		return loginModel.getId();
	}
	
	public String getName() {
		return loginModel.getName();
	}
	
	public String getAddress() {
		return loginModel.getAddress();
	}
	
	public String getPhoneNo() {
		return loginModel.getPhoneNo();
	}
	
	public String getEmail() {
		return loginModel.getEmail();
	}
	
	public boolean getType() {
		return loginModel.getType();
	}
	
	class ButtonListener implements ActionListener{

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			String email = loginView.getEmailBox().getText();
			String pass = loginView.getPasswordBox().getText();
			int flagError = 0;
			String msg = "Please Enter ";
			if (email.equals("")) {
				msg += "Email";
				flagError = 1;
			}
			if (pass.equals("")) {
				if(flagError == 1) {
					msg += " And ";
				}
				msg += "Password";
				
				flagError = 1;
			}
			if(flagError == 0) {
				
				boolean type;
				int id;
				String name  = "";
				String address = "";
				String phoneNo = "";
				try {
					if(checkLogin(email, pass) == false) {
//					JOptionPane.showMessageDialog(new JFrame(), "Wrong Email or Password Entered", "Error", JOptionPane.ERROR_MESSAGE );
						DialogBox dialogBox= new DialogBox("Wrong Email or Password Entered", "Error");
						dialogBox.setVisible(true);
						
					}else {
						id = getId();
						name = getName();
						address = getAddress();
						email = getEmail();
						phoneNo = getPhoneNo();
						type = getType();
						loginView.setVisible(false);
						if(type) {
//							routesController.setLoginModel(loginModel);
							routesController.goToSales(name);
						}else {
//							adminPanelView.setVisible(true);
						}
						
//						JOptionPane.showMessageDialog(new JFrame(), "Welcome " + name + "\nYour ID: " + Integer.toString(id) + "\nYour Address: " + address + "\nYour Phone No: " + phoneNo + "\nYour Email: " + email + "\nYour Type: " + type, "Login Details", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}else {
				DialogBox dialogBox= new DialogBox( msg, "Error");
				dialogBox.setVisible(true);
//				JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE );
			}
		}
			
		}
		
	}
	

