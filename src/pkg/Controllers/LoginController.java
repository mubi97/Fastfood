/**
 * 
 */
package pkg.Controllers;

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
		this.loginView.setController(this);
		this.loginModel = loginModel;
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
	
}
