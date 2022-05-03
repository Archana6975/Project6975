package jdbc;
import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///batch6975", "root", "12345");
			
			Statement stmt = con.createStatement();
			
			/*
			 * String query
			 * ="create table student2(id int,name varchar(15),bloodgroup varchar(20))";
			 * 
			 * stmt.executeUpdate(query);
			 * 
			 * System.out.println("Table is created");
			 */
			 
		
			/*
			 * //insert records String query =
			 * "insert into student2 values(101,'Ravi','o negative')";
			 * 
			 * int status = stmt.executeUpdate(query); if(status>0) {
			 * System.out.println("Record inserted"); } else{ System.out.println("Error"); }
			 */
			 
			 
			
			
			  /*//Extracting records 
			String query = "select * from student2";
			ResultSet rs =  stmt.executeQuery(query); while(rs.next()) {
			  System.out.println("Id=="+rs.getInt("id")+"----Name--"+rs.getString("name")+
			  "----BloodGroup--"+rs.getString("bloodgroup")+"----Contact--"+rs.getString(
			  "contact")); }
			 */
			
			
			  //to enter values at runtime 
			  String query = "insert into student2(id,name,bloodgroup) values(?,?,?)";
			  PreparedStatement pstmt = con.prepareStatement(query);
			  pstmt.setInt(1,101);
			  pstmt.setString(2,"Kumaran"); 
			  pstmt.setString(3,"o postive"); 
			  int i = pstmt.executeUpdate();
			   if(i>0) {
			  System.out.println("Inserted");
			   }
			 
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
