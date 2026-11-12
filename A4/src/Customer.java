/*
 * Mizbah Ateeq
 * October 19, 2024
 * COP 3330
 * Assignment 4: File I/O & Linked Lists
 */

public class Customer {
	
	// declare variables
	private String name;
	private boolean ifReturning;
	
	// constructor for customer name + ifReturning boolean
	public Customer(String name, boolean ifReturning) {
		this.name=name;
		this.ifReturning=ifReturning;
	}
	
	// name getter
	public String getName() {
		return name;
	}
	
	// ifReturning getter
	public boolean getBusiness() {
		return ifReturning;
	}
}
