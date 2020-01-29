package ThreadExecutorRunnable;

public class RunningThreads {
	static final int TOTAL_THREADS = 100;

	public static void main(String[] args) throws InterruptedException  {
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
	
	
	
	
	//public static void main(String[] args) throws InterruptedException {
		Counter1 counter1 = new Counter1();
		System.out.println("Initial Counter = " + counter1.get());
		
		CreatingThread3[] ThirdThread = new CreatingThread3[TOTAL_THREADS];
		
		for (int i=0; i< TOTAL_THREADS; i++) {
			ThirdThread[i] = new CreatingThread3(counter1);
			ThirdThread[i].start();
		}
		
		for (int i=0; i<TOTAL_THREADS; i++) {
			ThirdThread[i].join();
		}
		
		System.out.println("Final Counter = " + counter1.get());
	}
	

}







	
