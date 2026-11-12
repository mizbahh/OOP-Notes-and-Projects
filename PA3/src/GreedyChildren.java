/* Mizbah Ateeq
 * Dr. Steinberg
 * COP3503 Spring 2025
 * Programming Assignment 3
 */

import java.io.*;
import java.util.Arrays;

public class GreedyChildren 
{
	// arrays to store greedy & sweetness factors
    private int[] greedyFactors;
    private int[] sweetnessFactors;
    
    // happy & angry children trackers
    private int happyChildren;
    private int angryChildren;

    // main constructor
    public GreedyChildren(int candy, int children, String greedyFile, String candyFile) {
        
    	// initialize arrays + variables
        sweetnessFactors = new int[candy];
    	greedyFactors = new int[children];
        happyChildren = 0;
        angryChildren = 0;

        // call read method for files 
        read(greedyFile, greedyFactors);
        read(candyFile, sweetnessFactors);
    }

    // read files and store the greedy & sweetness factors 
    public void read(String fileName, int [] arr) 
    {
        try 
        {
        	BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int i = 0;

            // read each line
            while ((line = reader.readLine()) != null && i < arr.length) 
            {
            	// convert each line into an int to store in array
                arr[i] = Integer.parseInt(line);
                i++; // increment to next line
            }

            reader.close();
            
        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    
    public void greedyCandy() 
    {
    	// sort greedy & sweetness factors in ascending order
        Arrays.sort(greedyFactors);
        Arrays.sort(sweetnessFactors);

        // children and candy trackers
        int childIndex = 0;
        int candyIndex = 0;

        // distribute candies greedily
        while (childIndex < greedyFactors.length && candyIndex < sweetnessFactors.length) 
        {
            // if candy's sweetness is enough to satisfy child's greed
            if (sweetnessFactors[candyIndex] >= greedyFactors[childIndex]) 
            {
            	// child is happy
                happyChildren++; 
                // move to next child
                childIndex++; 
            }
            
            candyIndex++; // move to next candy
        }

        // calculate angry children leftover 
        angryChildren = greedyFactors.length - happyChildren;
    }

    public void display() 
    {
    	// print out happy and angry children amounts
        System.out.println("There are " + happyChildren + " happy children.");
        System.out.println("There are " + angryChildren + " angry children.");
    }
}