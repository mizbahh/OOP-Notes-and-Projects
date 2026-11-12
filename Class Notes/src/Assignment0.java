/*
 * Mizbah Ateeq
 * Assignment 0 - Welcome to OOP!
 * COP 3330
 * September 1, 2024
 */

import java.util.*;

public class Assignment0 {

	public static Scanner scan;

	public static int menu () {
		System.out.println("What would you like to do?");
		System.out.println("1. Drive on the Beach");
		System.out.println("2. Play Disc Golf");
		System.out.println("3. See the race");
		System.out.println("4. Exit");
		int choice = scan.nextInt();
		scan.nextLine();
		return choice;
	}
	
	public static void beach () {
		System.out.println("What time did Knightro get to the beach?");
		int time = scan.nextInt();
		scan.nextLine();
		if (time>=9 && time<=18) {
			System.out.println("Enjoy your drive!\n");
		} else {
			System.out.println("Oh no! The beach is closed.\n");
		}

	}
	
	public static void golf () {
		int distance = 487;
		System.out.println("Welcome to the park!");
		while (distance!=0) {
			System.out.println("There is " + distance + " feet left until the basket.");
			System.out.println("How far did you throw?");
			int throwDist = scan.nextInt();
			if (throwDist>distance) {
				distance = distance;
			} else {
			distance = distance - throwDist;
			}
		}
		System.out.println("You made it in!\n");
	}
	
	public static void race () {
		System.out.println("How many laps are left?");
		int laps=scan.nextInt();
		int i;
		for (i=laps; i>0; i--) {
			System.out.println("There are " + i + " laps left.");
		}
		System.out.println("Finished!\n");
	}
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		int options = -1;
		while (options!=4) {
			options = menu();
			switch (options) {
				case 1:
					beach();
					break;
				case 2:
					golf();
					break;
				case 3:
					race();
					break;
				case 4:
					System.out.println("Goodbye\n");
					break;
				default:
					System.out.println("That wasn't a valid option\n");
				
			}
	}
}
	
}
