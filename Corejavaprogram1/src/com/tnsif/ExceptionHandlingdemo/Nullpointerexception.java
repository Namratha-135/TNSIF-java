package com.tnsif.ExceptionHandlingdemo;

public class Nullpointerexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(Exception g) {
			System.out.println(g.getMessage());
		}

	}

}
