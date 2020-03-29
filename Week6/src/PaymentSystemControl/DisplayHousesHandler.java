package PaymentSystemControl;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DisplayHousesHandler implements Handler {


		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernatepractice.cfg.xml")
								.addAnnotatedClass(PaymentSystemObjectsFinal.class)
								.buildSessionFactory();
		
		@Override
		public Object handleIt(HashMap<String, Object> data) {
			PaymentSystemObjectsFinal viewHouses = (PaymentSystemObjectsFinal) data.get("viewHouses");
		
		// create session
		Session session = factory.getCurrentSession();
		
		// use the session object to save java object
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// query houses, this will query all houses in the table
			List<PaymentSystemObjectsFinal> allHouses = session.createQuery("from PaymentSystemObjectsFinal").getResultList();
																	// from .. you use the name of the java class
			
			// display the houses
			displayHouses(allHouses);
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		}
		
		finally {
			factory.close();
	}
		return session;
	
	}

		

	private static void displayHouses(List<PaymentSystemObjectsFinal> allHouses) {
		for (PaymentSystemObjectsFinal house1 : allHouses) {
			System.out.println(house1);
		}
	}
}
