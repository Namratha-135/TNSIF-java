package com.tnsif.ExceptionHandlingdemo;

public class Arrayindexoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[4];
		System.out.println(arr.length);
		
		try {
			int i=arr[8];
		}
		catch(Exception h) {
			System.out.println(h);
		}

	}

}
