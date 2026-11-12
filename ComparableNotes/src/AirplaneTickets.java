
public class AirplaneTickets implements Comparable <AirplaneTickets> {

	// 1st priority to check
	private String airlineName;
	// 2nd sort by price
	private double price;
	// 3rd check
	private int connections;

	public AirplaneTickets(String n, double p, int c) {
		this.airlineName=n;
		this.price = p;
		this.connections=c;
	}

	public String toString() {
		return "Airline: " + this.airlineName + 
				" ($" + this.price + ", "
				+ this.connections + ")";

	}




	public int compareTo(AirplaneTickets other) {
		// priority if one of them is spirit and the other isn't, spirit comes last
		if (this.airlineName.equals("Spirit") && !
				other.airlineName.equals("Spirit")) {
			return 1;
		}
		if (!this.airlineName.equals("Spirit") &&
				other.airlineName.equals("Spirit")) {
			return -1;
		}

		// 2nd priority: who has the lower price
		if (this.price - other.price > 0) {
			return 1;
		}
		if (this.price - other.price < 0) {
			return -1;
		}

		// who has the fewer connections
		return this.connections - other.connections;
	}



}
