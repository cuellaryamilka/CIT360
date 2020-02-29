//package joinTablePractice;
//
//
//
//
//	
//	
//	import org.hibernate.Session;
//	import org.hibernate.SessionFactory;
//	import org.hibernate.cfg.Configuration;
//
//
//
//
//
//	public class MainJoinTable {
//
//		public static void main(String[] args) {
//
//			// create session factory
//			SessionFactory factory = new Configuration()
//									.configure("hibernate.cfg.xml")									
//									.addAnnotatedClass(Houses.class)									
//									.addAnnotatedClass(Employees.class)
//									.buildSessionFactory();
//			
//			// create session
//			Session session = factory.getCurrentSession();
//			
//			try {			
//				
//				// start a transaction
//				session.beginTransaction();
//				
//				
//				// create a course
//				Houses tempHouses = new Houses("Maria", 75, 85);
//				
//				// save the house
//				System.out.println("\nSaving the house...");
//				session.save(tempHouses);
//				System.out.println("Saved the house: " + tempHouses);
//				
//				// create the employees
//				Employees tempEmployees1 = new Employees("John", "Doe", "john@practicecode.com");
//				Employees tempEmployees2 = new Employees("Maria", "Public", "maria@practicecode.com");
//				
//				// add employees to the houses
//				tempHouses.addEmployees(tempEmployees1);
//				tempHouses.addEmployees(tempEmployees2);
//				
//				// save the employees
//				System.out.println("\nSaving employees...");
//				session.save(tempEmployees1);
//				session.save(tempEmployees2);
//				System.out.println("Saved employees: " + tempHouses.getEmployees());
//				
//				// commit transaction
//				session.getTransaction().commit();
//				
//				System.out.println("Done!");
//			}
//			finally {
//				
//				// add clean up code
//				session.close();
//				
//				factory.close();
//			}
//		}
//
//	
//
//
//
//
//
//
//	}
//
//
