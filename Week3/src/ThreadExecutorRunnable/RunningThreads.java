package ThreadExecutorRunnable;

public class RunningThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating an instance of the CreatingThread class that uses the extended thread class for creating threads
				//Then we create the first thread by running the start() method
						CreatingThread creatingThread = new CreatingThread(); // This is the first thread
						creatingThread.start();
						
						CreatingThread creatingThread1 = new CreatingThread(); // This is the first thread
						creatingThread1.start();
						
				//Creating the object thread from CreatingThreadVersion2 that uses 
						//  the runnable interface to create threads
				// Creating a second thread
						Thread SecondThread = new Thread(new CreatingThreadVersion2());
						SecondThread.start();
						
						Thread SecondThread1 = new Thread(new CreatingThreadVersion2());
						SecondThread1.start();
	}
	

}







	
