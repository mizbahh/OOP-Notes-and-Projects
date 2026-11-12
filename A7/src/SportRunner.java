/*
 * Mizbah Ateeq
 * November 10, 2024
 * COP 3330
 * Assignment 7: Interfaces
 */

import java.util.*;
import java.io.*;

public class SportRunner {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			// scan in file name
			System.out.println("What's the input file name?");
			String fileName = scan.nextLine();
			// open file & scan
			Scanner fileScanner = new Scanner (new File(fileName));

			// scan in number of teams 
			int n = Integer.parseInt(fileScanner.nextLine());

			ArrayList<Sports> teams = new ArrayList<>();

			// scan team types for team nums
			for (int i = 0; i < n; i++) {
				String teamType = fileScanner.nextLine();
				// create teams according to sport type
				if (teamType.equals("Football")) {
					teams.add(new Football(i));
				}
				else if (teamType.equals("Basketball")) {
					teams.add(new Basketball(i));
				}
			}

			// scan in number of scores
			int s = Integer.parseInt(fileScanner.nextLine());

			// scan in scores
			for (int i = 0; i < s; i++) {
				String[] scorePoints = fileScanner.nextLine().split(" ");
				// scan in team id for first part of line
				int teamID = Integer.parseInt(scorePoints[0]);
				// scan in point amount for 2nd part of line
				String pointAmt = scorePoints[1];

				// assign point value according to if s, m, or l
				Sports team = teams.get(teamID);
				if (pointAmt.equals("s")) {
					team.score_small();
				} else if (pointAmt.equals("m")) {
					team.score_med();
				} else if (pointAmt.equals("l")) {
					team.score_large();
				}
			}
			
			// sort teams
			Collections.sort(teams);
			
			// print out teams
			for (int i = 0; i < teams.size(); i++) {
			    System.out.println(teams.get(i));
			}
			
			// close scanners
			scan.close();
			fileScanner.close();
			
		} 
		
		// catch file not found exception
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
