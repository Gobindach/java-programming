package com;

import static java.lang.System.*;

public class Copy_Constructor {

	// Inside class to store object data
	static class Product {
		private String name;
		private double price;

		// 1. Regular parameterized constructor
		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}

		// 2. The Copy Constructor
		// It accepts an object of the same class type as an argument
		public Product(Product otherProduct) {
			this.name = otherProduct.name;   // Copies string reference/value
			this.price = otherProduct.price; // Copies primitive value
		}

		// Methods to display object state
		public void displayInfo() {
			out.println("Product: " + name + " | Price:  ₹" + price);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1. Create the original source object
		Product originalProduct = new Product("Laptop", 999.99);
		out.print("Original -> ");
		originalProduct.displayInfo();

		// 2. Pass the original object into the copy constructor
		Product clonedProduct = new Product(originalProduct);
		out.print("Cloned   -> ");
		clonedProduct.displayInfo();
		
		// 3. Modifying the original does not change the clone
		originalProduct = new Product("Smartphone", 599.99); 
		
	}

}
