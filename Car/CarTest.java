package Car;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Create an array to hold car objects
		Car[] cars = new Car[3];
		
		// Input car information from the user
		for (int i = 0; i < cars.length; i++) {
			System.out.println("Enter details for car " + (i + 1));
			System.out.print("What is the Make of the car: ");
			String make = scan.nextLine();
			System.out.print("What year was the car made? ");
			int year = scan.nextInt();
			scan.nextLine();
			System.out.print("What model is the car? ");
			String model = scan.nextLine();
			
			// Create a car object and add it to the array
			cars[i] = new Car(make, year, model); 
		}
		
		scan.close();
		
		// Display information about the cars
		for (Car car : cars) {
			System.out.println(car.toString());
			if (car.isAntique()) {
				System.out.println("This car is an antique.");
			}else {
				System.out.println("This car is not an antique.");
			}
			System.out.println();
		}

	}

}
