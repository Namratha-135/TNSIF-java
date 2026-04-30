package com.tnsif.ExceptionHandlingdemo;

public class Arthematicexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=50/5;
		System.out.println(n1);
		int n2=50/10;
		System.out.println(n2);
		
		try {
			int n3=50/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		float n4=70/3;
		System.out.println(n4);

	}

}
