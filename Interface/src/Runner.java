import java.util.ArrayList;
import java.util.Collections;

public class Runner {
	
	public static void main (String[] args) {
		ArrayList <Boat> bList = new ArrayList<Boat>();
		bList.add(new Cruise(50));
		bList.add(new Cruise(27));
		bList.add(new AirBoat(32));
		
		
		for (Boat b: bList)
			System.out.println(b);
		System.out.println();
		
		
		Collections.sort(bList);
		
	}

}
