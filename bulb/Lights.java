package bulb;

public class Lights {

	public static void main(String[] args) {
		// Create three Bulb objects
		
		Bulb bulb1 = new Bulb();
		Bulb bulb2 = new Bulb();
		Bulb bulb3 = new Bulb();
		
		// Turn on the first bulb
		bulb1.turnOn();
		
		// Check the status of the bulbs
		System.out.println("Bulb 1 is on: " + bulb1.isBulbOn());
		System.out.println("Bulb 2 is on: " + bulb2.isBulbOn());
		System.out.println("Bulb 3 is on: " + bulb3.isBulbOn());
		
		// turn on the second bulb
		bulb2.turnOn();
		
		// Check the status of the bulbs
		System.out.println("Bulb 1 is on: " + bulb1.isBulbOn());
		System.out.println("Bulb 2 is on: " + bulb2.isBulbOn());
		System.out.println("Bulb 3 is on: " + bulb3.isBulbOn());
		
		// turn off the third bulb
		bulb3.turnOn();
		
		// Check the status of the bulbs
		System.out.println("Bulb 1 is on: " + bulb1.isBulbOn());
		System.out.println("Bulb 2 is on: " + bulb2.isBulbOn());
		System.out.println("Bulb 3 is on: " + bulb3.isBulbOn());
		
	
	}

}
