package bulb;

public class Bulb {
	private boolean isOn;
	
	// Constructor to initiate the bulb as off
	public Bulb() {
		isOn = false;
	}
	
	// Method to turn on the bulb
	public void turnOn() {
		isOn = true;
	}
	
	// Method to turn off the bulb
	public void turnOff() {
		isOn = false;
	}
	
	// Method to check if the bulb is on
	 public boolean isBulbOn() {
		 return isOn;
	 }
	 

}
