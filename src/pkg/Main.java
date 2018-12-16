package pkg;

import pkg.Models.*;
import pkg.Views.*;

import java.sql.SQLException;

import pkg.Controllers.*;

public class Main {
	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		RoutesController routesController = new RoutesController();
		routesController.goToLogin();
//		goToLogin();

	}

}
