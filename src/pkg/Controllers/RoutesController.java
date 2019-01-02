package pkg.Controllers;

import java.sql.SQLException;

import pkg.Models.*;
import pkg.Views.AdminPanelView;
import pkg.Views.LoginView;
/**
 * Controller to control routes of the application
 * @author mubi
 *
 */
public class RoutesController {
	private UserModel userModel;
	private CustomerModel customerModel;
	private ItemModel itemModel;
	private LoginModel loginModel;
	private LoginController loginController;
	private SalesController salesController;
	private AdminController adminController;
	private DealsModel dealModel;
	private BillModel billModel;
	/**
	 * Constructor of the controller
	 * @throws SQLException
	 */
	public RoutesController() throws SQLException{
		userModel = new UserModel();
		loginModel = new LoginModel(userModel);
		customerModel = new CustomerModel();
		itemModel = new ItemModel();
		dealModel= new DealsModel();
		billModel = new BillModel();
		adminController = new AdminController(loginModel, userModel, customerModel, itemModel,dealModel, this);
		loginController = new LoginController(loginModel, this);
		salesController = new SalesController(loginModel, userModel, itemModel, billModel, customerModel, this);
	}
//	public void setLoginModel(LoginModel loginModel) {
//		this.loginModel = loginModel;
//		salesController.setLoginModel(loginModel);
//	}
	/**
	 * Load Login Page
	 */
	public void goToLogin() {
		loginController.loadLogin();
	}
	/**
	 * Load Sales Page
	 * @param name Name of the User
	 */
	public void goToSales(String name) {
		salesController.loadSales(name);
	}
	/**
	 * Load admin panel
	 * @param name Name of the User
	 */
	public void goToAdmin(String name) {
		adminController.loadAdmin(name);
	}
}
