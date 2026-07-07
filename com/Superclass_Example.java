package com;

// Static import allows using 'out.println()' directly
import static java.lang.System.*;

// 1. Define a Superclass (Parent Class)
class Animal {
    String name;

    // Superclass constructor
    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        out.println(name + " makes a generic sound.");
    }
    
}

// 2. Define a Subclass (Child Class)
class Dog extends Animal {
    String breed;

    // Subclass constructor
    Dog(String name, String breed) {
        super(name); // Must call the superclass constructor first
        this.breed = breed;
    }

    @Override
    void makeSound() {
        super.makeSound(); // Optional: Calls the parent's method
        out.println(name + " barks! (Breed: " + breed + ")");
    }
}

// 3. Your Main Public Class
public class Superclass_Example {

    public static void main(String[] args) {
        // Instantiate the child class
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        
        // Call the overridden method
        myDog.makeSound();
    }
}
