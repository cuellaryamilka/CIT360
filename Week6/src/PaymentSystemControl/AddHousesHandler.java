package PaymentSystemControl;

import java.util.HashMap;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddHousesHandler implements Handler {

	
			
				
			// use the session object to save java object
			
			// create session factory
			SessionFactory factory = new Configuration()
									.configure("hibernatepractice.cfg.xml")
									.addAnnotatedClass(PaymentSystemObjectsFinal.class)
									.buildSessionFactory();
			@Override
			public Object handleIt(HashMap<String, Object> data) {
				Scanner scanner = (Scanner) data.get("scanner");
				PaymentSystemObjectsFinal database = (PaymentSystemObjectsFinal) data.get("database");
			
			

			Session session = factory.getCurrentSession();
			
			
					
						try {
							
							// Calling the paymentSystemView method
							PaymentSystemView.paymentSystemView(); 
							
							Scanner scanner1;
							Scanner scanner2 = new Scanner(System.in);
//							
							
							
						
							String houses = scanner.nextLine();
							int salaryYamilka = scanner.nextInt();
							int salaryMarisela = scanner.nextInt();
							
							
							PaymentSystemObjectsFinal.setId(1);
							database.setHouses(houses);
							database.setSalaryYamilka(salaryYamilka);
							database.setSalaryMarisela(salaryMarisela);		
									
							// start transaction
							session.beginTransaction();	
							
							// save the student object
							session.save(database);
							
							
							
							// commit transaction
							session.getTransaction().commit();
							
							System.out.println("Done!");
							
							return null;
							
						}
			
						
						finally {
							factory.close();
							
						}
	}

	}				



