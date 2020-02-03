package Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class QueryObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernatepractice.cfg.xml")
								.addAnnotatedClass(PaymentRecord1.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		// use the session object to save java object
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// query houses, this will query all houses in the table
			List<PaymentRecord1> allHouses = session.createQuery("from PaymentRecord1").getResultList();
																	// from .. you use the name of the java class
			
			// display the houses
			displayHouses(allHouses);
			
			// query salary: houses='Marta'
			allHouses = session.createQuery("from PaymentRecord1 s where s.houses='Marta'").getResultList();
			
			// display the houses with name Marta
			System.out.println("\n\nHouses with the name Marta");
			displayHouses(allHouses);
			
			// query houses: salaryYamilka = '35' OR salaryMarisela = '45'
			allHouses = 
					session.createQuery("from PaymentRecord1 s where" 
							+ " s.salaryYamilka='35' OR s.salaryMarisela='45'").getResultList();
			
			System.out.println("\n\nThese are the houses with salaryYamilka equal 35 and salaryMarisela equal 45");
			displayHouses(allHouses);
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		}
		
		finally {
			factory.close();
	}
	
	}

	private static void displayHouses(List<PaymentRecord1> allHouses) {
		for (PaymentRecord1 house1 : allHouses) {
			System.out.println(house1);
		}
	}
}
