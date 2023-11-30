package sphere;

import java.text.DecimalFormat;

public class Sphere {
	private double diameter;
	
	// Constructor to initiate the diameter
	public Sphere(double diameter) {
		this.diameter = diameter;
	}
	
	// Getter for diameter
	public double getDiameter() {
		return diameter;
	}
	
	// Setter for diameter
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	// Calculate and return the volume of the sphere
	public double calculateVolume() {
		double radius = diameter / 2.0;
		return ((4.0/3.0) * Math.PI * Math.pow(radius, 3));
	}
	
	// Calculate and return the surface area of the sphere
	public double calculateSurfaceArea() {
		double radius = diameter / 2.0;
		return 4.0 * Math.PI * Math.pow(radius, 2);
	}
	
	// Return a one time description of the sphere
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return "Sphere with diameter " + df.format(diameter) + " units";
	}
	
}
