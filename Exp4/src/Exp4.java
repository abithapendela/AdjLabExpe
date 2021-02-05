
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
public class Exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/labp4","root","");
		
			
			//execute and display results
			
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery("select * from display");
			
			System.out.println("name\t\t\tmail\t\t\tphoneno\t\t\tpassword");
		
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t" );
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}