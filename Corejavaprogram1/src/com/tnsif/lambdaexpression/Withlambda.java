package com.tnsif.lambdaexpression;
//demo for lambda expression

@FunctionalInterface
interface Draw{
	public void draw();
}

public class Withlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=70;
		Draw d=()->{
			System.out.println("Drawing " +width);};
			d.draw();
		}

	}


