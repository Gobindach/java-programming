/**
 * 
 */
package com;

public class Hierarchical_inheritance {

	// 1. Parent (Base) Class
	static class Animal {
		String name;

		public Animal(String name) {
			this.name = name;
		}

		public void eat() {
			System.out.println(name + " is eating.");
		}
	}

	// 2. First Child (Derived) Class inheriting from Animal
	static class Dog extends Animal {
		public Dog(String name) {
			super(name); // Passes the name parameter to the Parent constructor
		}

		public void bark() {
			System.out.println(name + " is barking.");
		}
	}

	// 3. Second Child (Derived) Class inheriting from Animal
	static class Cat extends Animal {
		public Cat(String name) {
			super(name); // Passes the name parameter to the Parent constructor
		}

		public void meow() {
			System.out.println(name + " is meowing.");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create an instance of the first child class
		Dog myDog = new Dog("Buddy");
		myDog.eat();  // Inherited method from Parent class
		myDog.bark(); // Specific method from Child class

		System.out.println("--------------------");

		// Create an instance of the second child class
		Cat myCat = new Cat("Whiskers");
		myCat.eat();  // Inherited method from Parent class
		myCat.meow(); // Specific method from Child class
		
		// Note: myCat.bark() is illegal because Cat does not inherit from Dog.
	}

}
