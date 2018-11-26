
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
	private boolean featured;
	
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
