package Main;

import java.util.HashMap;



import PaymentSystemControl.*;

public class ApplicationController {
	
	private HashMap<String, Handler> commands;
	
	// AddHouses, DisplayHouses and DisplayPaymentSystemMenu are reffering to classes
	public ApplicationController() {
		commands = new HashMap<String, Handler>();
		commands.put("addHouses", new AddHousesHandler());
		commands.put("displayHouses", new DisplayHousesHandler());
		commands.put("displayMenu", new DisplayPaymentSystemMenu());
		
	}

	public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {
		Handler command = commands.getOrDefault(commandKey, null);
		if (command == null) {
			throw new Exception("There is no command with the key word ' " + commandKey + "'.");
			
		}
		
		return command.handleIt(commandData);
		
	}

	
	}

