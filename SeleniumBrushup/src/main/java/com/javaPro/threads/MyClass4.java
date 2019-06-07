package com.javaPro.threads;

public class MyClass4 {

	public static void main(String[] args) {
		Runnable obj1=()-> {
				for(int i=1; i<=5; i++) {
					System.out.println("Hi");
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}
			};
		
		Runnable obj2=()-> {
				for(int i=1; i<=5; i++) {
					System.out.println("Hello");
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}
			};
       
       Thread t1=new Thread(obj1);
       Thread t2=new Thread(obj2);
       
       t1.start();
	   try {Thread.sleep(500);} catch (InterruptedException e) {}
	   t2.start();

       
	}

}
