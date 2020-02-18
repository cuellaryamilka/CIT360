package PaymentSystemView;

/* The ViewInterface in the View Layer
 * Contains the method signatures that other classes implement when accessing the Interface
 */



public interface ViewInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option);
    
}
