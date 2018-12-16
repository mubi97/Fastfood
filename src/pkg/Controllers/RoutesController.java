package pkg.Controllers;

import pkg.Models.*;
import pkg.Views.AdminPanelView;
import pkg.Views.LoginView;

public class RoutesController {
	private UserModel userModel;
	private CustomerModel customerModel;
	private ItemModel itemModel;
	private LoginModel loginModel;
	private LoginController loginController;
	private SalesController salesController;
	private AdminController adminController;
	
	public RoutesController(){
		userModel = new UserModel();
		loginModel = new LoginModel(userModel);
		customerModel = new CustomerModel();
		itemModel = new ItemModel();
		adminController = new AdminController(loginModel, userModel, customerModel, itemModel, this);
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
	public void goToAdmin(String name) {
		adminController.loadAdmin(name);
	}
}
