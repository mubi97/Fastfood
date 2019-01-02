
/**
 * 
 */
package pkg.Models;

/**
 * Customer Model
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
	/**
	 * Constructor
	 */
	public CustomerModel() {
		um = new UtilityModel();
	}
	/**
	 * Add New Customer
	 * @param name Name of the Customer
	 * @param address Address of the Customer
	 * @param phoneNumber Phone Number of the Customer
	 * @return result of query
	 */
	public boolean addCustomer(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		String query = "INSERT INTO customers (name, address, phone, points) VALUES ('" + this.name +"','" + this.address +"','" + this.phoneNumber +"', 0);";
		return um.runQuery(query);
		
	}
	/**
	 * Add New Customer
	 * @param name Name of the Customer
	 * @param address Address of the Customer
	 * @param phoneNumber Phone Number of the Customer
	 * @return id of the customer added
	 */
	public int addCustomerWithId(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		String query = "INSERT INTO customers (name, address, phone, points) VALUES ('" + this.name +"','" + this.address +"','" + this.phoneNumber +"', 0);";
		return um.runQueryWithId(query);
		
	}
	/**
	 * Setter Function
	 * @param id Id of the Customer
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Setter Function
	 * @param name Name of the Customer
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Setter Function
	 * @param points Points of the Customer
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	/**
	 * Setter Function
	 * @param address Address of the Customer
	 */
	public void setAddress(String address ) {
		this.address = address;
	}
	/**
	 * Setter Function
	 * @param featured Featured of the Customer
	 */
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	

}
