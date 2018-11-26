/**
 * 
 */
package pkg.Models;

/**
 * @author Bilal Javed
 *
 */
public class LoginModel {


	private String type;
	private AdminModel admin;
	private OperatorModel operator;
	
	public void LoginModel(AdminModel admin, OperatorModel operator) {
		this.admin = admin;
		this.operator = operator;
	}
	public String checkLogin(String email,String password) {
			
		if (admin.checkLogin(email,password)){
			type = "Admin";
			return type; 
		}
		
		else if (operator.checkLogin(email,password)) {
			type = "Operator";
			return type;
		}
		else 
			return "Error";
	}		
	
>>>>>>> branch 'master' of https://github.com/mubi97/Fastfood.git
}
