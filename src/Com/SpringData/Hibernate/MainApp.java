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

   long id=7;
    try {
		session.beginTransaction();
	/*Client clientsession.get(Client.class, id);
	client.setFullName("ahmed");
	client.setAge(55);
	client.setAddress("october");*/
		
		
		
		//       Update 
		/*Client client=new Client("soha", 25,"el shohada");
		client.setId((long) 4);

		session.update(client);
		
		session.getTransaction().commit();
		
		*/
		      //  delete   
		        

		  Client client=new Client();
		client.setId(id);

		session.delete(client);
		
		session.getTransaction().commit();
		

		/*
		Client client =new Client();
		Client client1=new Client("MAhmoud", 26, "Alix");
		   client1.setId((long) 1);
		   

		   Client client2=new Client("Mohand", 18, "Cairo");
		  client2.setId((long) 2);

		  Client client3=new Client("Masen", 5, "here");
		 client3.setId((long) 3);
		  Client client4=new Client("sara", 62, "there");
			 client4.setId((long) 4);

			session.save(client1);
			session.save(client2);
			session.save(client3);
			session.save(client4);
			session.beginTransaction().commit();*/

	System.out.println(client.getFullName() + " " + client.getAddress());
    } catch (Exception e) {
		System.out.println(e.toString());
		// TODO: handle exception
	}finally {
		session.close();
	}      
    
}
/*
                select
              
 * Client client1=new Client("MAhmoud", 26, "Alix");
  // client1.setId((long) 1);
   

   Client client2=new Client("Mohand", 18, "Cairo");
  //client2.setId((long) 2);

  Client client3=new Client("Masen", 5, "here");
 //client3.setId((long) 3);
  Client client4=new Client("sara", 62, "there");

 * */
	
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

