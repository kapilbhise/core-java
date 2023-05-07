package jdbcconcepts;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;

public class CallableStatementAPIWorking {
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
		
		CallableStatement cStmt=null;
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		Savepoint sp=null;
		Scanner sc= new Scanner(System.in);
		
		try {
		
			System.out.println("Please enter employee id :");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("Please enter first name of employee");
			String firstName=sc.nextLine();
			System.out.println("Please enter last name of employee");
			String lastName=sc.nextLine();
			System.out.println("Please enter designation of employee");
			String designation=sc.nextLine();
			
			
			String url="jdbc:mysql://localhost:3306/hplus?autoReconnect=true&useSSL=false&user=root&password=root";
			conn=DriverManager.getConnection(url);
			
			cStmt=conn.prepareCall("{call insertEmployeeRecord(?,?,?,?,?)};");
			cStmt.setInt(1, id);
			cStmt.setString(2,firstName);
			cStmt.setString(3,lastName);
			cStmt.setString(4,designation);
			
			cStmt.registerOutParameter(5,java.sql.Types.VARCHAR);
			
			cStmt.executeUpdate();
			String result= cStmt.getString(5);
			System.out.println("Employee record update status :"+result);
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				cStmt.close();
				conn.close();
				sc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

}


/*
 
 // creating a stored procedure
delimiter //;
create procedure hplus.insertEmployeeRecord
( IN in_id int,
IN in_first_name varchar(200),
IN in_last_name varchar(200),
IN in_designation varchar(200),
out out_result varchar(25))
begin 
	insert into hplus.employee(id, first_name, last_name,designation) 
    values (in_id, in_first_name, in_last_name, in_designation);
    commit;
    set out_result:='true';
end;

//dropping a stored procedure
drop procedure hplus.insertEmployeeRecord;

*/