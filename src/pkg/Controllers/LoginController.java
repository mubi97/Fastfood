/**
 * 
 */
package pkg.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pkg.Models.*;
import pkg.Views.*;

/**
 * @author Hams Ansari
 *
 */
public class LoginController {

	private LoginView loginView;
	private LoginModel loginModel;
	
	public LoginController (LoginView loginView, LoginModel loginModel) {
		this.loginView = loginView;
		//this.loginView.setController(this);
		this.loginModel = loginModel;
		this.loginView.setActionListener(new ButtonListener());
		this.loginView.setVisible(true);
		
	}
	public Boolean checkLogin(String email, String password) {
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
	
	public String getType() {
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
				
				String type = "";
				int id;
				String name  = "";
				String address = "";
				String phoneNo = "";
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
					
					JOptionPane.showMessageDialog(new JFrame(), "Welcome " + name + "\nYour ID: " + Integer.toString(id) + "\nYour Address: " + address + "\nYour Phone No: " + phoneNo + "\nYour Email: " + email + "\nYour Type: " + type, "Login Details", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}else {
				DialogBox dialogBox= new DialogBox( msg, "Error");
				dialogBox.setVisible(true);
//				JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE );
			}
		}
			
		}
		
	}
	

