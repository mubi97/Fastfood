package pkg.Models;

public class ItemModel {
	private int id;
	private String name;
	private int price;
	private UtilityModel um;
	
	public ItemModel() {
		um = new UtilityModel();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean addItem(String name, int price) {
		this.name = name;
		this.price = price;
		String query = "INSERT INTO items (name, price) VALUES ('" + this.name + "'," + this.price + ");";
		return um.runQuery(query);
	}
}
