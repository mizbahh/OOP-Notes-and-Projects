
public class Person {

	// Instance Variables
	private int age;
	private String name;
	private double height;
	
	public static int oldest;
	
	// Constructor
	// Constructors MUST have the the same name as the class.
	// Each constructor will set all of the instance variables
	// not static & no return type
	public Person(String n) {
		// set values
		this.name = n;
		this.age = 0;
		this.height = 22.5; // inches
	}
	
	// Instance Methods
	// These are methods that apply to the object
	public void ageGuy(int years) {
		// to prevent negative ages
		if (years>0) 
			this.age += years;
		oldest = Math.max(oldest, this.age);
	}
	
	public void feedGuy (int oz) {
		// grows an inch for every 100 oz of food eaten
		this.height += oz / 100;
		
	}
	
	// READ ONLY variable
	// ageGuy is the only thing that can change age now
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static int getOldest() {
		return oldest;
	}

}
