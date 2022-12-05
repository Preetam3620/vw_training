package jdbc;
import java.sql.*;
public class JdbcPreparedStEx {

	public static void main(String[] args) {		
		// step1: register driver class with driver manager
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		// step2: ask for sql connection for driver manager
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false","root","pam!@#QW")) {
			// step3: get prepared statement obj from connection & pre compiled query
			PreparedStatement st = con.prepareStatement("Select studId,studName from students where studId=? and studName=?");
			st.setInt(1,2);
			st.setString(2, "Rohan");
			
			// step4: execute the query & collect ResultSet
			ResultSet rs = 	st.executeQuery();
			
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
