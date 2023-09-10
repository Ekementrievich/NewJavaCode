package exercises;

/*
 * distanceBetweenTwoPoints.java     Author: Stephen Isiuwe
 * java code that takes two inputs from the user and give the distance between 
 * the two points.
 */

import java.util.Scanner;

public class distanceBetweenTwoPoints {

	public static void main(String[] args) {
		// invoke the scanner utility
		Scanner scan = new Scanner(System.in);
		
		// Get the first point
		System.out.println("What is the first point(x1)? ");
		int x1 = scan.nextInt();
		
		// Get the second point
		System.out.println("What is the second point(x2)? ");
		int x2 = scan.nextInt();
		
		// Get the third point
		System.out.println("What is the third point(y1)? ");
		int  y1= scan.nextInt();
				
		// Get the fourth point
		System.out.println("What is the second point(y2)? ");
		int y2 = scan.nextInt();
		
		
		
		double Dist = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y1 - y2, 2)));
		
		System.out.println("The distance between the two points is: " + Dist);
		
		scan.close();

	}

}
