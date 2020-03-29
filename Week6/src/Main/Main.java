package Main;

import java.util.HashMap;
import java.util.Scanner;

import PaymentSystemControl.*;



public class Main {
	
	public Main() {
		
	}

	public static void main(String[] args) {
		ApplicationController controller=new ApplicationController();
		
		Scanner scanner = new Scanner(System.in);
		
		
		PaymentSystemObjectsFinal createNewHouse = new PaymentSystemObjectsFinal();
		
		
		
		
		
		try { 
			int action = -1;
			while(action !=0) {
				action=(int) controller.doCommand("displayMenu", GetCommandData("scanner", scanner));
				switch(action) {
				case 1:
					HashMap<String, Object> commandData = GetCommandData("scanner", scanner);
					commandData.put("database", createNewHouse);
					controller.doCommand("addHouses", commandData);
				break;
					
				case 2:
					controller.doCommand("displayHouses", GetCommandData("viewHouses", createNewHouse));
					break;
					
				case 0:
					System.out.println("GoodBye");
				break;
				default:
					System.out.println("Unrecognized selection, please try again.");
				break;
				
				
					
				
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace ();
		}
		finally {
			scanner.close();
			
		}

	}

	
	
	public static HashMap<String, Object> GetCommandData(String key, Object value) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put(key, value);
		return data;
	}
}


	
	
		
		
	

	