package com.tnsif.abstractiondemo;

abstract class Demo{
	public void calling() {
		System.out.println("calling");
	}
	public abstract void AllIntegration();
	public abstract void SateliteDemo();
	public abstract void Healthmonitoring();
}

class Test1 extends Demo{
	//@override
	public void AllIntegration() {
		System.out.println("welcome");
	}
	//@override
	public void SateliteDemo() {
		System.out.println("welcome to python");
	}
	//@override
	public void Healthmonitoring() {
		System.out.println("welcome to ai");
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t= new Test1();
		t.AllIntegration();
		t.SateliteDemo();
		t.Healthmonitoring();

	}

}
