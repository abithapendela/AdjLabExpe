
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Exp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/labp4","root","");
			
			System.out.println("before updating any value the table is in the form:");
			
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery("select * from display");
			
			System.out.println("name\t\t\tmail\t\t\tphoneno\t\t\tpassword");
		
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t" );
			}
			
			
			//update
			
			String q = "update display set name = ? where password = ?";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(q);
			
			//for ? values
			
			ps.setString(1,"Pendela");
			ps.setString(2, "abitha1231");
			
			int up = ps.executeUpdate();
			
			System.out.println("total number of updated rows = " +up);
			
			System.out.println("after updating the table looks like");
			
				//you can thik already befoore updating we print the table there we used statement and resultset so no need to declare twice
			
			//its wrong because there rs pointer is at last if you use the same pointer it wont print any table as boolean value is false
			
			Statement stat = (Statement) con.createStatement();
			ResultSet rse = stat.executeQuery("select * from display");
			
			System.out.println("name\t\t\tmail\t\t\tphoneno\t\t\tpassword");
			
			while(rse.next()) {
				System.out.println(rse.getString(1) + "\t\t" + rse.getString(2) + "\t\t" + rse.getString(3) + "\t\t" + rse.getString(4) + "\t" );
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



/*
 * output:
 * 
 * before updating any value the table is in the form:
name			mail			phoneno			password
Pendela		abithapendela@gmail.com		1234567890		abitha1231	
harshini		harshini@gmail.com		7894563210		harshi1231	
reshmap		reshmap@gmail.com		5548961230		reshmaa123	
total number of updated rows = 1
after updating the table looks like
name			mail			phoneno			password
Pendela		abithapendela@gmail.com		1234567890		abitha1231	
harshini		harshini@gmail.com		7894563210		harshi1231	
reshmap		reshmap@gmail.com		5548961230		reshmaa123	
*/
