
public class ClassNameSep3 {

	// Instance Variables
	private int age;
	private String name;
	private double height;
	
	// Constructor
	// Constructors MUST have the the same name as the class.
	// Each constructor will set all of the instance variables
	// not static & no return type
	public ClassNameSep3(String n) {
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
	}
	
	public void feedGuy (int oz) {
		// grows an inch for every 100 oz of food eaten
		this.height += oz / 100;
		
	}
	
	public static void main(String[] args) {
		ClassNameSep3 person1 = new ClassNameSep3("Mizbah");
		ClassNameSep3 person2 = new ClassNameSep3("Zahra");
		
		person1.ageGuy(20);
		person2.ageGuy(-20);
		person2.age = -20;

		
		System.out.println(person1.name + ": " + person1.age);
		System.out.println(person2.name + ": " + person2.age);


	}

}
