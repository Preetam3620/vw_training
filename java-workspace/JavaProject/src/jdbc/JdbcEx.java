package jdbc;
import java.sql.*;
public class JdbcEx {

	public static void main(String[] args) {

		// step1: register driver class with driver manager
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		// step2: ask for sql connection for driver manager
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false","root","pam!@#QW")) {
			
			// step3: get statement obj from connection
			Statement st = con.createStatement();
			
			// step4: execute the query & collect ResultSet
			ResultSet rs = 	st.executeQuery("select studId,studName from students");
			
			// step5: iterate through the ResultSet top fetch rows
			while(rs.next()) {
				
				// step6: use ResultSet - get(columnNo) to fetch column value
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println("id="+id+" name="+name);
				
			}
			
//			rs.close();
//			st.close();
			
			// connection will autoclose (try with resource is used) 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
