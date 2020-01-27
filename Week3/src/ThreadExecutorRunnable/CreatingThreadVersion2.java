package ThreadExecutorRunnable;

import java.util.ArrayList;

public class CreatingThreadVersion2 implements Runnable {

		//Implementing runnable is another way to create threads
		//Runnable interface contains only one method that is the run() method

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
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
				
			}
	
	

}




