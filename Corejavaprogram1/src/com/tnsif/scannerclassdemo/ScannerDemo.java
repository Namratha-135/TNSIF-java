package com.tnsif.scannerclassdemo;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		String name =sc.next();
	}

}
