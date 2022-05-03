//Java program to demonstrate how to make a save point

package jdbc;
import java.io.*;
import java.sql.*;

public class Tcldemo3 {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql:///batch6975", "root", "12345");

			con.setAutoCommit(false);

			Statement stmt = con.createStatement();

			// construct a query

			String deleteQuery = "DELETE FROM Employees WHERE id=105";

			// Disable auto commit to connection

			

			// Create a savepoint object before executing the
			// deleteQuery

			Savepoint beforeDeleteSavepoint = con.setSavepoint();

			// Executing the deleteQuery

			stmt.executeUpdate(deleteQuery);

			// Rollback to our beforeDeleteSavepoint

			con.rollback(beforeDeleteSavepoint);

			con.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
