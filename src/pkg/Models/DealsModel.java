package pkg.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DealsModel {
	private int id;
	private double price;
	private String dealName;
	private UtilityModel um;
	ArrayList<ItemModel> items;
	public DealsModel() {
		items=new ArrayList();
		um=new UtilityModel();
		
		
	}
	public void addItem(int id, int quantity) {
		ItemModel item=new ItemModel();
		item.setId(id);
		item.setQuantity(quantity);
	items.add(item);
		
	}
	public double getPrice() {
		return this.price;
	}
	public String getDealName() {
		return this.dealName;
	}
	public void clear() {
		this.id = 0;
		this.price =0;
		this.dealName = "";
		this.items.clear();
	}
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
