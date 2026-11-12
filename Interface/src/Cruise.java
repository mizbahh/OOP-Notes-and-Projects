
public class Cruise implements Boat {

	private double x, y, direction;
	private boolean isSunk;
	
	public Cruise(int x) {
		this.x=0;
		this.y=0;
		this.direction=0;
		this.isSunk=false;	
	}

	@Override
	public void move(double amt) {
		if (!this.isSunk) {
			double rad=this.direction/180*Math.PI;
			this.x+=amt*Math.cos(rad);
			this.y+=amt*Math.sin(rad);
		}
		
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public double getDirection() {
		// TODO Auto-generated method stub
		return this.direction;
	}

	@Override
	public void sink() {
		// TODO Auto-generated method stub
		this.isSunk=true;
		
	}

	@Override
	public void turnBoat(double amt) {
		// TODO Auto-generated method stub
		this.direction+= amt;
		
	}
	
	public int compareTo(Boat o) {
		return (int)(o.getX()-this.x);
	}
	
	
}
