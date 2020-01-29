package ThreadExecutorRunnable;

public class CreatingThread3 extends Thread {
	
	// Creating an instance object of the class Counter1 to create a third thread
				private Counter1 counter1;
				
				//Reference this object's attributes and functions
				 public CreatingThread3(Counter1 counter1) {
					this.counter1 = counter1;
				}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(100);
			
		} catch (InterruptedException ex) { ex.printStackTrace(); }
		
		counter1.increment();
		
		super.run();


	}

}
