package pkg.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemModel {
	private int id;
	private String name;
	private int price, quantity;
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
	public String getName() {
		return name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return Integer.toString(price);
	}
	public int getId() {
		return this.id;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public ArrayList<ItemModel> getProducts() throws SQLException {
		String query = "SELECT * FROM items;";
		ArrayList<ItemModel> itemList = new ArrayList<ItemModel>();
		ResultSet result =  um.selectQuery(query);
		while(result.next()) {
			ItemModel item = new ItemModel();
			item.id = result.getInt("id");
			item.name = result.getString("name");
			item.price = result.getInt("price");
			itemList.add(item);
		}
		return itemList;
	}
	
	public boolean getProductInfo(String product, int id, int price) throws SQLException {
		String query = "SELECT * FROM items WHERE name = '" + product + "'";
		ResultSet result =  um.selectQuery(query);
		if(result.next()) {
			id = result.getInt("id");
			price = result.getInt("price");
			return true;
		}
		else
			return false;
	}
	
	public boolean addItem(String name, int price) {
		this.name = name;
		this.price = price;
		String query = "INSERT INTO items (name, price) VALUES ('" + this.name + "'," + this.price + ");";
		return um.runQuery(query);
	}

}
