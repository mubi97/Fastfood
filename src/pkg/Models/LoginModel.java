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
	
	public LoginModel(AdminModel admin, OperatorModel operator) {
		this.admin = admin;
		this.operator = operator;
	}
	public int getId() {
		if(type.equals("Admin")) {
			return admin.getId();
		}else {
			return operator.getId();
		}
	}
	public String getName() {
		if(type.equals("Admin")) {
			return admin.getName();
		}else {
			return operator.getName();
		}
	}
	public String getAddress() {
		if(type.equals("Admin")) {
			return admin.getAddress();
		}else {
			return operator.getAddress();
		}
	}
	public String getEmail() {
		if(type.equals("Admin")) {
			return admin.getEmail();
		}else {
			return operator.getEmail();
		}
	}
	public String getPhoneNo() {
		if(type.equals("Admin")) {
			return admin.getPhoneNo();
		}else {
			return operator.getPhoneNo();
		}
	}
	public String getType() {
		return type;
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
	
}
