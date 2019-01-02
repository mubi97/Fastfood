/**
 * 
 */
package pkg.Models;

import java.sql.SQLException;

/**
 * Login Model
 * @author Bilal Javed
 *
 */
public class LoginModel {
	
	private UserModel user;
	/**
	 * Constructor	
	 * @param user User Model
	 */
	public LoginModel(UserModel user) {
		this.user = user;
		
	}
	/**
	 * Authenticate User
	 * @param email Email of the User
	 * @param password Password of the User
	 * @return result of the query
	 * @throws SQLException
	 */
	public Boolean checkLogin(String email,String password) throws SQLException {
		
		if (user.checkLogin(email,password)){
			return true; 
		}
		else 
			return false;
	}	
	
	/**
	 * Get ID of the User
	 * @return ID of the User
	 */
	
	public int getId() {
		return user.getId();
	}
	/**
	 * Getter Function
	 * @return Name of the User
	 */
	public String getName() {
		return user.getName();
	}
	/**
	 * Getter Function
	 * @return Email of the User
	 */
	public String getEmail() {
		return user.getEmail();
	}
	/**
	 * Getter Function
	 * @return Phone No of the User
	 */
	public String getPhoneNo() {
		return user.getPhoneNo();
	}
	/**
	 * Getter Function
	 * @return Type of the User
	 */
	public boolean getType() {
		return user.getType();
	}
		
	
}
