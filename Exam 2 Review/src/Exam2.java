import java.util.*;

public class Exam2 implements Comparable<Exam2> {

	public static void Stack () {
		Stack<Integer> st = new Stack<Integer>();
		st.push(9);
		st.push(10);
		System.out.println(st.peek());
		st.push(3);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.push(1);

		/*
		 * 1
		 * 9 
		 **
		 * Print: 10 3 10 10
		 */
	}

	public static void Queue() {
		// FIFO
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(3);
		q.add(5); // add to back
		System.out.println(q.peek()); // peek - first/top value
		System.out.println(q.poll()); // poll - first/top value 
		q.add(6);

		/*
		 * Queue: 5, 6
		 * Print: 3, 3
		 */
	}

	private int a, b, c;

	public Exam2(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public String toString() {
		return "("+a+", "+b+", "+c+")";
	}


	public int compareTo(Exam2 o) {
		// sorting ascending
		return this.a-o.a; 
		// if this before minus = ascending
		// if this after minus = descending
	}

	public static void PriorityQueue() {
		PriorityQueue<Exam2> er = new PriorityQueue <Exam2>();
		er.add(new Exam2(4,5,6));
		er.add(new Exam2(1,5,6));
		er.add(new Exam2(5,7,2));
		System.out.println(er.peek());
		er.add(new Exam2(2,5,6));
		System.out.println(er.poll());
		System.out.println(er.poll());

		/*
		 * Queue: | (4,5,6) | (5,7,2) |
		 * Print: (1,5,6) (1,5,6) (2,5,6)
		 */
	}

	// inheritance q's: 3 questions! 8 points each
	// UML 3 boxes - 10 points
	// fish, zebra and duck ALL extend animal
	// parent class written 
	// children cannot see private variables! use getter to show them
	
	// first line inside constructor - super!
	/* example
	public class Plane extends Unit {

		public Plane(String n, int x, int y) {
			super(n, x, y);
		}
	 */
	
	// write another two methods on top of constructor 
	
	// 2 pt extra credit q at end 
	
	
	public static void main(String[] args) {

		Stack();
		System.out.println();

		Queue();
		System.out.println();

		PriorityQueue();
		System.out.println();






	}



}
