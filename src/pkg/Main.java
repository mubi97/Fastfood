package pkg;

import pkg.Models.*;
import pkg.Views.*;
import pkg.Controllers.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminModel admin = new AdminModel();
		OperatorModel operator = new OperatorModel();
		LoginModel model = new LoginModel(admin, operator);
		LoginView view = new LoginView();
		LoginController controller = new LoginController(view, model);
		

	}

}
