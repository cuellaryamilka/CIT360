package PaymentSystemControl;

import java.util.HashMap;
import java.util.Scanner;
public class DisplayPaymentSystemMenu implements Handler {
	
	public DisplayPaymentSystemMenu() {
		
	}
	
	

	@Override
	public Object handleIt(HashMap<String, Object> data) {
		
		System.out.println("Menu:");
		System.out.println("\t1-Add Houses");
		System.out.println("\t2-Display Houses");
		System.out.println("\t0-Exit");
		System.out.println("Selection(1,2, or 0:)");
		
		Scanner scanner = (Scanner) data.get("scanner");
		int selection = GetNextInt(scanner);
		return selection;	
		
	}

	private int GetNextInt(Scanner scanner) {
		String input = scanner.nextLine();
		try {
			int result = Integer.parseInt(input);
			return result;
			
		} catch (Exception e) {
			System.out.println("You must enter a number from the menu.");
			return -1;
			
		}
 	}


		
	}

		
	

	

