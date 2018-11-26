/**
 * 
 */
package pkg.Models;

/**
 * @author Hams Ansari
 *
 */
public class AdminModel {

	private int id;
	private String name;
	private String address;
	private String phoneNo;
	private String email;
	
	public boolean checkLogin(String email, String password) {
		String email1 = "imbilalj@gmail.com";
		String password1 = "12345678";
		
		if(password.equals(password1) && email.equals(email1)) {
			this.id = 123;
			this.name = "Bilal";
			this.address = "Charsadda";
			this.phoneNo = "03329487904";
			this.email = email1;
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
}
