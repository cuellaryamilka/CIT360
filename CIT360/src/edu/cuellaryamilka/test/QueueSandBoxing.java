package edu.cuellaryamilka.test;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class QueueSandBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sandboxing Queue interface with its different classes - 01-19-2020
		
		// PriorityQueue class Happy Path
		
		//Creating priority queue and adding elements to it
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.add(5); // priority queue recognize duplicates
		
		// You can not change elements in a priority queue
		
		System.out.println("1- This is a priority queue list: "+pq);
		
		//Removing elements from the list
		pq.remove(5);
		
		System.out.println("2- List after removing 1 "+pq);
		
		// nasty path
		
		//Testing NoSuchElementException
		//Creating empty priorityqueue
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		System.out.println("4- The pq1 list is: "+pq1);
		
		//If you don't add a value to be removed and try to remove from an empty list it throws NoSuchElementException		
		try {
			pq1.remove();
			System.out.println("5- The pq1 list is: "+pq1);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("5- This is a NoSuchElementException processed successfully: "+pq1);
		}
		
		
		// Looking for an element in the list		
		if (pq.contains(2)) {
		System.out.println("3- Yes, 2 is in the list");
		}
			else {
				System.out.println("3- No, 2 is not in the list");
			
				}		
		
				

	}

}
