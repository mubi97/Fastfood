
/**
 * 
 */
package pkg.Models;

/**
 * @author Bilal Javed
 *
 */
public class CustomerModel {
	private int id;
	private String name;
	private int points;
	private String address;
	private String phoneNumber;
	private boolean featured;
	private UtilityModel um;
	public CustomerModel() {
		um = new UtilityModel();
	}
	public boolean addCustomer(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		String query = "INSERT INTO customers (name, address, phone) VALUES ('" + this.name +"','" + this.address +"','" + this.phoneNumber +"'";
		return um.runQuery(query);
		
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public void setAddress(String address ) {
		this.address = address;
	}
	
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	

}
