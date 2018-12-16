package pkg.Models;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UtilityModel {
	private Connection con;
	private String url = "jdbc:mysql://localhost/fastfood";
	private String user = "root";
	private String pass = "";
	private Statement state;
	private ResultSet result;
	
	public void connection() {
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
			String msg = "Database Connection Failed!\nDetail: " + e.toString();
			JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public ResultSet selectQuery(String query) {
		connection();
		try {
			state = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			result = state.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean runQuery(String query) {
		connection();
		try {
			state = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			state.executeUpdate(query);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
		
		return true;
	}

}
