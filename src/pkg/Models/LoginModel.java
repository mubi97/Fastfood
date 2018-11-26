/**
 * 
 */
package pkg.Models;

/**
 * @author Bilal Javed
 *
 */
public class LoginModel {
	private int id;
	private String email;
	private String type;
	private AdminModel admin;
	private OperatorModel operator;
	
	public void checkType() {
		if (admin.checkLogin("something@gmail.com","12345678")){
			type = "Admin";
		}
		
		else{
			type = "Operator";
		}		
	}		
}
