// current

/*
 * Mizbah Ateeq
 * November 3, 2024
 * COP 3330
 * Assignment 6: Inheritance
 */

public class Knight extends ChessPiece {
	private int row;
	private int col;

	public Knight(String color, int row, int col) {
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
	public boolean isValidMove(int row, int col) {

		// knight moves in an L shape 
		// 2 in one direction and 1 in another

		// calculate distance between two points (absolute value)
		int rowDiff = Math.abs(this.row - row);
		int colDiff = Math.abs(this.col - col);

		// check if diff is L shape
		if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) {
			ChessPiece targetPiece = ChessPiece.isOccupied(row, col);
			if (targetPiece == null) {
				return true; // square is empty, valid move
			} 

			// if not null, check if colors match
			else if (targetPiece.getColor()!=(this.getColor())) {
				return true; // valid move if colors don't match
			}
		}
		
		return false;  // if all above false, invalid move
	}

}


