package pkg.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Deals Model
 * @author mubi
 *
 */
public class DealsModel {
	private int id;
	private double price;
	private String dealName;
	private UtilityModel um;
	ArrayList<ItemModel> items;
	/**
	 * Constructor
	 */
	public DealsModel() {
		items=new ArrayList();
		um=new UtilityModel();
		
		
	}
	/**
	 * Add Item to the cart
	 * @param id Id of the item
	 * @param quantity Quantity of the item
	 */
	public void addItem(int id, int quantity) {
		ItemModel item=new ItemModel();
		item.setId(id);
		item.setQuantity(quantity);
	items.add(item);
		
	}
	/**
	 * Getter Function
	 * @return Price of Item
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * Getter Function
	 * @return Name of the Deal
	 */
	public String getDealName() {
		return this.dealName;
	}
	/**
	 * Clear the cart
	 */
	public void clear() {
		this.id = 0;
		this.price =0;
		this.dealName = "";
		this.items.clear();
	}
	/**
	 * Get All Deals
	 * @return All Deals
	 * @throws SQLException
	 */
	public ArrayList<DealsModel> getDeals() throws SQLException {
		String query = "SELECT * FROM deal_detail;";
		ArrayList<DealsModel> dealList = new ArrayList<DealsModel>();
		ResultSet result =  um.selectQuery(query);
		while(result.next()) {
			DealsModel deal = new DealsModel();
			deal.id = result.getInt("id");
			deal.dealName = "Deal Number "+result.getString("id");
			deal.price = result.getInt("price");
			dealList.add(deal);
		}
		return dealList;
	}
	/**
	 * Add New Deal
	 * @param dealName Name of the Deal
	 * @param price Price of the Deal
	 * @return Result of query
	 */
	public boolean addDeal(String dealName, int price) {
		this.dealName=dealName;
		this.price=price;
		String query= "insert into deal_detail (price) values ('"+this.price+"');";
		this.id=um.runQueryWithId(query);
		query="insert into deals (item_id,deal_id,quantity) values ";
		for(ItemModel item:items) {
			query+="('"+item.getId()+"','"+this.id+"','"+item.getQuantity()+"'),";
		}
		query=query.substring(0,query.length()-1);
		if (this.id!=0) {
			return um.runQuery(query);
		}
		return false;
	}
}
