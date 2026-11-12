/* Mizbah Ateeq
 * Dr. Steinberg
 * COP3503 Spring 2025
 * Programming Assignment 2
 */


import java.util.ArrayList;

public class TreasureCoordinates 
{
	public ArrayList<String> determineCoordinates(String digits) 
	{
		
		digits = digits.substring(1, digits.length() - 1); // remove parentheses
		ArrayList<String> coordinates = new ArrayList<>();

		// loop through string, divide into x and y parts
		for (int i = 1; i < digits.length(); i++) 
		{

			// generate possible x and y's
			ArrayList<String> x = possibleCoord(digits.substring(0, i));
			ArrayList<String> y = possibleCoord(digits.substring(i));

			// combine x and y as valid output
			for (int j = 0; j < x.size(); j++) 
			{
				for (int k = 0; k < y.size(); k++) 
				{
					// add to final coordinate list
					coordinates.add("(" + x.get(j) + ", " + y.get(k) + ")");
				}
			}
		}

		return coordinates; // return possible coordinates
	}

	// generate possible coordinates based off digits input
	private ArrayList<String> possibleCoord(String digits) 
	{
		ArrayList<String> coord = new ArrayList<>();

		// check if valid number
		if (isValidNumber(digits)) 
			coord.add(digits);

		// generate all possible numbers & decimals
		for (int i = 1; i < digits.length(); i++) 
		{
			// split coordinate further to test decimal values
			String left = digits.substring(0, i);
			String right = digits.substring(i);

			// check if it passes both boolean functions
			if (isValidNumber(left) && noTrailingZero(right)) 
			{
				coord.add(left + "." + right); // add decimal
			}

		}

		return coord;
	}

	// check for length and leading 0's 
	private boolean isValidNumber(String num) 
	{
		return !(num.length() > 1 && num.startsWith("0")) || num.equals("0");
	}


	// check for trailing zeroes
	private boolean noTrailingZero(String fraction) 
	{
		return !fraction.endsWith("0");
	}
}
