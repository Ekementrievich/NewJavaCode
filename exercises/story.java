package exercises;

import java.util.Scanner;

public class story {

	public static void main(String[] args) {
		/*
		 * story.java: a java code that prompts for 
		 * and reads a person's name, age, college and pet name and 
		 * insert the appropriate data
		 */
		String name, age, college, petname;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name? : ");
		name = scan.nextLine();
		
		System.out.println("How old are you? : ");
		age = scan.nextLine();
		
		System.out.println("Where did you go to school? : ");
		college = scan.nextLine();
		
		System.out.println("What is your pet's name? : ");
		petname = scan.nextLine();
		
		System.out.println("Hello, my name is " + name + " and I am " + age + " years \n"
				+ "old, I'm enjoying my time at " + college + ", though \n"
				+ "I miss my pet " + petname + " very much!");
		scan.close();

	}

}
