package PaymentSystemControl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PaymentSysControl {
	
	//private static Scanner scanner;

	public static void main(String[] args) {
					
		// use the session object to save java object
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernatepractice.cfg.xml")
								.addAnnotatedClass(PaymentSystemObjectsFinal.class)
								.buildSessionFactory();
				
			

		Session session = factory.getCurrentSession();
		
		
		
				
					try {
						
						
						PaymentSystemView.paymentSystemView(); 
						
						Scanner scanner;
						scanner = new Scanner(System.in);
//						
						
						
					
						String houses = scanner.nextLine();
						int salaryYamilka = scanner.nextInt();
						int salaryMarisela = scanner.nextInt();
						
						
						PaymentSystemObjectsFinal createNewHouse = new PaymentSystemObjectsFinal();
						
						PaymentSystemObjectsFinal.setId(1);
						createNewHouse.setHouses(houses);
						createNewHouse.setSalaryYamilka(salaryYamilka);
						createNewHouse.setSalaryMarisela(salaryMarisela);		
								
						// start transaction
						session.beginTransaction();	
						
						// save the student object
						session.save(createNewHouse);
						
						
						
						// commit transaction
						session.getTransaction().commit();
						
						System.out.println("Done!");
						
					}
					
					finally {
						factory.close();
						
					}
}

}				






			
			


	
		
