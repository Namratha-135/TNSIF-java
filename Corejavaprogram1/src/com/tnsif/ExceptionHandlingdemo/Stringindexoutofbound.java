package com.tnsif.ExceptionHandlingdemo;

public class Stringindexoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="atria college";
		
		try {
			char ch=str.charAt(20);
		}
		catch(StringIndexOutOfBoundsException r) {
			System.out.println(r);
		}
		System.out.println("Exception caught");

	}

}
