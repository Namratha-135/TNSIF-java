package com.tnsif.collectionframework;

import java.util.Collections;
import java.util.ArrayList;

//demo for comparable (user defined class)

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("name " +name +"Age " +age);
	}
	
	
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
		
	}
}


public class Comparabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> al=new ArrayList<>();
		al.add(new Person("john",30));
		al.add(new Person("jushma",7));
		al.add(new Person("gushma",79));
		al.add(new Person("mushma",57));
		
		Collections.sort(al);
		
		for(Person g:al) {
			g.display();
		}
		
	}
}
