package jdbcconcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

//we use prepared statments when we need to pass the arguments at runtime
public class PreparedStatementAPIWorking {

	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Savepoint sp=null;
		
		try {
		
			String url="jdbc:mysql://localhost:3306/hplus?autoReconnect=true&useSSL=false&user=root&password=root";
			conn=DriverManager.getConnection(url);
//			conn.setAutoCommit(false);

			//? is wild card in generics
			//? is placeholder or place marker in jdbc
			// 2 arguments runtime
			String query="Update employee set first_name=? where id=?";
			ps=conn.prepareStatement(query);	
			ps.setString(1, "PQ");
			ps.setInt(2, 110);
			
			int rows=ps.executeUpdate();
			
			String query2= "select * from employee	where id=?";
			ps=conn.prepareStatement(query2);
			
			ps.setInt(1, 110);
			rs=ps.executeQuery();
			
			System.out.println("Id\t first_name\t last_name\t designation");
			System.out.println("----------------------------------");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
