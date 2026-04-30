package com.tnsif.constructordemo;
import java.util.Scanner;
public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the address");
		String address=sc.next();
		
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		Student s=new Student();
		s.setStudentname(name);
		s.setStudentaddress(address);
		s.setStudentid(id);
		System.out.println(s);

	}

}
