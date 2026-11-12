/*
 * Mizbah Ateeq
 * October 6, 2024
 * COP 3330
 * Assignment 3 - Method Overloading, Comparable and File I/O
 */

import java.io.*;
import java.util.*;

public class HalloweenRunner {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ask for input filename & scan in
		System.out.println("What's the input file name?");
		Scanner scan = new Scanner(System.in);
		String inputFileName = scan.nextLine();
		
		// create array list of halloween costumes
		ArrayList<HalloweenCostumes> costumesList = new ArrayList<>();

		// read costumes from file
		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
			int numberOfCostumes = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < numberOfCostumes; i++) {
				String[] parts = br.readLine().trim().split(" ");

				String name;
				if (parts[0].equals("-1")) {
					// set equal to null is name is -1
					name = null; 
				} else {
					// else, use actual name
					name = parts[0];
				}

				double cost;
				if (parts[1].equals("-1")) {
					// set cost equal to -1 if -1
					cost = -1; 
				} else {
					// else, parse cost
					cost = Double.parseDouble(parts[1]);
				}

				int wantFactor;
				if (parts[2].equals("-1")) {
					// set wantFactor equal to -1 if -1
					wantFactor = -1; 
				} else {
					// else, parse want factor
					wantFactor = Integer.parseInt(parts[2]); 
				}

				HalloweenCostumes costume;

				// call  correct constructor based on data
				if (name == null && cost < 0 && wantFactor < 0) {
					costume = new HalloweenCostumes(); // default if no info
				} else if (name == null) {
					// if name null but other factors present
					costume = new HalloweenCostumes(cost, wantFactor);
				} else if (wantFactor < 0) {
					// if wantFactor -1 but other two present
					costume = new HalloweenCostumes(name, cost);
				} else if (cost < 0) {
					// if cost -1 but name and want factor available 
					costume = new HalloweenCostumes(name, wantFactor);
				} else {
					//  if all info available
					costume = new HalloweenCostumes(name, cost, wantFactor);
				}

				// add costume object to the list
				costumesList.add(costume);
			}
		} catch (IOException e) {
			System.out.println("Error reading file " + e.getMessage());
			return;
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format in file " + e.getMessage());
			return;
		}

		// calculate coolness for each costume
		for (int i = 0; i < costumesList.size(); i++) {
			HalloweenCostumes costume = costumesList.get(i);
			costume.calcCoolness();
		}

		// sort costumes by coolness
		Collections.sort(costumesList);

		// ask for output file name
		System.out.println("What's the output file name?");
		String outputFileName = scan.nextLine();

		// write to output file
		try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
			writer.println("CostumeName CoolnessScore Cost WantFactor");
			for (int i = 0; i < costumesList.size(); i++) {
				HalloweenCostumes costume = costumesList.get(i);
				writer.printf("%s %d %.2f %d\n", costume.getName(), costume.getCoolness(), costume.getCost(), costume.getWantFactor());
			}
		} catch (IOException e) {
			System.out.println("Error writing to file " + e.getMessage());
		}

		scan.close();
	}
}
