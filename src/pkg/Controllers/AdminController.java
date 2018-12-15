package pkg.Controllers;

import pkg.Models.LoginModel;
import pkg.Models.UserModel;
import pkg.Views.AdminPanelView;

public class AdminController {
	private LoginModel loginModel;
	private UserModel userModel;
	private RoutesController routesController;
	private AdminPanelView adminPanelView;
	public AdminController(LoginModel loginModel, UserModel userModel, RoutesController routesController){
		this.userModel = userModel;
		this.loginModel = loginModel;
		this.routesController = routesController;
		this.adminPanelView = new AdminPanelView();
	}
	public void loadAdmin(String name) {
		this.adminPanelView.setName(name);
		this.adminPanelView.setVisible(true);
	}
}
