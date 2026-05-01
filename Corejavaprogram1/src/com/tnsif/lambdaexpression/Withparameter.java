package com.tnsif.lambdaexpression;
//demo for parameter

interface Demo{
	String say(String message);
}
public class Withparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=(message)->{
			String s1="i would like to say hi,";
			String s2=s1+message;
			return s2;
		};
		System.out.println(d.say("Time is precious"));

	}

}
