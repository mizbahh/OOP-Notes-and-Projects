
public class Vehicle {

	private int wheels;
	private int doors;
	private String paint;
	
	public Vehicle(int w, int d, String p) {
		this.wheels = w;
		this.doors = d;
		this.paint = p;
	}
	
	public int getWheels() {
		return this.wheels;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public String getColor() {
		return this.paint;
	}

}
