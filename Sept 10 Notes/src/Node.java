
public class Node {

	private int value;
	private Node next; // acts like pointer

	public Node(int v) {
		this.value=v;
		this.next=null;

	}

	public int getValue() {
		return this.value;
	}

	public Node getNext() {
		return this.next;
	}

	// recursion is a function that calls itself as a loop
	// but needs to be to ended
	public void printList() {
		System.out.print(this.value+"->");

		// keeps running
		if (this.next!=null) {
			this.next.printList();
		} else {
			System.out.println("null");
		}
	}

	public void insert(int value) {
		if (this.next!=null) {
			if(this.next.value<=value) {
				// create new node
				Node temp = new Node(value);
				// linking new node with next node
				temp.next=this.next;
				// having previous node point to new node
				this.next=temp;
			} else {
				// goes to the next value
				this.next.insert(value);
			} 
		} else {
			this.insertEnd(value);
		}
	}

	public void insertEnd(int value) {
		// end of list is where it = null
		if (this.next==null) {
			// insert the value
			this.next = new Node(value);
		} else {
			// find next one
			this.next.insertEnd(value);
		}
	}

	public void deleteValue(int value) {
		// to check if not at end
		// if at end, can't do anything
		if (this.next!=null) {
			// find if the next value is what u want to delete
			// next.next.value means jump over 1
			if(this.next.value==value) {
				this.next=this.next.next;
				
			// cmnd a + cmnd i on eclipse aligns everything properly
				
			}
		}
	}

}
