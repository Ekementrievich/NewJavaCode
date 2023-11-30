package Dog;

import java.util.Scanner;

public class Kennel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// Create an array to hold Dog objects
		
		Dog[] dogs = new Dog[3];
		
		// Input dog information from the user
		for (int i = 0; i < dogs.length; i++) {
			System.out.println("Enter details of the dog " + (i + 1));
			System.out.print("What is the name of the dog: ");
			String name = scan.nextLine();
			
			System.out.print("How old is the dog: ");
			int age = scan.nextInt();
			scan.nextLine();
			
			// Create a dog object and add it to the array
			dogs[i] = new Dog(name, age);
		}
		
		scan.close();
		
		// Display information about the dogs
		for (Dog dog : dogs) {
			System.out.println(dog.toString());
			System.out.println();
			System.out.println("Age in Person Years: " + dog.calculatePersonYears());
			System.out.println();
		}

	}

}
