package com.tnsif.scannerclassdemo;
import java.util.Scanner;

public class mainmethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the person name");
		String name=sc.next();
		System.out.println("Enter the income");
		int income=sc.nextInt();
		
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcalculation t=new Taxcalculation();
		t.CalculateTax(pp);
		
		System.out.println("After tax calculation");
		System.out.println(pp);
		
				

	}

}
