package helloWorld;

import java.util.Scanner;

public class inputOutputExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		
		System.out.println("Hello, " + name + "!");
		
		scan.close();

	}

}
