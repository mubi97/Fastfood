package pkg.Controllers;

import pkg.Models.LoginModel;
import pkg.Views.SaleView;
import pkg.Models.UserModel;

public class SalesController {
	private LoginModel loginModel;
	private UserModel userModel;
	private RoutesController routesController;
	private SaleView saleView;
	public SalesController(LoginModel loginModel, UserModel userModel, RoutesController routesController){
		this.userModel = userModel;
		this.loginModel = loginModel;
		this.routesController = routesController;
		this.saleView = new SaleView();
	}
	public void loadSales(String name) {
		this.saleView.setName(name);
		this.saleView.setVisible(true);
	}
}
