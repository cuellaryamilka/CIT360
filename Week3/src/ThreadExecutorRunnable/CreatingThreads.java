package ThreadExecutorRunnable;

import java.util.ArrayList;


//Implementing runnable is another way to create threads
//Runnable interface contains only one method that is the run() method
//public class CreatingData implements Runnable{

//For this example program we are going to create the thread by extending the class
//right click and in source/ override implement method (run)
class CreatingThread extends Thread {
	
	@Override
	// Now we create the code we want to run with the runnable method
	public void run() {
		// TODO Auto-generated method stub
		
		ArrayList<String> weekDays = new ArrayList<String>();
		
		weekDays.add("Monday");
		weekDays.add("Tuesday");
		weekDays.add("Wednesday");
		weekDays.add("Thursday");
		weekDays.add("Friday");
		
		//This will print the list the id of the thread plus the weekDays 
		
		for (String weekDaysit : weekDays) {
			System.out.println(Thread.currentThread().getId() + weekDaysit);
		}

		//Adding information other list with house owner names
		ArrayList<String> houseOwner = new ArrayList<String>();
		
		houseOwner.add("Ana");
		houseOwner.add("Tara");
		houseOwner.add("Rosy");
		houseOwner.add("Marta");
		houseOwner.add("Katy");
		houseOwner.add("Oficina");
		houseOwner.add("Sterling");
		houseOwner.add("Lilo");
		
		//This will print the list the id of the thread plus the houseOwner 
		
		for (String houseOwnerit : houseOwner) {
			System.out.println(Thread.currentThread().getId() + houseOwnerit);
		}
		
		// We are going to use the method sleep to delay the thread
		//This method needs to be surrounded by the try/catch clause because it can throw an exception
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		super.run();
	}
	
}

