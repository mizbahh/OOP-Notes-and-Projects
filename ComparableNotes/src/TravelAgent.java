import java.util.ArrayList;
import java.util.Collections;

public class TravelAgent {

	public static void main(String[] args) {
		
		ArrayList<AirplaneTickets> tickets = new ArrayList<AirplaneTickets>();
		
		AirplaneTickets t = new AirplaneTickets("Spirit", 50.00, 2);
		tickets.add(t);
		t = new AirplaneTickets("Spirit", 125.00, 0);
		tickets.add(t);
		t = new AirplaneTickets("Delta", 350.00, 1);
		tickets.add(t);
		t = new AirplaneTickets("Delta", 10000.00, 2);
		tickets.add(t);
		t = new AirplaneTickets("The Fun Bus", 25.00, 5);
		tickets.add(t);
		t = new AirplaneTickets("Southwest", 350.00, 0);
		tickets.add(t);

		AirplaneTickets t2 = new AirplaneTickets("Southwest", 350.00, 6);
		System.out.println(t2.compareTo(t));
		
		Collections.sort(tickets);
		
		for (AirplaneTickets at : tickets) {
			System.out.println(at);
		}

	}

}
