import java.util.*;
import java.io.*;

public class BFSExample {

	public static void printDistance(int [][] map) {
		System.out.println("Distance Map");
		for (int r=0;r<map.length; r++) {
			for (int c=0; c<map[r].length; c++) {
				System.out.println(map[r][c] + "\t");
			}
			System.out.println();
		}
	}

	public static void printMap(int [][] map) {
		System.out.println("Distance Map");
		for (int r=0;r<map.length; r++) {
			for (int c=0; c<map[r].length; c++) {
				System.out.println(map[r][c] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("input.txt"));

		int rows = scan.nextInt();
		int col = scan.nextInt();

		scan.nextLine();

		char [][] inputMap = new char[rows][col];
		int [][] distanceMap = new int[rows][col];

		// -1 means have not visited that particular space yet
		for (int r=0; r<rows; r++) {
			Arrays.fill(distanceMap[r], -1);
			String line = scan.nextLine();
			for (int c=0;c<col;c++) {
				inputMap[r][c] = line.charAt(c);
			}
		}

		printDistance(distanceMap);

		Queue<Point> que = new LinkedList<Point>();

		// starting point
		que.add(new Point(0,0));
		distanceMap[0][0] = 0;


		while(!que.isEmpty()) {
			// grab the first element in the queue
			Point temp = que.poll();
			int currentDistance = distanceMap[temp.getRow()][temp.getCol()];
			currentDistance++;
			int tempR = temp.getRow();
			int tempC = temp.getCol();
			
			int[] rowChange = {-1,0,1,0};
			int[] colChange = {0,-1,0,1};
			
			for (int i=0; i<4;i++) {
				if (tempR+rowChange[i]>=0 && 
						tempR+rowChange[i]<rows &&
						tempC+colChange[i]>=0 &&
						tempC+colChange[i]<col) {
					// in bounds
					
					
				}
			}
			
			// check up, if in bounds
			if (temp.getRow() -1 >= 0 && inputMap[temp.getRow()-1][temp.getCol()]=='.' 
					&& distanceMap[temp.getRow()-1][temp.getCol()]==-1) {
				que.add(new Point(temp.getRow(), temp.getCol()));
				distanceMap[temp.getRow()-1][temp.getCol()] = currentDistance;
			}

			// check down, if in bounds
			if (temp.getRow() +1 >= 0 && inputMap[temp.getRow()+1][temp.getCol()]=='.'
					&& distanceMap[temp.getRow()+1][temp.getCol()]==-1) {
				que.add(new Point(temp.getRow(), temp.getCol()));
				distanceMap[temp.getRow()+1][temp.getCol()] = currentDistance;
			}
		}

		scan.close();	

	}

}
