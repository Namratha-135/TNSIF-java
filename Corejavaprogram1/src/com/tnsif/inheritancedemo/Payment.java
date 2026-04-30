package com.tnsif.inheritancedemo;

public class Payment {
    void process() {
        System.out.println("Processing the payment");
    }
}

class Gpay extends Payment {   // ✅ removed ()
    
    void process() {
        System.out.println("Processing via Gpay");
    }

    void display() {
        super.process();  // calls parent class method
        process();        // calls child class method
    }

    public static void main(String[] args) {
        Gpay g = new Gpay();
        g.display();
    }
}