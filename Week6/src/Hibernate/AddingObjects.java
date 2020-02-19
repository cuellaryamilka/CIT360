package Hibernate;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import PaymentSystemGetSet.PaymentSysGS;

import PaymentSystemGetSet.*;

public class AddingObjects {

	

			// create session factory
			static SessionFactory factory = new Configuration()
									.configure("hibernatepractice.cfg.xml")
									.addAnnotatedClass(PaymentRecord1.class)
									.buildSessionFactory();
			
//			 create session
//			 Session session = factory.getCurrentSession();
//			
			// You need to add the catch exception in the future 
			
			//reference to a System object
			private static System theSystem = null;
			
//			public static void createNewSystem(String pName) {
//				//creating the system object and saving it in the main driver file
//				theSystem = new System();
//				Hibernate.setTheSystem(theSystem);
//			
//			
//			
//}
			
			
//			public static void createPaymentSysGS() {
//				PaymentSysGS paymentSysGS = new PaymentSysGS();
//				
//				paymentSysGS.setNewName();
//				
//				
//			}
			
			
			public static String createDatabase(String newName) {
								
				
				if(newName=="Maria") {
				
				}
			// createNewHouse method that will add a new house to the data base.			
				return newName;
					
//			public static PaymentRecord1 PaymentRecord1(String newName, int paymentYamilka, int paymentMarisela, PaymentSysGS paymentSysGS) {
//				
////				String name = null;
////				int salaryYamilka = 0;
////				int salaryMarisela = 0;
//				
//				// create session
//				Session session = factory.getCurrentSession();
//				
//				PaymentRecord1 house14 = new PaymentRecord1(newName, paymentYamilka, paymentMarisela);
//			
//				// start a transaction
//				session.beginTransaction();
//				
//				// save the student object
//				session.save(house14);
//				
//				// commit transaction
//				session.getTransaction().commit();
//				return house14;
//				
//				
			}
			
			//finally {
			//	factory.close();
				
			}
				
				
				
				
			

			// use the session object to save java object
		//	try {
				
				// createNewHouse method object
//				System.out.println("Creating new house object...");
//				
//				
//				
//				PaymentRecord1 house1 = new PaymentRecord1("Melisa", 35, 45);
//				PaymentRecord1 house2 = new PaymentRecord1("Lori", 35, 45);
//				PaymentRecord1 house3 = new PaymentRecord1("Doroty", 45, 55);
//				PaymentRecord1 house4 = new PaymentRecord1("Marta", 60, 65);
//				PaymentRecord1 house5 = new PaymentRecord1("Kathy", 60, 65);
//				PaymentRecord1 house6 = new PaymentRecord1("Oficina FC", 25, 35);
//				PaymentRecord1 house7 = new PaymentRecord1("Emily", 35, 45);
//				PaymentRecord1 house8 = new PaymentRecord1("Jackson", 45, 55);
//				PaymentRecord1 house9 = new PaymentRecord1("Sterling", 25, 35);
//				PaymentRecord1 house10 = new PaymentRecord1("Petra", 45, 55);
//				PaymentRecord1 house11 = new PaymentRecord1("Linda", 60, 65);
//				PaymentRecord1 house12 = new PaymentRecord1("Kathy", 65, 70);
//				PaymentRecord1 house13 = new PaymentRecord1("Marta", 65, 70);
//				
//				
//				// start a transaction
//				session.beginTransaction();
//				
//				// save the student object
//				System.out.println("Saving the new house...");
//				session.save(house1);
//				session.save(house2);
//				session.save(house3);
//				session.save(house4);
//				session.save(house5);
//				session.save(house6);
//				session.save(house7);
//				session.save(house8);
//				session.save(house9);
//				session.save(house10);
//				session.save(house11);
//				session.save(house12);
//				session.save(house13);
//				
//				
//				// commit transaction
//				session.getTransaction().commit();
//				
//				System.out.println("Done!");
//				
//			}
////			
//			finally {
//				factory.close();
//		}

//		}
//
			
		
			

	
	


