package exercises;

/*
 * sumOfCubes.java         Author: Stephen Isiuwe
 * A java code that takes the user input for two integers
 * gets their cube values and prints the sum
 */

import java.util.Scanner;

public class sumOfCubes {

	public static void main(String[] args) {
		// invoke the scanner utility
		Scanner scan = new Scanner(System.in);
		
		// Prompt the user for the first integer
		System.out.print("Enter the first integer: ");
		int num1 = scan.nextInt();
		
		// Prompt the user for the first integer
		System.out.print("Enter the second integer: ");
		int num2 = scan.nextInt();
		
		// Calculate the sum of the cubes
		int sumOfCubes = (int)(Math.pow(num1, 3) + Math.pow(num2, 3));
		
		// Print the result
		System.out.println("The sum of the cubes is: " + sumOfCubes);
		
		// Close the scanner
		scan.close();

	}

}
