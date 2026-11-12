import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What would you like to open?");
		String filename = scan.nextLine();
		
		scan.close();
		
		try {
			Scanner fileInput = new Scanner(new File(filename));
			int tests = fileInput.nextInt();
			for (int i=0; i<tests; i++) {
				int a = fileInput.nextInt();
				int b = fileInput.nextInt();

				System.out.println(a+"*"+b+"="+(a*b));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("We couldn't find that file son.");
		}
		
		

	}

}
