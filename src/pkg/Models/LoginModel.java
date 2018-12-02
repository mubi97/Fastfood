/**
 * 
 */
package pkg.Models;

/**
 * @author Bilal Javed
 *
 */
public class LoginModel {
	
	private UserModel user;
		
	public LoginModel(UserModel user) {
		this.user = user;
		
	}
	
	public Boolean checkLogin(String email,String password) {
		
		if (user.checkLogin(email,password)){
			return true; 
		}
		/*
		else if (operator.checkLogin(email,password)) {
			type = "Operator";
			return true;
		}
		*/
		else 
			return false;
	}	
	
	
	
	public int getId() {
		if(user.getType().equals("Admin")) {
			return user.getId();
		}else {
			return user.getId();
		}
	}
	public String getName() {
		if(user.getType().equals("Admin")) {
			return user.getName();
		}else {
			return user.getName();
		}
	}
	public String getAddress() {
		if(user.getType().equals("Admin")) {
			return user.getAddress();
		}else {
			return user.getAddress();
		}
	}
	public String getEmail() {
		if(user.getType().equals("Admin")) {
			return user.getEmail();
		}else {
			return user.getEmail();
		}
	}
	public String getPhoneNo() {
		if(user.getType().equals("Admin")) {
			return user.getPhoneNo();
		}else {
			return user.getPhoneNo();
		}
	}
	public String getType() {
		return user.getType();
	}
		
	
}
