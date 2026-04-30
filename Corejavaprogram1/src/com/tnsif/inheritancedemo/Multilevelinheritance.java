package com.tnsif.inheritancedemo;

//Grandparent class
class Grandfather {
 void house() {
     System.out.println("Grandfather owns a house");
 }
}

//Parent class (inherits from Grandfather)
class Fatherr extends Grandfather {
 void car() {
     System.out.println("Father owns a car");
 }
}

//Child class (inherits from Father)
class Daughter extends Fatherr {
 void education() {
     System.out.println("Daughter is well educated");
 }
}

//Main class
public class Multilevelinheritance {
 public static void main(String[] args) {
     Daughter obj = new Daughter();

     obj.house();      // from Grandfather
     obj.car();        // from Father
     obj.education();  // from Daughter
 }
}
