/*
 * Mizbah Ateeq
 * Assignment 2: Objects
 * COP 3330
 * September 15, 2024
 */

import java.util.*;

public class Bank {

	// private static array of Account with size 5
	private static Account[] accounts = new Account[5];

	public static void main(String[] args) {
		System.out.println("Welcome to Knightro Banking:");

		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		int option;

		while (!exit) {

			System.out.println("What would you like to do?");

			// print out accounts
			for (int i=0; i<accounts.length; i++) {
				if (accounts[i]==null)
					System.out.println(i+1 +". Empty");
				else 
					System.out.println(i+1 +". " + accounts[i].getName());
			}

			// take in user input
			option = scan.nextInt();

			if (option >= 1 && option <= 5) {
				int i = option - 1;

				// create new account if empty
				if (accounts[i] == null) {
					System.out.println("Creating a new account.");

					System.out.println("What is the name of the account:");
					scan.nextLine();
					String name = scan.nextLine();

					System.out.println("What is the interest rate?");
					double interest = scan.nextDouble();

					// create account
					accounts[i] = new Account(name, interest);

				} else {
					System.out.println("What would you like to do?");
					System.out.println("1. Deposit Funds");
					System.out.println("2. Withdraw Funds");
					System.out.println("3. Check Balance");
					System.out.println("4. Calculate Interest");
					System.out.println("5. Close Account");
					System.out.println("What would you like to do?");
					int accountOption = scan.nextInt();

					switch(accountOption) {
					case 1:
						// deposit 
						System.out.println("How much money would you like to deposit?");
						double depositInput = scan.nextDouble();
						if (accounts[i].deposit(depositInput)) {
							System.out.printf("You have added $%.2f.%n", depositInput); 
						} else {
							System.out.println("This is an invalid amount");
						}
						break;

					case 2:
						// withdraw
						System.out.println("How much would you like to withdraw?");
						double withdrawInput = scan.nextDouble();
						if (accounts[i].withdraw(withdrawInput)) {
							System.out.printf("You have withdrawn $%.2f.%n", withdrawInput);
						} else {
							System.out.println("This is an invalid amount."); 
						}
						break;

					case 3:
						// get balance
						System.out.printf("You have $%.2f.%n", accounts[i].getBalance());
						break;

					case 4:
						// calculate interest
						System.out.println("How many months have passed?");
						int months = scan.nextInt();
						accounts[i].calcInterest(months);
						System.out.println("Done.");
						break;

					case 5:
						// close account
						accounts[i] = null;
						System.out.println("Account closed");
						break;

					default:
						System.out.println("Invalid option, please try again");
					}
				}

			} else if (option == 6) {
				exit = true;
			} else {
				System.out.println("Invalid option, please try again");
			}

		}

		System.out.println("Goodbye");
	}

}
