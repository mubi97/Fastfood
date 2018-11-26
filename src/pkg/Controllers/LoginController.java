/**
 * 
 */
package pkg.Controllers;

import pkg.Models.LoginModel;

/**
 * @author Hams Ansari
 *
 */
public class LoginController {

	private LoginView login_view;
	private LoginModel login_model;
	
	public LoginView (LoginView loginView, LoginModel loginModel) {
		this.loginView = loginView;
		this.loginModel = loginModel;
		
	}
	public String checkLogin(String email, String password) {
		return loginModel.checkType(email, password);
	}
	
	
	
}
