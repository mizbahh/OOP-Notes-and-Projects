/*
 * Mizbah Ateeq
 * October 26, 2024
 * COP 3330
 * Assignment 5: Stacks
 */

import java.util.*;

public class WordScramble {

	public static String encode(String input) {
		// create a stack object
		Stack <String> words = new Stack<String>();


		//create a string or a stringBuilder object
		StringBuilder st = new StringBuilder();


		// iterate over the input string looking at each character
		for (int i=0; i<input.length(); i++) {
			char current = input.substring(i, i + 1).charAt(0);

			// if it is a 1, do nothing
			if (current != '1') {
				// if it is a 2, add to the String/StringBuilder what pops out of the stack
				if (current == '2') {
					// make sure stack not empty before popping
					if (!words.isEmpty()) {
						st.append(words.pop());
					}
				} 
				// if vowel, add to the stack
				else if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
					words.push(String.valueOf(current));
				} 
				// otherwise, if none true, add to the string (consonants)
				else {
					st.append(current);
				} 
			}
		}

		// return the String/StringBuilder (if using StringBuilder, return the string)
		return st.toString(); 
	}



	public static void main(String[] args) {
		System.out.println(encode("1top2"));
		System.out.println(encode("11top2e1cat22"));
		System.out.println(encode("111tom2op2it2"));
		System.out.println(encode("11top2i1tom22"));
		System.out.println(encode("1cat2"));
	}



}
