package pkg.Models;
/**
 * Items Class
 * @author mubi
 *
 */
public class Items {
	private String productName;
	private String price;
	
	/**
	 * Setter Function
	 * @param productName Name of the Item
	 * @param price Price of the Item
	 */
	public void setItem(String productName, String price) {
		this.productName=productName;
		this.price=price;
	}
	/**
	 * Getter Function
	 * @return Name of the Product
	 */
	public String getProductName() {
		return this.productName;
	}
	/**
	 * Getter Function
	 * @return Price of the Item
	 */
	public String getPrice() {
		return this.price;
	}
	

}
