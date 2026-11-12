
public class AirBoat implements Boat {

	private int x, y, direction;
	private boolean isSunk;
	
	public AirBoat(int x) {
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
	// AIRBOATS DO NOT SINK!
	public void sink() {
		
		
	}

	@Override
	public void turnBoat(double amt) {
		this.direction+= amt;
	}

	@Override
	public int compareTo(Boat o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
