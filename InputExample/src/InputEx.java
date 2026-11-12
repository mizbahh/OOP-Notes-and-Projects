// Mizbah Ateeq
// Input Example/Notes
// COP 3330
// August 24, 2024

// import Scanner
import java.util.Scanner;

// imports all java util:
// import java.util.*;

public class InputEx {

	public static void main(String[] args) {
		
		// creates a new Scanner for us to read from the standard input
		// only need to write one Scanner until u close it
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("What is your name?");

		// scans in one string each
		String input = scan.next();
		String input2 = scan.next();
		// prints new line after first input to allow for next input
		scan.nextLine();
		

		System.out.println("Input: " + input);
		System.out.println("Input: " + input2);

		System.out.println("What is your name?");

		// inputs entire line nextLine
		String input3 = scan.nextLine();
		
		System.out.println("Input: " + input3);
		
		System.out.println("What is your age?");
		
		// integer input
		int age = scan.nextInt();
		System.out.println("Age: " + age);

		System.out.println("What is your GPA?");
		// double/float input
		double GPA = scan.nextDouble();
		System.out.println("GPA: " + GPA);


		// closes the Scanner
		scan.close();

	}

}
