/**
 * 
 */
package pkg.Models;

/**
 * @author Hams Ansari
 *
 */
public class OperatorModel{
	
	private int id;
	private String name;
	private String address;
	private String phoneNo;
	private String email;
	
	public boolean checkLogin(String email, String password) {
		String email1 = "hamsansari@gmail.com";
		String password1 = "12345678";
		
		if(password.equals(password1) && email.equals(email1)) {
			this.id = 124;
			this.name = "Hams";
			this.address = "Peshawar";
			this.phoneNo = "03326571232";
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
	
	public String getPhoneNo(){
		return phoneNo;
	}
	
	public String getEmail(){
		return email;
	}
}
