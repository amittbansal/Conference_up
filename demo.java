package conference_Up;

import java.sql.*;
public class demo { 
	public static void main(String[] args) throws SQLException {
	
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try{
			
		   myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/conference_up", "root", "root");
		   
		   myStmt = myConn.createStatement();
		   
		   myRs=myStmt.executeQuery("select * from login_check");
		
		   while (myRs.next()) {
			    System.out.println(myRs.getString("password")+", "+ myRs.getString("User_name")+","+myRs.getInt("User_id"));
		   }
		}
		
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		finally {
			if  (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}
}
