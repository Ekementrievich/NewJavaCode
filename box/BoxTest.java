package box;

import java.util.Scanner;

public class BoxTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Create an array to hold the box objects
		Box[] boxes = new Box[3];
		
		// input box information from the user
		for (int i = 0; i < boxes.length; i++) {
			System.out.println();
			System.out.println("Enter the detils of the Box: " + (i + 1));
			System.out.println("Height: ");
			double height = scan.nextDouble();
			System.out.println("Width: ");
			double width = scan.nextDouble();
			System.out.println("Depth: ");
			double depth = scan.nextDouble();	
			
			// Create a box object and add it to the array
			boxes[i] = new Box(height, width, depth);
			
		}
		
		// close the scanner
		scan.close();
		
		// Display information about the boxes
		for (Box box: boxes) {
			System.out.println(box.toString());
			System.out.println();
		}

	}

}
