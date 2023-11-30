package sphere;



public class MultiSphere {

	public static void main(String[] args) {
		// Create and manipulate multiple sphere objects
		Sphere sphere1 = new Sphere(5.0);
		Sphere sphere2 = new Sphere(3.0);
		
		// Display information about the sphere
		System.out.println(sphere1.toString());
		System.out.println("Volume: " + sphere1.calculateVolume());
		System.out.println("Surface Area: " + sphere1.calculateSurfaceArea());
		
		System.out.println();
		
		System.out.println(sphere2.toString());
		System.out.println("Volume: " + sphere2.calculateVolume());
		System.out.println("Surface Area: " + sphere2.calculateSurfaceArea());
		
		// Update the diameter of the sphere1
		sphere1.setDiameter(8.0);
		System.out.println("\nUpdated " + sphere1.toString());
		System.out.println("Updated volume: " + sphere1.calculateVolume());
		System.out.println("Updated Surface Area: " + sphere1.calculateSurfaceArea());

	}

}
