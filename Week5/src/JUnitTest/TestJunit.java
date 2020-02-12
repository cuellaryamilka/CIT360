package JUnitTest;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class TestJunit {

	@Test // This means that the public void method bellow can be run as a test case
	public void TestRunner1() {
		
		// Creating objects to be tested
		String[] firstArray = {"Yamilka", "Maria", "Juana"};
		String[] secondArray = {"Yamilka", "Maria", "Juana"};
		
		String obj1 = new String ("houses");
		String obj2 = new String ("houses");
		
		String obj3 = null;
		String obj4 = "houses";
		String obj5 = "houses";
		int number1 = 35;
		int number2 = 45;
		assertEquals(obj1, obj2);
		
		// check for true
		assertTrue(number1<number2);
		
		// check for false
		assertFalse(number1>number2);
		
		//check for null 
		assertNotNull(obj4);
		
		// check if it is null
		assertNull(obj3);
		
		// check if an object match a value
		assertThat(number1, is(35));	
		
		// check if the reference is to the same object
		assertSame(obj4, obj5);
		
		//check if the reference is not to the same object
		assertNotSame(obj1, obj2);
		assertArrayEquals(firstArray, secondArray);
		
		

	
	}

}
