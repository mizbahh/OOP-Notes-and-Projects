/*
 * Mizbah Ateeq
 * Control Statement Notes
 * COP 3330
 * August 25, 2024
 */

import java.util.Scanner;

public class ControlStatementEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("What is your overall grade?");
		double grade = scan.nextDouble();
		
		if (grade>=70) {
			System.out.println("You are passing!");
		} else (grade<70) {
			System.out.println("You are failing!");
		}
		
		/*
		 * <
		 * >
		 * <=
		 * >=
		 * 
		 */
	}

}
