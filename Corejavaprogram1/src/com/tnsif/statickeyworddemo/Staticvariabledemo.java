package com.tnsif.statickeyworddemo;

class Student{
	String name;
	int id;
	static String collegename="Atria";
	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
		this.collegename=collegename;
	}
	
	void showdetails() {
		System.out.println(" Student: "+ name +" Id: "+ id + " Collegename:" + collegename);
	}
	
	
}
public class Staticvariabledemo {

	public static void main(String[] args) {
		Student s1=new Student("Nams",1);
		Student s2=new Student("Prags",3);
		Student s3=new Student("Niths",4);
        Student s4=new Student("Nisha",7);	
       
        s1.showdetails();
        s2.showdetails();
        s3.showdetails();
        s4.showdetails();
	}

}
