/* Mizbah Ateeq
 * Dr. Steinberg
 * COP3503 Spring 2025
 * Programming Assignment 1
 */

import java.util.Random;

public class Game 
{
	// declare variables
	private int x, y;
	private Random rand;
	private char[] moves = {'d', 'r', 'b'}; 

	// Game constructor
	public Game (Random rand) 
	{
		this.x=0;
		this.y=0;
		this.rand=rand;
	}

	// player two random move assigned
	public char selectPlayerTwoMove() 
	{
		// pick random index from 0 to 2 
		int direction = rand.nextInt(moves.length);

		// assign player 2 move based off random index chosen
		return moves[direction];
	}

	// play method
	public int play() 
	{
		// tracker for whose turn it is
		int moveNum=0;

		// first move, player 1
		char move='d';

		// run while loop until at winning position
		while (x<=7 && y<=7) 
		{

			// break once winning position reached
			if (x==7 && y==7) 
				break;

			// player 1 move
			if (moveNum%2==0) 
			{
				// move in same direction as player 2's previous move
				if (move=='d' && y<7 && x<7) 
				{
					x++; y++;
					moveNum++;
				}

				else if(move=='r' && x<7) 
				{
					x++;
					moveNum++;
				}

				else if(move=='b' && y<7) 
				{
					y++;
					moveNum++;
				}

				// if in last row, can only move left
				else if (y==7 && x<7) 
				{
					x++;
					moveNum++;
				}

				// if in last column, can only move down
				else if (x==7 && y<7) 
				{
					y++;
					moveNum++;
				}


			}

			// player 2 move
			else 
			{
				// assign move direction
				move = selectPlayerTwoMove();

				// check which if statement applies
				if (move=='d' && y<7 && x<7) 
				{
					x++; y++;
					moveNum++;
				}

				else if(move=='r' && x<7) 
				{
					x++;
					moveNum++;
				}

				else if(move=='b' && y<7) 
				{
					y++;
					moveNum++;
				}

				// went out of bounds, try different move
				else 
				{
					move = selectPlayerTwoMove();
				}

			}
		}

		// if player 1 went last
		if(moveNum%2!=0) 
			return 1;

		// if player 2 went last
		else 
			return 2;
	}
}


