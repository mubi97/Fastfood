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
	public String checkLogin(String email, String password) {
		return loginModel.checkLogin(email, password);
	}
	
}
