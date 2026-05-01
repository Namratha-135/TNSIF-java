package com.tnsif.collectionframework;
import java.util.Stack;
public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		
		s.push(2);
		s.push(4);
		s.push(4);
		s.push(8);
		s.push(9);
		
		System.out.println(s);
		for(int d:s) {
			System.out.println(d);
			
		}

		//peek
		System.out.println(s.peek());
		System.out.println(s.search(34));


	}

}
