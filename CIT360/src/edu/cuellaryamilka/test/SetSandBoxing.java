package edu.cuellaryamilka.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSandBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sandboxing Set interface with its HashSet class - 01-16-2020
		
		// Happy path
		
		Set<Integer> years = new HashSet(); // Creating HashSet years list
										//You can also use the following declaration HashSet<String> years = new HashSet();
		
		years.add(2020); //Adding elements to the list
		years.add(2020);
		years.add(2018);
		years.add(2017);
		
		// HashSet is an unordered list because elements appear using hash format which is unorder.
		// HashSet can keep only unique elements that's why 2020 appears just once.
		System.out.println("1- These are the years: "+years);
		
		// this shows the list without using iterator		
		for(Integer yearsit : years) {
			System.out.println(yearsit);
		}
		
		System.out.println("=====================");
		
		// Displaying the list using iterator
		Iterator<Integer> it = years.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// removing elements from list
		years.remove(2018); 
		System.out.println("2- List afer removing the element with index 1: "+years);
		
		// creating HashSet from another collection
		ArrayList<Integer> numbers = new ArrayList<Integer>(); // creating the ArrayList we are going to add to the HashSet
		
		numbers.add(1); // adding elements to the ArrayList
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(2018);
		numbers.add(2020);
		
		
		
		years.addAll(numbers);
		System.out.println("3- List years after adding ArrayList numbers: "+years);
		
		// nasty path
		
		//Testing NullPointerException. 
		
		HashSet<Integer> nullelem = null; //creating null element
		
		try {
			numbers.retainAll(nullelem); // trying to retain nullelem with the retainAll method
			System.out.println("4- HashSet after retainAll with the null element: "+nullelem); // Without the try/catch the process 
																								// would stop here
			
		} catch (NullPointerException e) { 						// Because of the catch exception handler the code throws the 
																// NullPointerException and the rest of the operations continue
			System.out.println("5- Exception thrown: "+ e);
			// TODO: handle exception
		}
		
		
		
		//Above it shows the nasty path of the operations below 
		System.out.println("6- HashSet before retainAll() operation: "+numbers); // displaying list numbers wich is going to remain 
																				// after retainAll
		
		System.out.println("7- Collection elements to be retained: "+years); //displaying the list years
		
		// With retainAll the list numbers is going to remain complete but its going to keep from years only the common elements with numbers
		years.retainAll(numbers); // numbers remain 
		System.out.println("8-HashSet after retainAll() operation: "+years);
		
		
		
		
		
		
		

	}
}

