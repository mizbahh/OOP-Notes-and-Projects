// current

/*
 * Mizbah Ateeq
 * November 3, 2024
 * COP 3330
 * Assignment 6: Inheritance
 */

import java.util.*;

public abstract class ChessPiece {
	/**
	 * masterList stores all the chess pieces in the game.
	 * color stores the color of the chess piece.
	 */
	public static ArrayList<ChessPiece> masterList = new ArrayList<ChessPiece>();
	private String color;

	public ChessPiece(String color) {
		this.color = color;
		masterList.add(this);
	}

	public String getColor() {
		return this.color;
	}
	/**
	 * @param row - The row of the space we are checking
	 * @param col - The column of the space we are checking
	 * @return return the chess piece that is currently in this space.  
	 * If there is none return null.
	 */
	public static ChessPiece isOccupied(int row, int col) {
		for (int i=0; i<masterList.size(); i++) {
			ChessPiece piece = masterList.get(i);
			if (piece.getRow() == row && piece.getCol() == col) {
				return piece;
			}
		}
		return null;
	}

	public abstract int getRow();
	public abstract int getCol();
	public abstract boolean isValidMove(int row, int col);

	public static void main (String [] args) {
		new Rook("Black", 6, 4);
		new Knight("White", 4, 2);
		new Knight("Black", 6, 2);
		new Rook("Black", 2, 4);

		//System.out.println(ChessPiece.masterList.size());
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 6));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 5));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 3));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 2));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(6, 1));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(7, 1));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(1, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(2, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(3, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(4, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(8, 4));
		System.out.println(ChessPiece.masterList.get(0).isValidMove(7, 4));
	}

}
