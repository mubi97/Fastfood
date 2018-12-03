/**
 * 
 */
package pkg.Models;

import java.sql.ResultSet;

/**
 * @author Hams Ansari
 *
 */
public class UserModel {

	private int id;
	private String name;
	private String address;
	private String phoneNo;
	private String email;
	private boolean type;
	private ResultSet result;
	private UtilityModel um;
	
	public UserModel() {
		um = new UtilityModel();
	}
		
	public boolean checkLogin(String email, String password) {
		String query = "SELECT * FROM users WHERE email='" + email +"' AND password='" + password +"'";
		result = um.selectQuery(query);
		
		if(result.next()) {
			this.id = result.getInt("id");
			this.name = result.getString("name");
			this.address = result.getString("address");
			this.phoneNo = result.getString("phone");
			this.email = result.getString("email");
			this.type = result.getBoolean("type");
			return true;
		}
		else
			return false;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public boolean getType() {
		return type;
	}
	
}
