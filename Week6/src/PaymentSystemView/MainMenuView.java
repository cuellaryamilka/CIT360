package PaymentSystemView;

import java.util.Scanner;

import PaymentSystemControl.MainPaymentSys;
import PaymentSystemGetSet.PaymentSysGS;
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
	    
	    // get reference to the system object and the PaymentSysGS
	    private static System theSystem = MainPaymentSys.getTheSystem();
	    
	    
	    public static void createNewHouse() { 
	    	
	    //Display the Banner Page.
	    System.out.println("\nThe purpose of this app is to help you keep a database"  
	            + " with your employees schedule and payments.\n\n You will be able to" 
	            + " add new houses, update excisting houses, delete houses, list all the\n" 
	            + " existing houses and automatically calculate the payment of all your employees");
	    
	    String newName;
	    int paymentYamilka;
	    int paymentMarisela;
	    
	    //Prompt to introduce the information for the new house
	    
	    System.out.println("\nPlease type the name of the first house: ");
	    newName = keyboard.nextLine();
	    
	    //Prompt to introduce the payment for Yamilka
	    
	    System.out.println("\nPlease type the payment for Yamilka: ");
	    paymentYamilka = keyboard.nextInt();
	    
	    //Prompt to introduce the payment for Marisela
	    
	    System.out.println("\nPlease type the payment for Marisela: ");
	    paymentMarisela = keyboard.nextInt();
	    
	    AddingObjects.PaymentRecord1(newName, paymentYamilka, paymentMarisela, null);
	    System.out.println("\nThe new house was created succesfully");
	    
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
