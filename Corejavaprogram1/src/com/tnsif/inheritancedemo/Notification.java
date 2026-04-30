package com.tnsif.inheritancedemo;

public class Notification {
    String mes = "default notification";
}

class Pushnotification extends Notification {
    String mes = "push notification";

    void display() {
        System.out.println("child: " + mes);        // child variable
        System.out.println("parent: " + super.mes); // parent variable
    }

    public static void main(String[] args) {
        Pushnotification p = new Pushnotification();
        p.display();
    }
}
