package com.tnsif.finalkeyworddemo;
//demo for final(u can't override)

class Ecommerceplatform{
    void calculate() {
		System.out.println("base discount 10%");
	}
}
class Amazon extends Ecommerceplatform{ //can't inheritance
	
	void calculate() {
		System.out.println("base discount 20%");
	}
}
public class Finalmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Amazon a=new Amazon();
        a.calculate();
	}

}
