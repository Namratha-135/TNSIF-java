package com.tnsif.multithreading;
public class WorkerThread extends Thread {
public void run() { // runnable state
for(int i=1;i<=5;i++) {
System.out.println(Thread.currentThread().getName()+"->Step "+i);
try {
Thread.sleep(500);
}
catch(Exception e) {}
}
}
public static void main(String[] args) {
WorkerThread w1=new WorkerThread();// new state(object created)
WorkerThread w2=new WorkerThread();
w1.setName("Thread A"); 
w2.setName("Thread B");
w1.start();// running state
w2.start();
}
}