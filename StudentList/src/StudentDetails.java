import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				//1.get connection to db
				Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentlist","root","sateesh");
				//2.create statement
				Statement myStmt=myConn.createStatement();
				//3.execute query
				//String sql="insert into studentdetails" + "(ID,First_name,Last_name,DOB,Email)" + " values ('1','sachin','tendulkar','24th april','sachin@indiancricketer.com')";
				String sql2="insert into studentdetails" + "(ID,First_name,Last_name,DOB,Email)" + " values ('2','kohli','virat','25th aug','kohli@indiancricketer.com')";
				String sql3="insert into studentdetails" + "(ID,First_name,Last_name,DOB,Email)" + " values ('3','rohit','sharma','30th march','rohit@indiancricketer.com')";
				String sql4="insert into studentdetails" + "(ID,First_name,Last_name,DOB,Email)" + " values ('4','dhoni','MS','26th april','dhoni@indiancricketer.com')";
				String sql5="insert into studentdetails" + "(ID,First_name,Last_name,DOB,Email)" + " values ('5','David','Warner','28th april','warner@AUScricketer.com')";
				//myStmt.executeUpdate(sql);
				myStmt.executeUpdate(sql2);
				myStmt.executeUpdate(sql3);
				myStmt.executeUpdate(sql4);
				myStmt.executeUpdate(sql5);
				//4.process Result set
				System.out.println("insert complete");
				
			}catch(Exception e) {
				e.printStackTrace();}
		}

	}
 
