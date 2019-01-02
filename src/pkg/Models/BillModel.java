package pkg.Models;

import java.util.ArrayList;
/**
 * Bill Model
 * @author mubi
 *
 */
public class BillModel {
	private int id;
	private double totalPrice, tax;
	private ArrayList<ItemModel> items;
	private CustomerModel customer;
	private UtilityModel um;
	/**
	 * Constructor
	 */
	public BillModel() {
		items = new ArrayList<ItemModel>();
		customer = new CustomerModel();
		um = new UtilityModel();
	}
	/**
	 * Add Item to the Cart
	 * @param id Id of Item
	 * @param quantity Quantity of Item
	 */
	public void addItem(int id, int quantity) {
		ItemModel item=new ItemModel();
		item.setId(id);
		item.setQuantity(quantity);
		items.add(item);
		
	}
	/**
	 * Add Sale of the User
	 * @param name Customer Name
	 * @param address Customer Address
	 * @param phoneNumber Customer Phone Number
	 * @return True or False whether query runs successfully
	 */
	public boolean addSale(String name, String address, String phoneNumber) {
		int customerId = customer.addCustomerWithId(name, address, phoneNumber);
		String query = "INSERT INTO bill_detail (c_id) VALUES  ('" + customerId + "');";
		int billId = um.runQueryWithId(query);
		query = "INSERT INTO bill (bill_id, item_id, quantity) VALUES";
		for(ItemModel item: items) {
			query += "('" + billId + "','"+item.getId()+"','"+item.getQuantity()+"'),";
		}
		query = query.substring(0, query.length() - 1);
		return um.runQuery(query);
	}
	/**
	 * Clear all fields of the sales page
	 */
	public void clear() {
		this.id = 0;
		this.totalPrice =0;
		this.tax = 0;
		this.customer = new CustomerModel();
		this.items.clear();
	}
//	public boolean addDeal(String dealName, int price) {
//		this.dealName=dealName;
//		this.price=price;
//		String query= "insert into deal_detail (price) values ('"+this.price+"');";
//		this.id=um.runQueryWithId(query);
//		query="insert into deals (item_id,deal_id,quantity) values ";
//		for(ItemModel item:items) {
//			query+="('"+item.getId()+"','"+this.id+"','"+item.getQuantity()+"'),";
//		}
//		query=query.substring(0,query.length()-1);
//		if (this.id!=0) {
//			return um.runQuery(query);
//		}
//		return false;
//	}
}
