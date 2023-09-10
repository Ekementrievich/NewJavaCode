package exercises;

/*
 * generateUserName.java       Author: Stephen Isiuwe
 * This is a java code that takes first name input from the user,
 * generates a random number and ties both to become a string
 */

import java.util.Random;
import java.util.Scanner;

public class generateUserName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		// Prompt the user for their first name
		System.out.print("What is your first name? ");
		String firstName = scan.nextLine();
		
		// Prompt the user for their last name (assuming its at least letters long)
		System.out.print("What is your last name (at least 5 letters)? ");
		String lastName = scan.nextLine();
		
		// Ensure the last name is at least five letters long 
		while (lastName.length() < 5) {
			System.out.println("Last name must be at least five letters long");
			System.out.print("What is your last name (at least 5 letters)? ");
			lastName = scan.nextLine();
		}
		
		// Generate a random number between 10 and 99
		int randomNum = random.nextInt(90) + 10;
		
		// Get the first letter of the first name
		char firstInitial = firstName.charAt(0);
		
		// Create the final string
		String resultString = String.valueOf(firstInitial) + randomNum;
		
		// Print the result
		System.out.println("Generated string: " + resultString);
		
		// Close the scanner
		scan.close();
	}
}
