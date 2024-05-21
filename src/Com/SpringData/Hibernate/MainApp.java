package Com.SpringData.Hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {
public static void main(String[]args)  {
	
	String Url="jdbc:mysql://localhost:3306/employee?useSSL=false";
	String username="root";
	String Password="123456789"; 
	
	try {
		Connection connection = DriverManager.getConnection(
				Url , username , Password
				);
		System.out.println("connection !");
		System.out.println(connection);

	} catch (SQLException e) {
		System.out.println(e.toString());
	}
	
}
}
