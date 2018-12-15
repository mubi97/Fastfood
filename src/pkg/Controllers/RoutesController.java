package pkg.Controllers;

import pkg.Models.LoginModel;
import pkg.Models.UserModel;
import pkg.Views.LoginView;

public class RoutesController {
	private UserModel userModel;
	private LoginModel loginModel;
	private LoginController loginController;
	private SalesController salesController;
	public RoutesController(){
		userModel = new UserModel();
		loginModel = new LoginModel(userModel);
		loginController = new LoginController(loginModel, this);
		salesController = new SalesController(loginModel, userModel, this);
	}
//	public void setLoginModel(LoginModel loginModel) {
//		this.loginModel = loginModel;
//		salesController.setLoginModel(loginModel);
//	}
	public void goToLogin() {
		loginController.loadLogin();
	}
	public void goToSales(String name) {
		salesController.loadSales(name);
	}
	
}
