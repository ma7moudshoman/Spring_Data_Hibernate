package Com.SpringData.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.SpringData.Hibernate.model.Client;

public class MainApp {
public static void main(String[]args)  {
	
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Client.class)
			.buildSessionFactory();
	 
    Session session=factory.getCurrentSession();

	
	
	/*String Url="jdbc:mysql://localhost:3306/employee?useSSL=false";
	String username="root";
	String Password="123456789"; 
	
	try {
		Connection connection = DriverManager.getConnection(
				Url , username , Password
				);
		System.out.println("connection ");
		System.out.println(connection);

	} catch (SQLException e) {
		System.out.println(e.toString());
	}
	*/
}
}
