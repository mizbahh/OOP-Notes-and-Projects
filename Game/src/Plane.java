
// plane IS A unit
// extends = IS A
// plane IS THE CHILD of unit

import java.util.ArrayList;

public class Plane extends Unit {

	public Plane(String n, int x, int y) {
		super(n, x, y);
	}

	/*
	 * A plane can move anywhere on the map, that is not a rock.
	 * 
	 */
	
	public boolean canMove(ArrayList<Unit> board, int x , int y) {
		for (Unit u: board) {
			if (u.getX()==x && u.getY()==y) {
				if (u.getType().equals("Rock")) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	// don't need override?? when would we need it
	public String getType() {
		return "Plane";
	}

}
