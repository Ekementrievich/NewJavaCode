package LeapYear;

import java.util.Scanner;

public class LeapYearChecker {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter the year (after 1582): ");
			int year = scan.nextInt();
			
			if (year < 1582) {
				System.out.print("Error: Gregorian calendar starts from 1582.");
			}else if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + " is a leap year.");
			}else {
				System.out.println(year + " is not a leap year.");
				
			}
			scan.close();
	}

}
