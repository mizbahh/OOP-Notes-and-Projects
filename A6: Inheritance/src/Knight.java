public class Knight extends ChessPiece {
    private int row;
    private int col;

    public Knight(String color, int row, int col) {
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
        // Knight moves in an "L" shape: 2 in one direction and 1 in another
        int rowDiff = Math.abs(this.row - row);
        int colDiff = Math.abs(this.col - col);

        if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) {
            ChessPiece pieceAtTarget = ChessPiece.isOccupied(row, col);
            if (pieceAtTarget == null) {
                return true; // The square is empty, valid move
            } else if (!pieceAtTarget.getColor().equals(this.getColor())) {
                return true; // The square has an opponent piece, valid move
            }
        }
        return false; // Invalid move
    }
}
