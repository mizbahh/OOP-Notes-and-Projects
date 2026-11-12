	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.*;
	
public class InputEx{



	public static void main(String[] args) {

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to more input");
		try {
			String aLineOfInput = stdin.readLine();
			// first time we are doing this, we will do as..
			// a
			// b
			String aInput = stdin.readLine();
			// wrapper class
			int a = Integer.parseInt(aInput);
			String bInput = stdin.readLine();
			int b = Integer.parseInt(bInput);
			System.out.println(a+"+"+b+"="+(a+b));

			System.out.println("Enter 2 integers and we will add them.");
			String twoNumbersSameLine=stdin.readLine();
			String [] c = twoNumbersSameLine.split(" ");
			int[] values = new int[2];

			values[0] = Integer.parseInt(c[0]);
			values[1] = Integer.parseInt(c[1]);
			System.out.println(values[0]+"+"+values[1]+"="+(values[0]+values[1]));

			System.out.println("Enter ALL the numbers and I will add them");
			String addNumbers = stdin.readLine();
			String [] d = addNumbers.split(" ");

			// tells us how long it is, makes the integers the same length
			int [] e = new int[d.length];

			int total=0;
			for (int i=0; i<d.length; i++) {
				e[i]=Integer.parseInt(d[i]);
				total += e[i];
				if (i!=0) System.out.print("+");
				System.out.print(e[i]);
			}

			System.out.println("="+ total);





			stdin.close();

		} catch (IOException e) {
			System.out.println("I have an error");
			e.printStackTrace();
		}



	}

}
