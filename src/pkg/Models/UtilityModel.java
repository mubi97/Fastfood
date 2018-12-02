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
		state = con.createStatement();
		result = state.executeQuery(query);
		return result;
	}

}
