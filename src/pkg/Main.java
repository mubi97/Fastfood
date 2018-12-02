package pkg;

import pkg.Models.*;
import pkg.Views.*;
import pkg.Controllers.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserModel user = new UserModel();
		LoginModel model = new LoginModel(user);
		LoginView view = new LoginView();
		LoginController controller = new LoginController(view, model);
		

	}

}
