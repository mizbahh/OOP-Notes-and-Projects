import java.util.ArrayList;

public class Runner2 {
	
	public static void printMap(ArrayList<Unit> units) {
		Unit[][] map = new Unit[10][10];

		System.out.println("Map:");
		for (Unit[] row : map ) {
			for (Unit u: row) {
				if (u==null) {
					System.out.print(".");
				} else  {
					System.out.print(u.getName());
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Unit> unitList = new ArrayList<Unit>();
		// 30:00??
		// if u create a new variable for a list or a rock, it can point toboth
		Unit[][] unitMap = new Unit[10][10];
		
		Rock r = new Rock("R", 2, 4);
		unitList.add(r);
		// row, column - y, x
		unitMap[4][2]=r;
		
		printMap(unitList);
		
		Plane p = new Plane("P", 1, 1);
		unitList.add(p);
		unitMap[1][1] = p;
		printMap(unitMap);
		
		if(unitList.get(0).canMove(unitList, 5, 0)) {
			unitList.get(0).setPosition(5, 0);
			unitMap[0][5] = unitList.get(0);
			unitMap[4][2]=null;
		} else {
			System.out.println("You cannot move here!"); // rock cannot move!
		}
		
		printMap(unitList);
		
		if(unitList.get(1).canMove(unitList, 5, 0)) {
			unitList.get(1).setPosition(5, 0);
			unitMap[0][5] = unitList.get(1);
			unitMap[1][1]=null;
		} else {
			System.out.println("You cannot move here!"); // rock cannot move!
		}
		
		printMap(unitMap);


		// if b is abstaract, it cannot be initialized ; the child has to be

		

		
	}
}
