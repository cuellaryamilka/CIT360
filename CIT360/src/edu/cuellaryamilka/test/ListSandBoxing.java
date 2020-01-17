package edu.cuellaryamilka.test;

import java.util.ArrayList;

public class ListSandBoxing {

	
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				// Sandboxing List interface with its different classes - 01-15-2020
				
				// ArrayList class Happy Path
				
				// Creating ArrayList names
				
				//ArrayList<ObjectType> NameOfArrayList = new ArrayList<ObjectType>(); 
				
				ArrayList<String> names = new ArrayList<String>(); // This ArrayList can store only string elements
				
				// Adding elements to the ArrayList names
				
				names.add("Yamilka");
				names.add("Marisela");
				names.add("Veronica");
				names.add("Esther");
				names.add("Claudia");
				
				// Displaying ArrayList
				System.out.println("1- This is the list names: "+names);
				
				// Adding Analia element in the list at the index number 2		
				names.add(2, "Analia");
				System.out.println("2- This is the list names after adding Analia in the index number 2: "+names);
				
				//Remove an element from ArrayList names
				names.remove(2);
				System.out.println("3- List names after removing element at index 2 Analia: "+names);
						
				
				// Mixing two ArrayList together
				
				//Creating second ArrayList 
				
				ArrayList lastName = new ArrayList(); // This ArrayList can store any type of element
						
				// Adding elements to the ArrayList lastName
						
				lastName.add("Cuellar");
				lastName.add("Barroso");
				lastName.add("Rodriguez");
				System.out.println("4- The second list is: "+lastName); //Displaying list lastName

				//Adding ArrayList lastName to the ArrayList names
				names.addAll(lastName); 
				System.out.println("5- This list includes both array and arrayList: "+names); //Displaying list names
				
				// Adding lastName to names list in the specified index number 
				names.addAll(2, lastName);
				System.out.println("6- List names after adding the lastName ArrayList in the index number 2: "+names);
				
				//Removing second ArrayList from names 
				names.removeAll(lastName);
				System.out.println("7- Removed ArrayList lastName: "+names);
				
				// Verified if a specific element is in the list
				if (names.contains("Yamilka")) {
					System.out.println("8- Yes, Yamilka is on the list");
				}
				else {
					System.out.println("8.1- No, Yamilka is not on the list");
				}
					
				
				
				// Update an element from list names
				names.set(4, "Analia");
				System.out.println("9- The list updated is: "+names);
				
				//ArrayList class Nasty Path	
				
				ArrayList<String> animals = new ArrayList<String>(); 
						
				animals.add("Elephant");
				animals.add("Horse");
				animals.add("Leon");
				animals.add("Cebra");
				
				//Testing IndexOutOfBoundsException. 
				//We are going to try to print an element with index 7 from a list of a index size of 6
				
				try { 
					System.out.println("10- The list element with index 7 is: "+lastName.get(7));
				}
				catch(IndexOutOfBoundsException e) 
				{
					e.printStackTrace();
				}
				
				//Testing NullPointerException
				
				
				// Without the try and catch exception handler you would'n be able to run the code bellow 
				// Get an specific element from list
						String nameis = names.get(3);
						System.out.println("11- The name is: "+nameis);

			}

		

	}


