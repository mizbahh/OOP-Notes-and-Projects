/*
 * Mizbah Ateeq
 * November 10, 2024
 * COP 3330
 * Assignment 7: Interfaces
 */

public class Football implements Comparable<Sports>, Sports {

	// private variables: score + teamID
	private int score;
	private int teamID;

	// football constructor
	public Football (int teamID) {
		this.score=0;
		this.teamID=teamID;
	}

	// 7 points for large points
	public void score_large() {
		this.score+=7;
	}

	// 3 points for medium points
	public void score_med() {
		this.score+=3;

	}

	// 1 point for small points
	public void score_small() {
		this.score+=1;
	}

	// score getter
	public int get_score() {
		return this.score;
	}

	// team ID getter
	public int get_id() {
		return this.teamID;
	}



	// return teamID + score as String
	public String toString() {
		return this.teamID + " - " + this.score;
	}

	// compare scores descending
	public int compareTo(Sports o) {
		return o.get_score()-this.get_score();
	}
}
