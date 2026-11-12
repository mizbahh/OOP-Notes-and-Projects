import java.util.*;

public class ArrayNotesAug27 {

	// static method:
	// if private, another class can't use it & allows us to have more control over our variables
	public static void function1(int x) {
		x=x+2;
	}
	
	// arrays DO pass by reference
	public static void function2(int[]n) {
		for (int i=0; i<n.length; i++) {
			n[i]+=2;
		}
	}
	
	public static void main(String[] args) {

		// pass by value: x stays 5 in main
		int x=5;
		function1(x);
		
		// use new keyword to create new array
		int[] arrayName = new int[5];
		
		// 2 diff ways to fully fill array values (same result):
		Arrays.fill(arrayName, 42);
		for (int i=0; i<arrayName.length; i++) {
			arrayName[i]=33;
		}
		
		// by default integer arrays will default to the value 0, don't need to initialize
		System.out.println(arrayName[0]);
		System.out.println(arrayName[4]);
		
		// error, out of array value:
		// System.out.println(arrayName[5]);


		function2(arrayName);

		for (int i=0; i<arrayName.length; i++) {
			System.out.println(arrayName[i]);

		}
		
		String name = "Mizbah Ateeq";
		name = name.toLowerCase();
		System.out.println(name.length());

		


	}

}
