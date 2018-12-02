/**
 * 
 */
package pkg.Models;

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
	private String type;
		
	public boolean checkLogin(String email, String password) {
		String email1 = "imbilalj@gmail.com";
		String password1 = "12345678";
		
		String email2 = "hamsansari@gmail.com";
		String password2 = "12345678";
		
		if(password.equals(password1) && email.equals(email1)) {
			this.id = 123;
			this.name = "Bilal";
			this.address = "Charsadda";
			this.phoneNo = "03329487904";
			this.email = email1;
			this.type = "Admin";
			return true;
		}
		
		else if(password.equals(password2) && email.equals(email2)) {
			this.id = 124;
			this.name = "Hams";
			this.address = "Peshawar";
			this.phoneNo = "03359819179";
			this.email = email2;
			this.type = "Operator";
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
	
	public String getType() {
		return type;
	}
	
}
