package jdbcconcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectWithJDBC {
	// driver that we need to connect to db
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
		
		Connection conn1=null;
		Connection conn2=null;

		try {
//			jdbc:mysql://localhost:3306/hplus?autoReconnect=true&useSSL=false
			String url="jdbc:mysql://localhost:3306/hplus?autoReconnect=true&useSSL=false&user=root&password=root";
			conn1=DriverManager.getConnection(url);
			if(conn1!=null) {
				System.out.println("Connected to Database...Connection1");
			}
			
			Statement statement;
            statement = conn1.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from product where name like 'protein%'");
            int id;
            String name;
            String image_path;

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = resultSet.getString("name").trim();
                image_path = resultSet.getString("image_path").trim();
                
                System.out.println(id
                        + "  " + name+ "  "+ image_path);
            }
            resultSet.close();
            statement.close();
            conn1.close();
			
//			String partUrl="jdbc:mysql://localhost:3306/hplus";
//			String username="root";
//			String password="root";
//			conn2=DriverManager.getConnection(partUrl,username, password);
//			if(conn2!=null) {
//				System.out.println("Connected to Database...connection2");
//			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
            try {

 

                if (conn1 != null) {
                    conn1.close();
                }
                if (conn2 != null) {
                    conn2.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}

}
