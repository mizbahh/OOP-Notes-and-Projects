public class Rook extends ChessPiece {
	private int row;
	private int col;

	public Rook(String color, int row, int col) {
		super(color);
		this.row = row;
		this.col = col;
	}

	@Override
	public int getRow() {
		return row;
	}

	@Override
	public int getCol() {
		return col;
	}

	@Override
	public boolean isValidMove(int row, int col) {
		if (this.row != row && this.col != col) {
			return false; // Rook can only move in straight lines
		}

		int rowDiff = row - this.row;
		int colDiff = col - this.col;

		// Check for movement along the row (horizontal movement)
		if (rowDiff == 0) {
			int step = (colDiff > 0) ? 1 : -1;
			for (int c = this.col + step; c != col; c += step) {
				if (ChessPiece.isOccupied(this.row, c) != null) {
					return false; // There's a piece blocking the way
				}
			}
		}
		// Check for movement along the column (vertical movement)
		else if (colDiff == 0) {
			int step = (rowDiff > 0) ? 1 : -1;
			for (int r = this.row + step; r != row; r += step) {
				if (ChessPiece.isOccupied(r, this.col) != null) {
					return false; // There's a piece blocking the way
				}
			}
		}

		ChessPiece pieceAtTarget = ChessPiece.isOccupied(row, col);
		if (pieceAtTarget == null || !pieceAtTarget.getColor().equals(this.getColor())) {
			return true; // The square is either empty or has an opponent's piece
		}
		return false; // Invalid move
	}
}
