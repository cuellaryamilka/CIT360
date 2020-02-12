package JUnitTest;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 {

	public static void main(String[] args) {
		
		// This will run the code on TestJunit class and it will print if the result is either true or false
		Result result = JUnitCore.runClasses(TestJunit.class);
		for (Failure failure : result.getFailures()) {
			
			System.out.println(failure.toString());
		}
			System.out.println(result.wasSuccessful());
		

	}

}
