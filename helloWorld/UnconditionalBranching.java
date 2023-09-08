package helloWorld;

public class UnconditionalBranching {
	public static void main(String[] args) {
		System.out.println("Inside main method! Invoking aMethod!");
		aMethod();
		System.out.println("Back in main method!");
	}

	private static void aMethod() {
		System.out.println("Inside aMethod!");
		
	}

}
