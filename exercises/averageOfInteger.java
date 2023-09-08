package exercises;

import java.util.Scanner;;

public class averageOfInteger {
	/*
	 * averageOfInteger.java: This is a simple script to take 
	 * the value of three integers from the user and prints their average 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the Second number: ");
		int num2 = scan.nextInt();
		
		System.out.println("Enter the third number: ");
		int num3 = scan.nextInt();
		
		// Calculate the average
		double average = (num1 + num2 + num3) / 3.0;
		
		System.out.println("The average of the three numbers is: " + average );
		
		
		System.out.println("Thank you for your patience");

		
		scan.close();
		
		
		

	}

}
