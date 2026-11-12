
public class Book {

	private String name;
	private double price;
	
	public Book(String name, double price) {
		this.name=name;
		this.price = price;
		
	}
	
	public void displayDetails() {
		System.out.println("Name: " +this.name);
		System.out.println("Price: " + this.price);

	}
	
	
}
