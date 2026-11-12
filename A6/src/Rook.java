// current

/*
 * Mizbah Ateeq
 * November 3, 2024
 * COP 3330
 * Assignment 6: Inheritance
 */

public class Rook extends ChessPiece {
	private int row;
	private int col;

	// Rook constructor
	public Rook(String color, int row, int col) {
		super(color);
		this.row = row;
		this.col = col;
	}

	// row getter
	public int getRow() {
		return row;
	}

	// column getter
	public int getCol() {
		return col;
	}

	// check if valid move method
	public boolean isValidMove(int targetRow, int targetCol) {


		// check if either targetRow or targetColumn match
		if (this.row != targetRow && this.col != targetCol) {
			return false; // rook can only move in straight lines
		}

		// check if out of bounds
		if (targetRow < 0 || targetRow > 7 || targetCol < 0 || targetCol > 7) {
			return false;
		}

		// check for horizontal movement along row
		if (this.row == targetRow) {
			int step = 0;
			if (targetCol > this.col) {
				step = 1; // move to right
			} else {
				step = -1; // move to left
			}
			for (int c = this.col + step; c != targetCol; c += step) {
				if (ChessPiece.isOccupied(this.row, c) != null) {
					return false; // piece blocking way
				}
			}
		} 
		// check for vertical movement along column
		else if (this.col == targetCol) {
			int step = 0;
			if (targetRow > this.row) {
				step = 1; // move down
			} else {
				step = -1; // move up
			}

			for (int r = this.row + step; r != targetRow; r += step) {
				if (ChessPiece.isOccupied(r, this.col) != null) {
					return false; // piece blocking way
				}
			}
		}

		// check the target square for occupancy
		ChessPiece targetPiece = ChessPiece.isOccupied(targetRow, targetCol);
		if (targetPiece == null) {
			return true; // square empty
		} 
		// if not null, check if colors match
		else {
			if (targetPiece.getColor()!=(this.getColor())) {
				return true; // valid move if colors don't match
			}
			else {
				return false; // if colors match, return false
			}
		}
	}
}
