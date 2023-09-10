package exercises;

import java.util.Scanner;

public class ClosestWholeNumbers {

	public static void main(String[] args) {
		// Invoke the scanner
		Scanner scan = new Scanner(System.in);
		
		// Prompt the user for a floating point value
		System.out.print("Enter the floating point value: ");
		double inputValue = scan.nextDouble();
		
		// Calculate the closest whole number less than and greater than the input value
		double closestLess = Math.floor(inputValue);
		double closestGreater = Math.ceil(inputValue);
		
		// Print the results
		System.out.println("Closest whole number less than " + inputValue + " is: " + (int)closestLess);
		System.out.println("Closest whole number greater than " + inputValue + " is: " + (int)closestGreater);
		
		// Close the scanner
		scan.close();
		
		
		

	}

}
