package jdbcconcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Savepoint;


public class CRUDWithhDB {

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
		Statement stmt=null;
		ResultSet rs=null;
		Savepoint sp=null;
		
		try {
			
			
			String url="jdbc:mysql://localhost:3306/hplus?autoReconnect=true&useSSL=false&user=root&password=root";
			conn=DriverManager.getConnection(url);
			conn.setAutoCommit(false);
			stmt=conn.createStatement();
			
			int i;
			
			String query2="CREATE TABLE EMPLOYEE("
					+" ID INT NOT NULL, "
					+" FIRST_NAME VARCHAR(200), "
					+" LAST_NAME VARCHAR(200), "
					+" DESIGNATION VARCHAR(200))";
			i=stmt.executeUpdate(query2);
			if(i==0) {
				System.out.println("Table created Successfully");
			}
			else {
				System.out.println("Table could not be created");
			}
			
			System.out.println("----------------------------------");
			
			String query3="insert into employee values( 110,'A','B','Software Engineer')";
			i=stmt.executeUpdate(query3);
			if(i!=0) {
				System.out.println("Record is successfully added in table");
			}
			else {
				System.out.println("Record or a row is not added in table");
			}
			sp=conn.setSavepoint("Savepoint stage 1");
			
			
			String query4="select * from employee";
			rs=stmt.executeQuery(query4);
			while(rs.next()) {
				System.out.println("Id :"+ rs.getInt(1));
				System.out.println("First Name :"+ rs.getString(2));
				System.out.println("Last Name :"+ rs.getString(3));
				System.out.println("Designation :"+ rs.getString(4));
				
			}
			System.out.println("----------------------------------");
			
			String query5="update employee set first_name='x', last_name='y' where designation='Software Engineer'";
			i=stmt.executeUpdate(query5);
			if(i!=0) {
				System.out.println("Record is Updated successfully");
			}
			else {
				System.out.println("Record is not Updated");
			}
			query4="select * from employee";
			rs=stmt.executeQuery(query4);
			while(rs.next()) {
				System.out.println("Id :"+ rs.getInt(1));
				System.out.println("First Name :"+ rs.getString(2));
				System.out.println("Last Name :"+ rs.getString(3));
				System.out.println("Designation :"+ rs.getString(4));
				
			}
			System.out.println("----------------------------------");
			
			String query6="delete from employee where id=110";
			i=stmt.executeUpdate(query6);
			if(i!=0) {
				System.out.println("Record is deleted successfully");
			}
			else {
				System.out.println("Record is not deleted");
			}
			
			System.out.println("----------------------------------");
			
			String query1=" DROP TABLE EMPLOYEE ";
			i=stmt.executeUpdate(query1);
			if(i==0) {
				System.out.println("Table successfully dropped");
			}
			else {
				System.out.println("Table does not exist");
			}
			System.out.println("----------------------------------");
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			try {
				if(sp==null) {
					conn.rollback();
					System.out.println("Connections rolled back successfully");
					
				}
				else {
					conn.rollback(sp);
					conn.commit();
					
				}
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
            try {
                if (conn != null) {
                	conn.commit();
                    conn.close();
                    rs.close();
                } 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		
		
		
		
		
	}

}
