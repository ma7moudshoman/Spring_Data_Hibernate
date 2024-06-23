package Com.SpringData.Hibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import com.mysql.cj.protocol.x.ContinuousOutputStream;

import Com.SpringData.Hibernate.model.Car;
import Com.SpringData.Hibernate.model.Client;
import Com.SpringData.Hibernate.model.Color;
import Com.SpringData.Hibernate.model.Data;
import Com.SpringData.Hibernate.model.Info;
import Com.SpringData.Hibernate.model.Student;
import Com.SpringData.Hibernate.model.person;

public class MainApp {
	 
		
		
		
@SuppressWarnings("unchecked")
public static void main(String[]args)  {

	
SessionFactory factory=new Configuration()
			
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Car.class)
			.addAnnotatedClass(Color.class)
			.buildSessionFactory();

        	 Session session=factory.getCurrentSession();
     
    
    int id =1;
    try {
		session.beginTransaction();
		
		Car car= session.get(Car.class, id);
	//	Car car1= session.get(Car.class, id);
		
		
		car.setName("car new");
	//	car1.setName("bmw");
		car.getColores().get(0).setName("black");
//car.getColores().get(1).setName("green");
		
		session.getTransaction().commit();
		
		
	  } catch (Exception e) {
	System.out.println(e.toString());
	// TODO: handle exception
}finally {
	session.close();
}  

}


}

/*Color car=session.get(Color.class, id);
	
	session.close();
 System.out.println(car.getName());
 
   for(Car c : car.getCars()) {
	 System.out.println(c.getName());
  }*/
/*
		  Car car1=new Car("car1");
		  Car car2=new Car("car2");
		  Car car3=new Car("car3");
		 
		  
		  session.save(car1);
          session.save(car2);
          session.save(car3);

		  
		  Color color1=new Color("red");
		  Color color2=new Color("blue");
		  Color color3=new Color("yellow");

		  
		color1.getCars().add(car1);
		color1.getCars().add(car2);
		color1.getCars().add(car3);
		
		
		
		color2.getCars().add(car1);
		color2.getCars().add(car2);
		color2.getCars().add(car3);
		
		
		color3.getCars().add(car1);
		color3.getCars().add(car2);
		color3.getCars().add(car3);
		
		
					  
			session.save(color1);
			session.save(color2);
			session.save(color3);
					*/
	
	/*Student student =new Student();
	student=session.get(Student.class, id); 
	 System.out.println(student.getName());
	 System.out.println(student.getInfo().get(0).getPhone());

	//session.delete(student);
	
	
	/*
	student.setName("sara");
	
	student.getInfo().get(0).setPhone("01555741364");
	student.getInfo().get(1).setPhone("01015578974");
	
	session.update(student);
	*/
	/*System.out.println(student.getName());	
	for(Info i : student.getInfo()) {
		System.out.println(i.getPhone());
	}*/
	/*
		Student student= new Student();
		student.setName("ahmed");
		
		Info info1=new Info();
		info1.setPhone("01060269163");
		
		Info info2=new Info();
		info2.setPhone("01015574789");
		

		
		
		student.getInfo().add(info1);
		student.getInfo().add(info2);

		info1.setStudent(student);
		info2.setStudent(student);
		*/
	//	session.save(student);
		
		
    
/*	
Data d=new Data();
		d.setId(2);
		Data res=session.get(Data.class,d.getId());
		System.out.println("name: " + res.getAge());
		System.out.println("age: " + res.getPerson().getName() );
	session.delete(res);
		

add row inside database  

person person=new person();
person.setName("sara");
session.save(person);


Data data=new Data();
data.setAge("20");
session.save(data);

person.setData(data);

*/

/*	person person=new person();
person.setId(1);
person res = session.get(person.class, person.getId());
System.out.println("Name " + res.getName());
System.out.println("Age " + res.getData() .getAge() );
res.setName("Admed");
res.getData().setAge("23");

/*	
Data d=new Data();

p.setId(6);
d.setId(0);


/*Integer id =3;
session.delete(p);
session.delete(d);
//session.save(p);*/
//session.save(person);

    
//first method 

		//calculator al=new Multiplication();
		//System.out.println(al.calc(10, 15));
	 	 
 
//                  add row inside database   


				/*	person person=new person();
				person.setName("sara");
				session.save(person);
				
				
				Data data=new Data();
				data.setAge("20");
				session.save(data);
				
				person.setData(data);
				
				*/



	/*        delete row from database 
	 * 
	 * person person=new person();
		person.setId(1);
		person res = session.get(person.class, person.getId());
		System.out.println("Name " + res.getName());
		System.out.println("Age " + res.getData() .getAge() );
		session.delete(res);
	*/
	
	// second method    lambda 
	
	/*	calculator addition=( first, second) ->{
			return		first*second;
	
		};
		
		System.out.println(addition.calc(14,45));
*/
    

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


