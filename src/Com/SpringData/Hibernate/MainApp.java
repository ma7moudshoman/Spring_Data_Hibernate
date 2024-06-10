package Com.SpringData.Hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import Com.SpringData.Hibernate.model.Client;
import Com.SpringData.Hibernate.model.Data;
import Com.SpringData.Hibernate.model.person;

public class MainApp {
	
	
	
@SuppressWarnings("unchecked")
public static void main(String[]args)  {
	SessionFactory factory=new Configuration()
			
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(person.class)
			.addAnnotatedClass(Data.class)
			.buildSessionFactory();	
        	 Session session=factory.getCurrentSession();
    
    
    
   int id = 1;
    try {
		session.beginTransaction();
		
		
		  } catch (Exception e) {
		System.out.println(e.toString());
		// TODO: handle exception
	}finally {
		session.close();
	}  
    
}


}
    
    
    

/* 
 * start  s%
 * end with  %s
 * any     %s%
 */
    	 /*
    	     * one to one 
    	     * one to many
    	     * many to one
    	     * many to many
    	     * */
    
    /*/*             Update 
		 * session.createQuery("update Client set age=26 where id=1")
		.executeUpdate();
		
		 * for(int i=0;i<clients.size();i++){
			System.out.println(clients.get(i).getAddress() +" "+ clients.get(i).getAge());
		}*/
		//System.out.println(client.getFullName() + " " + client.getAddress());
  
    
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
		 * 
		 */
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

	  /*//c .add(Restrictions.lt("id",(long) 3));    lis number
		//c.add(Restrictions.between("id",(long) 2,(long) 4)); the number between first number and last number
		//c.add(Restrictions.in("id",ids));
		//c.add(Restrictions.isNotNull("address"));
		  //	c.add(Restrictions.gt("id",(long) 3));      // big number 
		//c.add(Restrictions.isEmpty("address"));
         //c.add(Restrictions.eq("fullName","yasser"));
//		c.add(Restrictions.like("fullName","a",MatchMode.END));
		//c.add(Restrictions.like("fullName","a",MatchMode.START));
//		c.add(Restrictions.like("fullName","a",MatchMode.ANYWHERE));
	//	c.add(Restrictions.like("fullName","r",MatchMode.EXACT));

	//	c.add(Restrictions.like("fullName","a",MatchMode.ANYWHERE));

		
	//	c.add(Restrictions.eq("fullName","yasser"));

	//    and & or
		Criterion c1 = Restrictions.eq("address", "Cairo");
		Criterion c2 = Restrictions.eq("fullName", "Mohand ");
 		LogicalExpression or=Restrictions.and(c2, c1);
		
c.add(or);*/
    

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
	
	**********************************************
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

	
	 
	*/


