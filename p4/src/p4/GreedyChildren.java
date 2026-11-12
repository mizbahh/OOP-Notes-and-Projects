/*=============================================================================
| Assignment: PA04 - Implementing a greedy algorithm to solve the
|              problem of maximizing the number of happy children
|
| Author: [Your Name]
| Language: Java
|
| To Compile: javac GreedyChildren.java
|
| To Execute: java GreedyChildrenDriver
|
| Class: COP3503 - CS II Spring 2025
| Instructor: Dr. Andrew Steinberg
| Due Date: [Your Due Date]
|
+=============================================================================*/
package p4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GreedyChildren {
    private int numCandyPieces;
    private int numChildren;
    private String greedyFile;
    private String candyFile;
    private int[] greedyFactors;
    private int[] sweetnessFactors;
    private int happyChildren;
    private int angryChildren;

    public GreedyChildren(int numCandyPieces, int numChildren, String greedyFile, String candyFile) {
        this.numCandyPieces = numCandyPieces;
        this.numChildren = numChildren;
        this.greedyFile = greedyFile;
        this.candyFile = candyFile;
        this.greedyFactors = new int[numChildren];
        this.sweetnessFactors = new int[numCandyPieces];
        this.happyChildren = 0;
        this.angryChildren = 0;
    }

    public void read() {
        try {
            // Read greedy factors
            Scanner greedyScanner = new Scanner(new File(greedyFile));
            for (int i = 0; i < numChildren; i++) {
                if (greedyScanner.hasNextInt()) {
                    greedyFactors[i] = greedyScanner.nextInt();
                }
            }
            greedyScanner.close();

            // Read sweetness factors
            Scanner candyScanner = new Scanner(new File(candyFile));
            for (int i = 0; i < numCandyPieces; i++) {
                if (candyScanner.hasNextInt()) {
                    sweetnessFactors[i] = candyScanner.nextInt();
                }
            }
            candyScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public void greedyCandy() {
        // Reset counters
        happyChildren = 0;
        
        // Sort both arrays
        Arrays.sort(greedyFactors);
        Arrays.sort(sweetnessFactors);
        
        int childIndex = 0;
        
        // For each candy piece (from least sweet to most sweet)
        for (int i = 0; i < numCandyPieces && childIndex < numChildren; i++) {
            // If this candy is sweet enough for the current child
            if (sweetnessFactors[i] >= greedyFactors[childIndex]) {
                happyChildren++;
                childIndex++; // Move to next child
            }
            // If not sweet enough, continue to next candy
        }
        
        // Calculate angry children
        angryChildren = numChildren - happyChildren;
    }

    public void display() {
        System.out.println(happyChildren);
        System.out.println(angryChildren);
    }
}