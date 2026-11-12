/*
 * Mizbah Ateeq
 * Assignment 1 - Java Arrays
 * COP 3330
 * September 6, 2024
 */

import java.util.*;


public class MathGame {
	public static Scanner scan;
	
	// menu options
	public static int menu() {
		System.out.println("\nSelect your option:");
		System.out.println("1. Play Game");
		System.out.println("2. Swap Values");
		System.out.println("3. New Values");
		System.out.println("4. Sort");
		System.out.println("5. Exit");
		int choice = scan.nextInt();
		scan.nextLine();
		return choice;
	}
	
	// play game
	public static void game(int[]values) {
		System.out.println("Add these values:");
		int total = 0;
		for (int i=0; i<values.length; i++) {
			System.out.print(values[i] + " ");
			// calculate total
			total += values[i];
		}
		System.out.print("\n");
		int addedVal = scan.nextInt();
		
		// check user addition
		if (addedVal == total) {
			System.out.println("That is correct!");
		} else {
			System.out.println("That was incorrect. The value adds up to be: " +total);
		}
		
	}
	
	// swap values
	public static void swap(int[]values) {
		Random random = new Random();   
		
		// current array
		System.out.print("Current: ");
		for (int i=0; i<values.length; i++) {
			System.out.print(values[i] + " ");
		}
		
		// swap
		System.out.println("\nHow many swaps?");
		int swapAmount = scan.nextInt();
		for (int i = 0; i < swapAmount; i++) {
            int a = random.nextInt(values.length);
            int b = random.nextInt(values.length);
            int temp = values[a];
	        values[a] = values[b];
	        values[b] = temp;
        }
		
		// swapped array
		System.out.print("Final: ");
		for (int i=0; i<values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println("");
	}

	// assign new array values
	public static void newVal(int[] values) {
		System.out.print("New Values: ");
		for (int i=0; i<values.length; i++) {
			values[i] = (int) (Math.random() * 16) + 5;
			System.out.print(" " + values[i]);
		}
		System.out.println("");
	}
	
	// sort array in ascending order
	public static void sort(int[] values) {
		System.out.println("Current: ");
		for (int i=0; i<values.length; i++) {
        	System.out.print(values[i] + " ");
        }
		
		Arrays.sort(values);
        System.out.println("\nFinal: ");
        for (int i=0; i<values.length; i++) {
        	System.out.print(values[i] + " ");
        }
        System.out.print("\n");
	}
	
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		// intro
		System.out.println("Welcome to random number generator!");
		System.out.println("How many values would you like to use?");
		int n = scan.nextInt();
		System.out.println("Created!");
		scan.nextLine();
		
		int [] values = new int[n];
		
		for (int i=0; i<n; i++) {
			values[i] = (int) (Math.random() * 16) + 5;
		}
		
		int option = -1;
		
		// call correct function based on user input
		while (option !=5) {
			option = menu();
			switch (option) {
			case 1:
				game(values);
				break;
			case 2:
				swap(values);
				break;
			case 3:
				newVal(values);
				break;
			case 4:
				sort(values);
				break;
			// exit
			case 5:
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("That wasn't a valid option");
				
			}
		}
		
		scan.close();
	}

}