package pkg.Models;

public class Items {
	private String productName;
	private String price;
	
	
	public void setItem(String productName, String price) {
		this.productName=productName;
		this.price=price;
	}
	public String getProductName() {
		return this.productName;
	}
	public String getPrice() {
		return this.price;
	}
	

}
