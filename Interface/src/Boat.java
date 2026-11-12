
public interface Boat extends Comparable <Boat> {

	public void move(double amt);
	public double getX();
	public double getY();
	public double getDirection();
	public void sink();
	public void turnBoat(double amt);
	
	
}

/*
 * runner class:
 * 
 * 
 * 3
 * Basketball = 0
 * Basketball = 0
 * Football = 0
 * 
 * 3 teams
 * 1, 2, 3
 * arraylist
 *  
 *  football
 * small - 1 
 * 		score+=1;
 * medium - 3
 * 		score+=3;
 * large - 7
 * 		score+=7;
 * 
 * basketball - 1, 2, 3
 * 
 * sort after you play all the games
 * 
 * 
 * but do we need comparable for this?
 * collections.sort , arraylist
 * 
 * standard output, not file
 * 
 * 
 * 
 */
