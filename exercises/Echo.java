package exercises;

/*
 * Echo.java   Author: Stephen Isiuwe
 * 
 * Demonstrate the use of the nextLine method of the Scanner class
 * to read string from user
 */
import java.util.Scanner;

public class Echo {
		//----------------------------------------------
		// Read a character string from the user and prints it
		//----------------------------------------------
		
	public static void main(String[] args) {
		String message;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");
		
		message = scan.nextLine();
		
		System.out.println("You entered: \"" + message + "\"");
		
		scan.close();
		

	}

}
