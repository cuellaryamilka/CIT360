package edu.cuellaryamilka.test;

class MyexampleThread extends Thread { //Create and extended Thread first
										// right click and in source/ override implement method (run)

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		// print some numbers to use in the program
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getId() + "Value" + i);
		}
		
		//The method sleep has to go in a try/catch clause because it can throw an exception
		try {
			Thread.sleep(100); // calling the method sleep to hold the thread for millisedond
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}


public class ThreadsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Creating an instance of The MyexampleThread class
			MyexampleThread myexampleThread = new MyexampleThread();
			myexampleThread.start(); // calling the method start to create a thread than then it will call the run method 
			
			// Creating second instance of MyexampleThread
			MyexampleThread myexampleThread1 = new MyexampleThread();
			myexampleThread1.start();
			
			// This is a second way to crate a Thread:
//			The other way to create a thread is to declare a class that implements the 
//			Runnable interface. That class then implements the run method. An instance of the class can then be allocated, passed as an argument when creating Thread, and started. The same example in this other style looks like the following:
//
//			     class PrimeRun implements Runnable {
//			         long minPrime;
//			         PrimeRun(long minPrime) {
//			             this.minPrime = minPrime;
//			         }
//
//			         public void run() {
//			             // compute primes larger than minPrime
//			              . . .
//			         }
//			     }
//			 
//			The following code would then create a thread and start it running:
//
//			     PrimeRun p = new PrimeRun(143);
//			     new Thread(p).start();
			 
			
	}

}
