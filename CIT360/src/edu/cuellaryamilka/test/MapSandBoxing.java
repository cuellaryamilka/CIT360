package edu.cuellaryamilka.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSandBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sandboxing Map interface with its different classes - 01-17-2020
		
		// HashMap class Happy Path
		
		// Creating HashMap
		HashMap<String, Integer> agenda = new HashMap<>();
		
		agenda.put("Laskin Rd", 23454);
		agenda.put("Lark St", 23452);
		agenda.put("Brandon St", 23456);
		agenda.put("General Booth Blvd", 23457);
		
		
		//Creating entrySet for agenda (entrySet stores both key and value)
		Set< Map.Entry<String,Integer> > creatingEntrySet = agenda.entrySet();
		
		
		//The for loop is going to call the creatingEtrySet for the key and the value
		// and its going to display it one at a time. 
		for (Map.Entry<String,Integer> constantEntry:creatingEntrySet)
		{
			
			System.out.print(constantEntry.getKey()+":"); //print method prints the string but doesn't move the cursor to a new line
			System.out.println(constantEntry.getValue()); //println method prints the string and move the cursor to a new line
			
		}
		
		//Remove an element from the map
		agenda.remove("Laskin Rd");
		
		System.out.println("1- Map after removing Laskin Rd: "+agenda);
			  
		// replace old value with new value 
		// using replace method 
		agenda.replace("Lark St", 23452, 23454); 
			                            
		// print new map 
		System.out.println("2- Map after changing Lark St zipcode: " +agenda);
			        
			
		// Find if an element is in the map		
		if (agenda.containsKey("Laskin Rd")) {
			System.out.println("3- Yes, Lasking Rd is in the map");
		}
			else {
						System.out.println("3- No, Lasking Rd is not in the map");
				}
		}

	}


