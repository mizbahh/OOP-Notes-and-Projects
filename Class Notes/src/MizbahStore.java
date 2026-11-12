import java.util.*;

public class MizbahStore {
	// Static Variable
	public static Scanner scan;
	public static int menu() {
	System.out.println("What do you do?");
	System.out.println("1. Pick Fruit");
	System.out.println("2. Fruit Total");
	System.out.println("3. Exit");
	int choice = scan.nextInt();
	scan.nextLine();
	return choice;
	}
	public static void pickFruit(int[] fruits) {
	System.out.println("What type of tree are you picking?");
	String name = scan.nextLine();
	System.out.println("How many " + name + " fruits are you picking?");
	int items = scan.nextInt();
	if (name.equals("Meyer")) {
	fruits[0] += items;
	}
	if (name.equals("Simmonds")) {
	fruits[1] += items;
	}
	if (name.equals("Brogdon")) {
	fruits[2] += items;
	}
	if (name.equals("Key Lime")) {
	fruits[3] += items;
	}
	if (name.equals("Pink Lemon")) {
	fruits[4] += items;
	}
	}
	public static void printFruit(int[] trees) {
	String[] types = new String[5];
	types[0] = "Meyer Lemon";
	types[1] = "Simmonds Avocado";
	types[2] = "Brogdon Avocado";
	types[3] = "Key Lime";
	types[4] = "Pink Lemon";
	for (int i=0; i<trees.length; i++) {
	System.out.println(types[i] + ": " + trees[i]);
	}
	}
	public static void main(String[] args) {
	scan = new Scanner(System.in);
	/*
	* 0 - Meyer Lemon
	* 1 - Simmonds Avocado
	* 2 - Brogdon Avocado
	* 3 - Key Lime
	* 4 - Pink Lemon
	*/
	int[] trees = new int[5];
	int options = -1;
	while (options != 3) {
	options = menu();
	switch (options) {
	case 1:
	pickFruit(trees);
	break;
	case 2:
	printFruit(trees);
	break;
	case 3:
	System.out.println("Goodbye.");
	break;
	default:
	System.out.println("That wasn't a valid option");
	}
	}
	}
	}
