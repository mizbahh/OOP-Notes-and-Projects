/*
 * Mizbah Ateeq
 * November 10, 2024
 * COP 3330
 * Assignment 7: Interfaces
 */

// sports interface
public interface Sports extends Comparable<Sports> {
	
	// methods defined
	public void score_large();
	public void score_med();
	public void score_small();
	public int get_score();
	public int get_id();
	
}
