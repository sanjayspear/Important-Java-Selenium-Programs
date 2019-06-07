package com.javaPro.threads;

class Hi extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class Hello extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

public class MyClass {

	public static void main(String[] args) {
	   Hi obj1=new Hi();
	   Hello obj2=new Hello(); 
	   
	   obj1.start();
	   obj2.start();
	}

}
