package jdbc;

import java.sql.*;

public class Leftjoin {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///batch6975", "root", "12345");

			Statement stmt = con.createStatement();
			//SELECT * from orders LEFT JOIN customer ON orders.customerid=customer.customerid UNION SELECT * FROM orders RIGHT JOIN customer ON orders.customerid=customer.id;	
			
	}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

