package PaymentSystemControl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import PaymentSystemModel.*;
import PaymentSystemView.*;

public class PaymentSysControl implements Serializable {
	
	public static void main(String[] args) {

					// create session factory
					SessionFactory factory = new Configuration()
											.configure("hibernatepractice.cfg.xml")
											.addAnnotatedClass(PaymentSystemObjects.class)
											.buildSessionFactory();
				
					
					
					// create session
					Session session = factory.getCurrentSession();
					
						
					// use the session object to save java object
						
						try {
							
						System.out.println("Creating new student object...");
						PaymentSystemObjects house1 = new PaymentSystemObjects("Maria", 75, 85);
						
						// start a transaction
						session.beginTransaction();
								
						
						// save the student object
						System.out.println("Saving the student...");
						session.save(house1);
						
						
						
						// commit transaction
						session.getTransaction().commit();
						
						System.out.println("Done!");
						
					}
					
					finally {
						factory.close();
						
					}
					
	
						
	// add house to the database
	
//	private static createHouse() {
//		// TODO Auto-generated method stub
//		
//		
//		
//	
//			
//		 //MainMenuView mainMenuView;
//		 
//			
//		return st;
//		
//	}
}

}				






			
			


	
		
