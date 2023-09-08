/*******************************************
 * TempConverter.java   Author: Stephen Isiuwe
 * 
 * Demonstrates the use of primitive data types and arithmetic
 * expressions.
 */
package exercises;

public class TempConverter {

	/**
	 * Compute the fahrenheit equivalent of a specific 
	 * celsius value using the formula F = (9/5)C + 32.
	 */
	public static void main(String[] args) {
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		
		double fahrenheitTemp;
		int celsiusTemp = 24;  // value to convert
		
		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		
		System.out.println("Celsius Temperature: " + celsiusTemp);
		System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);

	}

}
