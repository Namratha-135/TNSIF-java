package com.tnsif.accessmodifierdemo;

public class PublicDemo {
	int a=9;
	public String s ="Nams";

	public void display() {
		System.out.println("welcome");
	}
	public static void main(String[] arg) {
		 PublicDemo p=new PublicDemo();
		 System.out.println(p.a);
		 System.out.println(p.s);
		 p.display();
	}

}
