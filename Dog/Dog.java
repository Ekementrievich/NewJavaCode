package Dog;



public class Dog {
	private String name;
	private int age;

	// Constructor to initialize the name and age of the dog
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Getter for name
	public String getName() {
		return name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for age
	public int getAge() {
		return age;
	}
	
	// Setter for age
	public void setAge(int age) {
		this.age = age;
	}
	
	// Calculate and return the age of the dog in "person years"
	public int calculatePersonYears() {
		return age * 7;
	}
	
	// Return a one-time description of the dog
	public String toString() {
		return "Dog: " + name + ", Age " + age + " years";
	}

}
