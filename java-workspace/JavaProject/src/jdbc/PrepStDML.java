package jdbc;
import java.sql.*;
import java.util.Scanner;
public class PrepStDML {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false","root","pam!@#QW")) {
			PreparedStatement pst = 
					con.prepareStatement("update students "
							+ "set studName=? "
							+ "where studId=?");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter student id");
			int id = sc.nextInt();
			System.out.println("Enter name to update for id="+id);
			String name = sc.next();
			
			pst.setString(1, name);
			pst.setInt(2, id);
			
			int rowsUpdated = pst.executeUpdate();
			System.out.println("No. of rows updated: "+rowsUpdated);
			
			sc.close();
			pst.close();
			
			
			
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
