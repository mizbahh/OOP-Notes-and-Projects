/*
 * Vehicle
 * 
 * -speed(double)
 * -capacity(int)
 * 
 * +Vehicle()
 * 
 * +getSpeed()
 * +getCapacity()
 * +accelerate(double)
 */

public class Vehicle {
	
	private double speed;
	private int capacity;
	
	// default constructor, if no input
	
	public Vehicle() {
		speed=0.0;
		capacity=1;
	}

	public Vehicle (double speed, int capacity) {
		this.speed=speed;
		this.capacity=capacity;
	}

	public double getSpeed() {
		return speed;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void accelerate (double fast) {
		speed+=fast;
	}
}




