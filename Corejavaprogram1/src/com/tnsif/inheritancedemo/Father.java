package com.tnsif.inheritancedemo;

public class Father {
	int money=20000;
	String car="BMW";
	void drink() {
		System.out.println("Coffee");

	}

}
class child extends Father{
	String cycle="pink";
	void read() {
}

public static void main(String[] args) {
	child c= new child();
	System.out.println("c.money");
	c.drink();
	System.out.println("c.car");
	System.out.println("c.cycle");
	c.read();
}
}	
