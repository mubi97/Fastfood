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
		String email1 = "something@gmail.com";
		String password1 = "12345678";
		
		if(password == password1 && email == email1) {
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
	
}
