import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatingInfo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				//1.get connection to db
				Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentlist","root","sateesh");
				//2.create statement
				Statement myStmt=myConn.createStatement();
				//updating information
				
				/*String sql="update studentdetails   set email='sachin@masterblaster'   where id=1";
				myStmt.executeUpdate(sql);*/
				
				String sql2="update studentdetails   set email='virat@youngblaster'   where id=2";
				String sql3="update studentdetails   set email='hit@masterblaster'   where id=3";
				String sql4="update studentdetails   set email='finishing@masterblaster'   where id=4";
				
				myStmt.executeUpdate(sql2);
				myStmt.executeUpdate(sql3);
				myStmt.executeUpdate(sql4);
				
				System.out.println("update complete");
				
			}catch(Exception e) {
				e.printStackTrace();}
	}
}
