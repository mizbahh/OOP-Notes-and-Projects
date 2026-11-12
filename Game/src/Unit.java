import java.util.ArrayList;

public abstract class Unit {

	private int x, y; // coordinates
	private String name;
	
	
	public Unit(String n, int x, int y) {
		this.x =x;
		this.y = y;
		this.name=n;
	}
	
	// encapsulation: using getters for the private 
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPosition(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	// every child forced to write a canMove method
	// x + y are where we want to go
	public abstract boolean canMove(ArrayList<Unit> board, int x, int y); 
	
	public abstract String getType();


}
