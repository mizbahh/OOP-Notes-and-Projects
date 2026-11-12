import java.util.*;

public class DenkkonianSim {

	// we create these objects so we can use them in diff programs
	
	public static void main(String[] args) {
		player play = new Player("Cade", 100);
		
		BadGuy [] bgArray = new BadGuy[4];
		for (int i=0; i<4; i++) {
			bgArray[i] = new BadGuy(10);
		}
		
		//bgArray[i] 
		Scanner scan = new Scanner(System.in);
		
		boolean keepPlaying=true;
		
		System.out.println("Welcome to the Denkkonian Empire.");
		System.out.println("You are being attacked by a hoard of " + bgArray[0].getName());
		
		while (keepPlaying) {
			
			System.out.println("What do you do?");
			System.out.println("1. Check Stats");
			System.out.println("2. Attack!");
			System.out.println("3. Heal!");
			System.out.println("4. Run away");
			int option=scan.nextInt();
			
			switch option {
				case 1:
					System.out.print("Name: " + play.getName());
					if (play.isDead() ) {
						System.out.println("(DEAD)");
					} else {
						System.out.println(" (Very much ALIVE)");
					}
					// System.out.println("HP: " +play.getCurrent");
					System.out.println("Potions: " + play.getPotions());
					break;
				case 2:
					if(!play.isDead()) {
						System.out.println("These can be attacked!");
						for (int i=0; i<4; i++) {
							if (bgArray[i] == null) {
								System.out.println((i+1) +".EMPTY");
							} else {
								System.out.println((i+1) + "." + bgArray[i].getName() + " ("+bgArray[i].getCurrentHP()+")");
							}
						}
						System.out.println("Whick do you attack?");
						int index=scan.nextInt();
						int damg= play.attack();
						if (bgArray[index-1]!= null ) {
							bgArray[index-1].damage(damg);
							System.out.println("You did " + damg + "damage");
						}
					}
				case 4:
					keepPlaying=false;
					break;
			}
	
			for(int i=0; i<4; i++) {
				// Remove any dead BadGuy
				// null is all lowercase
				if (bgArray[i]!= null && bgArray[i].isDead()) {
					bgArray[i]=null;
				}
				
				// if there is a BadGuy at this location make him attack!!!
				if (bgArray[i]!=null) {
					int damg = bgArray[i].attack();
					play.damage(damg);
					System.out.println(damg);

				}
			}
				
		}

	}

}
