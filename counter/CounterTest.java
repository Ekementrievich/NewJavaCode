package counter;

public class CounterTest {

	public static void main(String[] args) {
		// Create two counter objects
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		
		// Increment counter1 five times 
		counter1.click();
		counter1.click();
		counter1.click();
		counter1.click();
		counter1.click();
		
		// Increment counter2 three times
		counter2.click();
		counter2.click();
		counter2.click();
		
		// Display the current counts
		System.out.println("Counter 1 count: " + counter1.getCount());
		System.out.println("Counter 2 count: " + counter2.getCount());
		
		// Reset both counters
		counter1.reset();
		counter2.reset();
		
		// Display the counts after resetting 
		System.out.println("Counter 1 count after rest: " + counter1.getCount());
		System.out.println("Counter 2 count after rest: " + counter2.getCount());
		

	}

}
