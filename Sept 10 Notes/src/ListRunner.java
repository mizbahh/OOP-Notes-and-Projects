import java.util.*;

public class ListRunner {

	public static void main(String[] args) {

		// head aka first node in linked list
		Node denckList = new Node(7);

		// creates new node, not yet connected to previous
		denckList.insert(100);

		// continues to add as 2nd node, not in order of adding
		denckList.insert(10);

		// using recursion to get to right spot
		denckList.insertEnd(22);

		// delete the first node
		// makes first node, the next one
		denckList=denckList.getNext();

		// can't delete the head w/n the fcn
		denckList.deleteValue(100);
		denckList.deleteValue(22);

		denckList.insert(30);
		denckList.insert(50);
		denckList.insert(35);


		System.out.println(denckList.getValue());
		denckList.printList();

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(10);
		arrList.add(35);

		System.out.println(arrList.toString());

		for (int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

		// removes 1st index (aka arr[1] = 2nd val)
		arrList.remove(1);
		System.out.println(arrList.toString());
	}

}
