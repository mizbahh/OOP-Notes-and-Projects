import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {

	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter("output.txt");

			out.println("Hello Everyone!");
			out.println("My name is Mizbah");

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	// inheritance: can inherit traits
	// but then can overwrite/change them

/* exam 2 
	* files
	* list
	* queues, priority queues
	* stacks
	* inheritance
	* polymorphism
	*/

}
