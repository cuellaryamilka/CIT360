package ThreadExecutorRunnable;

import java.util.concurrent.atomic.*;

public class Counter1 {
		
		// Creating an AtomicInteger variable
	    private AtomicInteger value = new AtomicInteger();
	 
	    // Creating two different methods to update the variable
	    public void increment() {
	        value.incrementAndGet();
	    }
	 
	    public void decrement() {
	        value.decrementAndGet();
	    }
	    // using the get() method to get the value
	    public int get() {
	        return value.get();
	

	}

}
