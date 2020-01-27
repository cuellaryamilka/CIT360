package ThreadExecutorRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreatingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//This will create a single thread executor that means the executor service interface
		//will execute one thread at a time
	ExecutorService executorService = Executors.newSingleThreadExecutor();
	// This will run the threads
	executorService.execute(new CreatingThread());
	executorService.execute(new CreatingThreadVersion2());
	
	// When you run the program you will see that the CreatingThread/weekdays run first
	// and after it finish the CreatingThreadVersion2/homeOwner thread start
	
	// This will kill the task after they are done running
	executorService.shutdown();
	
	}
	}
	


