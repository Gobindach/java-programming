package com;

import static java.lang.System.*;

// Encapsulated Class
class BankAccount {
    // 1. Private variables hide data from direct external access
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    // 2. Public getters provide safe read access
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // 3. Public methods/setters enforce data validation rule check
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount; 
        } else {
            out.println("Error: Invalid deposit amount."); // Uses static import
        }
    }
}

public class Encapsulation_Example {
	
	public static void main(String[] args)
	{
		// Create an instance of the encapsulated class
		BankAccount account = new BankAccount("Alice", 1000.0);

		// Direct variable modification is blocked:
		// account.balance = -500.0; // Compile Error!

		// Data manipulation must pass through validation methods
		account.deposit(500.0); 

		// Accessing data through the public getter interface
		out.println(account.getAccountHolder() + "'s Net Balance: " + account.getBalance());
	}

}
