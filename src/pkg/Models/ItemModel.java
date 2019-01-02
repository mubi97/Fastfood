package pkg.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Item Model
 * @author mubi
 *
 */
public class ItemModel {
	private int id;
	private String name;
	private int price, quantity;
	private UtilityModel um;
	/**
	 * Constructor
	 */
	public ItemModel() {
		um = new UtilityModel();
	}
	/**
	 * Setter Function
	 * @param id Id Of the Item
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Setter Function
	 * @param name Name of the Item
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Setter Function
	 * @param price Price of Item
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * Getter Function
	 * @return Name of the Item
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter Function
	 * @param quantity Quantity of Item
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * Getter Function
	 * @return Price of the Item
	 */
	public String getPrice() {
		return Integer.toString(price);
	}
	/**
	 * Getter Function
	 * @return ID of the Item
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * Getter Function
	 * @return Quantity of the Item
	 */
	public int getQuantity() {
		return this.quantity;
	}
	/**
	 * Getter Function
	 * @return All Products
	 * @throws SQLException
	 */
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
	/**
	 * Getter Function
	 * @param product Product Name
	 * @param id Id of the item
	 * @param price Price of the item
	 * @return result of query
	 * @throws SQLException
	 */
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
	/**
	 * Add Item to database
	 * @param name Name of the Product
	 * @param price Price of the Product
	 * @return result of the query
	 */
	public boolean addItem(String name, int price) {
		this.name = name;
		this.price = price;
		String query = "INSERT INTO items (name, price) VALUES ('" + this.name + "'," + this.price + ");";
		return um.runQuery(query);
	}

}
