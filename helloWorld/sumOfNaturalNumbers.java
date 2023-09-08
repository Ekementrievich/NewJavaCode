package helloWorld;

public class sumOfNaturalNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int n = 1000;
		
		// for loop
		for (int i = 1; i <= n; ++i) {
			// Body inside the loop
			sum += i;   // sum = sum + i
		}
		System.out.println("Sum = " + sum);

	}

}
