/**
 * 
 */
package pkg.Models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * User Model
 * @author Hams Ansari
 *
 */
public class UserModel {

	private int id;
	private String name;
	private String phoneNo;
	private String email;
	private boolean type;
	private ResultSet result;
	private UtilityModel um;
	/**
	 * Constructor
	 */
	public UserModel() {
		um = new UtilityModel();
	}
	/**
	 * Authenticate User
	 * @param email Email of the User
	 * @param password Password of the User
	 * @return Result of the Query
	 * @throws SQLException
	 */
	public boolean checkLogin(String email, String password) throws SQLException {
		String query = "SELECT * FROM users WHERE email='" + email +"' AND password='" + password +"'";
		result = um.selectQuery(query);
		
		if(result.next()) {
			this.id = result.getInt("id");
			this.name = result.getString("name");
			this.phoneNo = result.getString("phone");
			this.email = result.getString("email");
			this.type = result.getBoolean("type");
			return true;
		}
		else
			return false;
	}
	/**
	 * Getter Function
	 * @return ID of the User
	 */
	public int getId() {
		return id;
	}
	/**
	 * Getter Function
	 * @return Name of the User
	 */
	public String getName() {
		return name;
	}
	/**
	 * Getter Function
	 * @return Phone No of the User
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * Getter Function
	 * @return Email of the User
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Getter Function
	 * @return Type of the User
	 */
	public boolean getType() {
		return type;
	}
	/**
	 * Add New User
	 * @param name Name of the User
	 * @param email Email of the User
	 * @param phoneNumber Phone Number of the User
	 * @param password Password of the User
	 * @param type Type of the User
	 * @return result of the Query
	 */
	public boolean addUser(String name, String email, String phoneNumber, String password, int type) {
		String query = "INSERT INTO `users` (`name`, `phone`, `email`, `password`, `type`) VALUES ('" + name + "', '" + phoneNumber + "', '" + email + "', '" + password + "', " + type  + ")";
		return um.runQuery(query);
	}
	
	
}
