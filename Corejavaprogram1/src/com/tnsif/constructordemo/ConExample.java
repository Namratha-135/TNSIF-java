package com.tnsif.constructordemo;

public class ConExample {
	
	ConExample(){
		System.out.println("Default Constructor");
		
	}
	ConExample(int a,String b){
		System.out.println("2 Parameters");
	}
	ConExample(int r){
		System.out.println("1 Parameter");
	}
	ConExample(int s,int b,int d){
		System.out.println("3 Parameter");
	}

	public static void main(String[] args) {
		ConExample c= new ConExample();
		ConExample c1= new ConExample(3,"nams");
		ConExample c2= new ConExample(7);
		ConExample c3= new ConExample(4,5,6);
		
		

	}

}
