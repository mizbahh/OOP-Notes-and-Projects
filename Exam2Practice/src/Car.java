
/*
 * Car
 * 
 * -fuel(double)
 * 
 * +Car(double, int)
 * 
 * +drive(double)
 * +refuel(double)
 */


public class Car extends Vehicle {

	private double fuel;
	
	public Car (double speed, int capacity) {
		super(speed, capacity);
		fuel = 50;
	}
	
	public void drive (double distance) {
		fuel-=distance;
	}
	
	public void refuel (double gas) {
		fuel+=gas;
	}
}
