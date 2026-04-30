package com.tnsif.polymorphismdemo;

class Hello{
	Hello(int a){
		System.out.println("Num:"+a);
	}
	Hello(int b, String c){
		System.out.println("Num:"+b+" Name:"+c);
	}
}
public class ConstructorOverload {
	public static void main(String[] args) {
		Hello h=new Hello(2);
		Hello h1=new Hello(2,"Pragis");
		
	}
}


