package jdbc;

import java.sql.*;

public class Innerjoin {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///batch6975", "root", "12345");

			Statement stmt = con.createStatement();
			String query = "select orders.orderid,customer.customername from orders INNER JOIN customer ON orders.customerid = customer.customerid;";

			ResultSet result = stmt.executeQuery(query);
			
			while (result.next()) {
				System.out.println(result.getInt(1) + "        " + result.getString(2));
			}
		} 
		
		    catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

