/**
 * 
 */
package pkg.Models;

import java.sql.SQLException;

/**
 * @author Bilal Javed
 *
 */
public class LoginModel {
	
	private UserModel user;
		
	public LoginModel(UserModel user) {
		this.user = user;
		
	}
	
	public Boolean checkLogin(String email,String password) throws SQLException {
		
		if (user.checkLogin(email,password)){
			return true; 
		}
		else 
			return false;
	}	
	
	
	
	public int getId() {
		return user.getId();
	}
	public String getName() {
		return user.getName();
	}
	
	public String getEmail() {
		return user.getEmail();
	}
	public String getPhoneNo() {
		return user.getPhoneNo();
	}
	public boolean getType() {
		return user.getType();
	}
		
	
}
