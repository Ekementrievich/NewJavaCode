package exercises;

/*
 * heronAreaTriangle.java     Author:Stephen Isiuwe
 * java program that computes the area of a triangle using 
 * the Heron's formula
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class heronAreaTriangle {

	public static void main(String[] args) {
		// initialization of variables 
		int a,b,c;
		double s, per, area;
		
		// invocation of the scanner utility
		Scanner scan = new Scanner(System.in);
		
		// declaration of variables
		System.out.println("What is a? ");
		a = scan.nextInt();
		
		System.out.println("What is b? ");
		b = scan.nextInt();
		
		System.out.println("What is c? ");
		c = scan.nextInt();
		
		per = a + b + c;
		
		s = per / 2;
		
		area = Math.sqrt(s * (s-a) * (s-b) * (s -c));
		
		// Round the output to 2 decimal places
			DecimalFormat fmt = new DecimalFormat("0.##");
		
		System.out.println("The area of the triangle is " + fmt.format(area));
		
		scan.close();
	}

}
