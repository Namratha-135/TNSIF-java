package com.tnsif.multithreading;
// demo for synchronization

public class Example {
	
 synchronized void display() {
 Thread g=Thread.currentThread();
 for(int i=0;i<=3;i++) {
 try {
 Thread.sleep(3000);
 System.out.println(g.getName()+" "+i);
 }
 catch(Exception p) {
 
 }
 }
 }
}

public class T extends Thread{
Example e;
T(Example e){
this.e=e;
}
public void run() {
e.display();
}
}

public class Tsynch {
public static void main(String[] args) {
Example e=new Example();
T t1=new T(e);
T t2=new T(e);
T t3=new T(e);
t1.start();
t2.start();
t3.start();
}
}