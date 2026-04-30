package com.tnsif.encapsulationdemo;

class Human{
	private int age;
	private String name;
	
	//getter and setter method
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
public class Encapsulationprogram {

	public static void main(String[] args) {
		Human h=new Human();
		h.setAge(21);
		h.setName("Rahul");
		
		System.out.println(h.getAge());
		System.out.println(h.getName());
		
		h.setAge(25);
		h.setName("Nams");
		
		System.out.println(h.getAge());
		System.out.println(h.getName());
		
	}
	
	}

}
