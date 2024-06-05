package Com.SpringData.Hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.SpringData.Hibernate.model.Client;

public class MainApp {
@SuppressWarnings("unchecked")
public static void main(String[]args)  {
	
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Client.class)
			.buildSessionFactory();
	
	
	
    Session session=factory.getCurrentSession();

    
    /*
    
    
     * start  s%
     * end with  %s
     * any     %s%
     
     
     */
    
    
   int id = 1;
    try {
    	
		session.beginTransaction();
		Query q =session .createQuery("select Max (id) from Client");
		Query q1 =session .createQuery("select Min (id) from Client");
		Query q2 =session .createQuery("select Sum (id) from Client");
		Query q3 =session .createQuery("select Avg (age) from Client");
		Query q4 =session .createQuery("select count (fullName) from Client");
		Query q5 =session .createQuery("select count (distinct address) from Client");

		
		
		
		
		System.out.println("Max : "+q.list().get(0));
		System.out.println("min : "+q1.list().get(0));
		System.out.println("sum : "+q2.list().get(0));
		System.out.println("average : "+q3.list().get(0));
		System.out.println("average : "+q4.list().get(0));
		System.out.println("average : "+q5.list().get(0));

		/*for(int i=0;i<clients.size();i++){
			System.out.println(clients.get(i).getAddress() +" "+ clients.get(i).getAge());
		}
		/*             Update 
		 * session.createQuery("update Client set age=26 where id=1")
		.executeUpdate();
		
		 * for(int i=0;i<clients.size();i++){
			System.out.println(clients.get(i).getAddress() +" "+ clients.get(i).getAge());
		}*/
		//System.out.println(client.getFullName() + " " + client.getAddress());
    } catch (Exception e) {
		System.out.println(e.toString());
		// TODO: handle exception
	}finally {
		session.close();
	}  
    
    
    
    
    
    
    
    
    
	/*Client clientsession.get(Client.class, id);
	client.setFullName("ahmed");
	client.setAge(55);
	client.setAddress("october");*/
		
		/*
		 * 
		 * 	Query	 q=  (Query) session.createQuery("from Client where id=?1 ");
		
		//q.setFirstResult(0);
	//q.setMaxResults(5);
	q.setInteger(1, id);
	List<Client> clients=q.list();
		
		*/
		

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
			session.beginTransaction().commit();
			
			
		//       Update 
		/*Client client=new Client("soha", 25,"el shohada");
		client.setId((long) 4);

		session.update(client);
		
		session.getTransaction().commit();
		
		*/
		      //  delete   
		        

		/*  Client client=new Client();
		client.setId(id);

		session.delete(client);
		
		session.getTransaction().commit();
		
			*/

	  
    
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

