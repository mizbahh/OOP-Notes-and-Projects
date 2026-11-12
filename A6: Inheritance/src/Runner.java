public class Runner {
	
    public static void main(String[] args) {
        new Rook("Black", 6, 4);
        new Knight("White", 4, 2);
        new Knight("Black", 6, 2);
        new Rook("Black", 2, 4);

        // Testing Black Rook's valid moves
        System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 6)); // true
        System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 5)); // true
        System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 3)); // true
        System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 2)); // false (blocked by Knight)
        System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 1)); // false
        System.out.println(ChessPiece.masterList.get(0).isValidMove(7, 1)); // false
        System.out.println(ChessPiece.masterList.get(0).isValidMove(1, 4)); // false
        System.out.println(ChessPiece.masterList.get(0).isValidMove(2, 4)); // true
        System.out.println(ChessPiece.masterList.get(0).isValidMove(3, 4)); // true
        System.out.println(ChessPiece.masterList.get(0).isValidMove(4, 4)); // true
        System.out.println(ChessPiece.masterList.get(0).isValidMove(8, 4)); // false (out of bounds)
        System.out.println(ChessPiece.masterList.get(0).isValidMove(7, 4)); // true
    }
}
