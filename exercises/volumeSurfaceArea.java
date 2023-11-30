package exercises;

import java.util.Scanner;
import java.text.DecimalFormat;

public class volumeSurfaceArea {

	public static void main(String[] args) {
		
		// declaration and initialization of variables
		int rad;
		final double PI = Math.PI;
		double volume, surfaceArea;
		
		
		// invoke the scanner utility
		Scanner scan = new Scanner(System.in);
		
		//Ask user for input
		System.out.println("What is the radius? ");
		rad = scan.nextInt();
		
		volume = (4 / 3) * PI * Math.pow(rad, 3);
		
		surfaceArea = 4 * PI * Math.pow(rad, 2);
		
		// Round the output to 2 decimal places
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		
		System.out.println("The volume of sphere is: " + fmt.format(volume));
		System.out.println("The surface area of the sphere is: " + fmt.format(surfaceArea));
		
		scan.close();
			

	}

}
