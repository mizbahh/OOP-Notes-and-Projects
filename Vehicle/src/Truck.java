
// truck is always a vehicle, vehicle is not always a truck
// parent child relationship, only one parent tho

// inheriting Vehicle traits
public class Truck extends Vehicle {
	
	// parent referred to as super
	public Truck () {
		super(4,2, "white"); // every single truck's parameters

	}
	
	public Truck (String color) {
		super(4,2, color); // every single truck's parameters

	}
	
	

}
