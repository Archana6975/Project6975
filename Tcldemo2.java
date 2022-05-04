package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Tcldemo2 {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql:///batch6975", "root", "12345");
			
			con.setAutoCommit(false);
			
			Statement stmt = con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			
			  //String query =  "create table Employees11(id int,name varchar(15),position varchar(20))";
			 

			String query = "INSERT INTO Employees11 " +"VALUES (1,'mahi','manager')"; 
			stmt.executeUpdate(query);
			System.out.println("commit/rollback");
			String answer = sc.nextLine();
			
			if (answer.equals("commit")) {
				con.commit();
				System.out.println("Table is updated");
			}
			
			if (answer.equals("rollback")) {
				con.rollback();
				System.out.println("Changes are undone");
			}	
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
