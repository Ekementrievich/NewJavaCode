package Car;

import java.util.Calendar;

public class Car {
	private String make;
	private int year;
	private String model;

	public Car(String make, int year, String model) {
		// Constructor to initialize make, year, and model
		this.make = make;
		this.year = year;
		this.model = model;
	}
	
	// Getter for the make of the car
	public String getMake() {
		return make;
	}
	
	// Setter for make
	public void setMake(String make) {
		this.make = make;
	}
	
	// Getter for year
	public int getYear() {
		return year;
	}
	
	// Setter for year
	public void setYear(int year) {
		this.year = year;
	}
	
	// Getter for model
	public String getModel() {
		return model;
	}
	
	// Setter for model
	public void setModel(String model) {
		this.model = model;
	}
	
	// Return a one time description of the car
	public String toString() {
		return year + " " + make + " " + model;
	}
	
	// Check if the car is an antiques (more than 45 years old
	public boolean isAntique() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return (currentYear - year) > 45;
	}

}
