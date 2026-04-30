package com.tnsif.ExceptionHandlingdemo;

public class Multiplecatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[4];
		
		try {
			int i=number[8];
			System.out.println("world");
		}
		
		catch(ArithmeticException h) {
			System.out.println("welcome");
		}
		catch(StringIndexOutOfBoundsException u) {
		System.out.println("good bye");
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("hi");
		}
		catch(Exception j) {
			System.out.println(j);
			}
	
	}

}
