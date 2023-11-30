package counter;

public class Counter {
	private int count;
	
	// Constructor to initialize the count to zero
	public Counter() {
		count = 0;
	}
	
	// Method to increment the count
	public void click() {
		count++;
	}

	// Method to get the current count
	public int getCount() {
		return count;
	}
	
	// Method to reset the counter to zero
	public void reset() {
		count = 0;
	}
}
