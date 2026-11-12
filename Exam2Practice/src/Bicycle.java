
/*
 * Bicycle
 * 
 * -gear(int)
 * 
 * +Bicycle(double, int)
 * 
 * +changeGear(int)
 * +pedal(double()
 */

public class Bicycle extends Vehicle {
	
	private int gear;
	
	public Bicycle (double speed, int capacity) {
		super(speed, capacity);
		gear = 1;
	}
	
	public Bicycle () {
		super(0,0,1);
	}
	public void ChangeGear(int newGear) {
		gear+=newGear;
	}
	
	public void pedal(double effort) {
		speed = effort*gear;
	}
}
