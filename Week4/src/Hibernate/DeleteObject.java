package Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class DeleteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernatepractice.cfg.xml")
								.addAnnotatedClass(PaymentRecord1.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		
		try {
			
			int housesId = 1;
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve a house based on id: primary key
			System.out.println("\nGetting house with id: " + housesId);
			
			PaymentRecord1 myHouses = session.get(PaymentRecord1.class, housesId);
			
			// delete the house with id:1
			System.out.println("Deleting house with id=1");
			
			session.createQuery("delete from PaymentRecord1 where id=1").executeUpdate();
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		}
		
		finally {
			factory.close();
	}
	
	}

	
}

