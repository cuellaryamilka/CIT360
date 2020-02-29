package PaymentSystemView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

import PaymentSystemControl.*;
//import PaymentSystemGetSet.PaymentSysGS;
import PaymentSystemModel.PaymentSystemObjects;
import Hibernate.*;
// The MainMenuView class - this is a child class 
// its going to inherite objects from the MainMenu class part of the view layer
	
	//----------------------------------------------------------------

	

	public class MainMenuView extends MenuView {
	          

	// MainMenuView() constructor
	// Purpose: Initialize the menu date
	// Parameters: none
	// Returns: none
	// ======================================================================
	    public MainMenuView(){ 
	        super("\n" +
	                "********************************************\n" +
	                "*   LILY'S MAID PAYMENT SYSTEM: MAIN MENU *\n" + 
	                "********************************************\n" +
	                "1 - Create new house\n" +
	                "2 - Update new house\n" +
	                "3 - Delete a house\n" +
	                "4 - Calculate payment per employee\n" +
	                "5 - List Houses\n" +
	                "6 - Save changes\n" +
	                "7 - Quit\n",        
	            7);
	            
	    }
	    
	//The doAction method
	//Purpose: performs the selected action
	//Parameters: none
	//Returns: none 
	//===========================================================================

@Override public void doAction(int option)
	{
	    switch(option)
	    {
	        case 1: //create a new house
	          createNewHouse();
	          break;
	        case 2: //update and existing house
	          updateNewHouse();
	          break;
	        case 3: // Delete a house
	          deleteHouse();
	          break;
	        case 4: // Calculate payment per employee
	          calculatePayment();
	          break;
	        case 5: // List all the houses
		          listHouses();
		          break;
		    case 6: // Save all the changes
		          saveChanges();
	        case 7:
	          System.out.println("Thanks for using our Payment System App !!");
	    }
	}
	// The createNewHouse method
	//Purpose: creates a new field in the database
	//Parameters: none
	//Returns: none
	//============================================================================
	 // create a scanner object
	   private static Scanner keyboard = new Scanner(System.in);
	    
	    
	    public static void createNewHouse() { 
	    	
	    //Display the Banner Page.
	    System.out.println("\nThe purpose of this app is to help you keep a database"  
	            + " with your employees schedule and payments.\nYou will be able to" 
	            + " add new houses, update excisting houses, delete houses, list all the\n" 
	            + " existing houses and automatically calculate the payment of all your employees\n");
	    
	    String houses;
	    int salaryYamilka;
	    int salaryMarisela;
	    
	   
	    //Prompt to introduce the information for the new house
	    
	    System.out.println("\nPlease type the name of the first house:");
	    houses = keyboard.nextLine();
	    
	    //Prompt to introduce the payment for Yamilka
	    
	    System.out.println("\nPlease type the payment for Yamilka:");
	    salaryYamilka = keyboard.nextInt();
	    
	    //Prompt to introduce the payment for Marisela
	    
	    System.out.println("\nPlease type the payment for Marisela:");
	    salaryMarisela = keyboard.nextInt();
	    
	    try {
	    
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_sheet?useSSL=false&amp;serverTimezone=UTC");
		
		Statement st= (Statement) con.createStatement();
		
		((java.sql.Statement) st).executeUpdate("insert into payment_record value('"+houses+"', '"+salaryYamilka+"', '"+salaryMarisela+"'");
//	    	System.out.println(houses);
//	    	System.out.println(salaryYamilka);
//	    	System.out.println(salaryMarisela);
	    } catch (ClassNotFoundException e) {
	    	e.printStackTrace();
	    
	    
	    }catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    }
	    
	   
	    
	    
	
	    public static void updateNewHouse() {
	    	
	    }

	    public static void deleteHouse() {
	    	
	    }
	    
	    public static void calculatePayment() {
	    	
	    }
	    
	    public static void listHouses() {
	    	
	    }
	    
	    public static void saveChanges() {
	    	
	    }

	

	      }//end of class
