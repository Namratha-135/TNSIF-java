package com.tnsif.inheritancedemo;

	// Parent class
	class Animal {
	    void eat() {
	        System.out.println("Animal is eating...");
	    }
	}

	// Child class (inherits from Animal)
	class Dog extends Animal {
	    void bark() {
	        System.out.println("Dog is barking...");
	    }
	}

	// Main class
	public class Singlelevelinheritance {

	    public static void main(String[] args) {
	        
	        // Creating object of child class
	        Dog d = new Dog();
	        
	        // Calling parent class method
	        d.eat();
	        
	        // Calling child class method
	        d.bark();
	    }
	}

