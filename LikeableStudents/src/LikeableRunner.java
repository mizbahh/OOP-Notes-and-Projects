import java.util.PriorityQueue;
import java.util.Scanner;

public class LikeableRunner {
	
	public static void menu() {
		System.out.println("1. Add Student");
		System.out.println("2. Help Student");
		System.out.println("3. Check who is next");
		System.out.println("4. Leave");


	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int option = 0;
		
		// priority queue automatically uses comparable
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		
		// sorts by value, then sorts by name
		
		do {
			menu();
			option=scan.nextInt();
			scan.nextLine();
			
			switch(option) {
				case 1:
					System.out.println("What is the student's name?");
					String name = scan.nextLine();
					System.out.println("How much do you like this student?");
					int like = scan.nextInt();
					
					// adding straight to priority queue
					pq.add(new Student(name, like));
					
					break;
					
				// help student - removing them from the queue
				case 2:
					if(pq.isEmpty()) {
						System.out.println("Nobody is in line");
						break;

					}
					
					// poll removes the item from the priority Queue - same as pop
					System.out.println(pq.poll());
					break;
				
				case 3:
					if(pq.isEmpty()) {
						System.out.println("Nobody is in line");
						break;

					}
					
					// peek checks who's next
					System.out.println(pq.peek());
					break; 
					
					


			}
			
		} while (option!=4);

	}

}
