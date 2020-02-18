package PaymentSystemControl;

import PaymentSystemView.MainMenuView;

public class MainPaymentSys {

	/*
	* The main() class file for the PaymentSystem project
	 */
	
	
	    //variable for keeping a reference to the Game object
	    private static System theSystem = null;
	    
	    //main function - entry point for the program
	    //runs the main menu
	    public static void main(String[] args) {
	        MainMenuView mmv = new MainMenuView();
	        mmv.displayMenu();
	       
	    
	    }
	    
	    public static void setTheSystem(System system){
	        theSystem = system;
	    }
	    public static System getTheSystem(){
	        return theSystem;
	    }
	    
	    
	} //end of class

