/*
 * Mizbah Ateeq
 * October 19, 2024
 * COP 3330
 * Assignment 4: File I/O & Linked Lists
 */

import java.io.*;
import java.util.*;

public class Store {
	
	// declare linked list for main customer line
    private static LinkedList<Customer> customerMain = new LinkedList<Customer>();
    // declare linked list for return line when need to move customers to it
    private static LinkedList<Customer> customerReturn = new LinkedList<Customer>();


    public static void main(String[] args) {
    	
    	// scan in file name
        System.out.println("What's the input file name?");
        Scanner scan = new Scanner(System.in);
        String inputFileName = scan.nextLine();

        // scan in customers from input file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {       	
        	// read number of customers from first line
            int numberOfCustomers = Integer.parseInt(br.readLine()); 
            // read lines for amount of customers
            for (int i = 0; i < numberOfCustomers; i++) {
                String[] data = br.readLine().split(" "); 
                // allocate customer names and if returning or not to appropriate data types
                String name = data[0];
                boolean ifReturning = Boolean.parseBoolean(data[1]);
                // add each customer to main checkout line
                customerMain.add(new Customer(name, ifReturning));
            }            
        } 
        
        // if file name not found
        catch (FileNotFoundException e) {
        	// print error + exit
            System.out.println("File \"" + inputFileName + "\" not found");
            return;
        } 
        
        // if error reading the file
        catch (IOException e) {
        	// print error + exit
            System.out.println("Error occurred while reading file\n" + e.getMessage());
            return;
        } 

        // run loop while customers still in either line
        while (!customerMain.isEmpty() || !customerReturn.isEmpty()) {
        	
            // process two customers at a time
            for (int i = 0; i < 2 && !customerMain.isEmpty(); i++) {
            	// remove customer from main line while processing
                Customer customer = customerMain.poll(); 
                // if true, move to return line & print out action
                if (customer.getBusiness()) {
                    System.out.println(customer.getName() + " was forwarded to the return line.");
                    customerReturn.add(customer); 
                } // if false, check out customer & print out action
                else {
                    System.out.println(customer.getName() + " checked out");
                }
            }

            // process one customer from return line
            if (!customerReturn.isEmpty()) {
            	// remove from return line while processing
                Customer returningCustomer = customerReturn.poll(); 
                // print out customer and action
                System.out.println(returningCustomer.getName() + " returned an item");
            }
        }
        
        scan.close();
    }
}
