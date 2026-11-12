import java.util.*;

public class StackExamples {

	public static void main(String[] args) {
		Stack <String> pancakes = new Stack<String>();
		
		
		// push/add will add to the top of the stack (stack of papers)
		pancakes.add("pancake"); // add or push
		pancakes.add("butter");
		pancakes.add("pancake");
		pancakes.add("syrup");
		
		String taste = "";
		StringBuilder st = new StringBuilder();
		
		
		
		// is empty will return true if it is empty
		while(!pancakes.isEmpty()) {
			st.append(pancakes.peek());
			// pop will remove and return the top item of the stack // FILO
			// System.out.println(pancakes.pop());
			
			// for in order
			taste+=pancakes.pop() + " ";
		}

		System.out.println(taste);
		
		System.out.println(st.toString());
		System.out.println(st);
		
		// returns top value of stack but will NOT remove it
		if (!pancakes.isEmpty()) {
			pancakes.peek();
		}
	}
}
