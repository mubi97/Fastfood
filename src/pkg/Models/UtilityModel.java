package pkg.Models;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * Utility Class
 * @author mubi
 *
 */
public class UtilityModel {
	private Connection con;
	private String url = "jdbc:mysql://localhost/fastfood";
	private String user = "root";
	private String pass = "";
	private Statement state;
	private ResultSet result;
	/**
	 * Create New Connection with the database
	 */
	public void connection() {
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
			String msg = "Database Connection Failed!\nDetail: " + e.toString();
			JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	/**
	 * Run Select Query
	 * @param query Query that is to execute
	 * @return Resultset of the query
	 */
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
	/**
	 * Execute Query
	 * @param query Query to be executed
	 * @return Result of query in terms of boolean
	 */
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
	/**
	 * Execute Query
	 * @param query Query to be Executed
	 * @return Id of the insert query
	 */
	public int runQueryWithId(String query) {
		connection();
		try {
			state = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		try {
			
			int key=state.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
			ResultSet rs=state.getGeneratedKeys();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return 0 ;
		}
		return 0;
	}


}
