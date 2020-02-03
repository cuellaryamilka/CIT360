package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class AddingObjects {

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
				
				// create a student object
				System.out.println("Creating new student object...");
				PaymentRecord1 house1 = new PaymentRecord1("Melisa", 35, 45);
				PaymentRecord1 house2 = new PaymentRecord1("Lori", 35, 45);
				PaymentRecord1 house3 = new PaymentRecord1("Doroty", 45, 55);
				PaymentRecord1 house4 = new PaymentRecord1("Marta", 60, 65);
				PaymentRecord1 house5 = new PaymentRecord1("Kathy", 60, 65);
				PaymentRecord1 house6 = new PaymentRecord1("Oficina FC", 25, 35);
				PaymentRecord1 house7 = new PaymentRecord1("Emily", 35, 45);
				PaymentRecord1 house8 = new PaymentRecord1("Jackson", 45, 55);
				PaymentRecord1 house9 = new PaymentRecord1("Sterling", 25, 35);
				PaymentRecord1 house10 = new PaymentRecord1("Petra", 45, 55);
				PaymentRecord1 house11 = new PaymentRecord1("Linda", 60, 65);
				PaymentRecord1 house12 = new PaymentRecord1("Kathy", 65, 70);
				PaymentRecord1 house13 = new PaymentRecord1("Marta", 65, 70);
				
				
				// start a transaction
				session.beginTransaction();
				
				// save the student object
				System.out.println("Saving the student...");
				session.save(house1);
				session.save(house2);
				session.save(house3);
				session.save(house4);
				session.save(house5);
				session.save(house6);
				session.save(house7);
				session.save(house8);
				session.save(house9);
				session.save(house10);
				session.save(house11);
				session.save(house12);
				session.save(house13);
				
				
				// commit transaction
				session.getTransaction().commit();
				
				System.out.println("Done!");
				
			}
			
			finally {
				factory.close();
		}

		}
	


	}
	


