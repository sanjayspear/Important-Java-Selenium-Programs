package com.javaPro.threads;

public class MyClass7 {

	public static void main(String[] args) throws InterruptedException {
		
       Thread t1=new Thread(()-> {
			for(int i=1; i<=5; i++) {
				System.out.println("Hi");
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		});
       Thread t2=new Thread(()-> {
			for(int i=1; i<=5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		});
       t1.setName("Thread TOM");
       t2.setName("Thread SAM");
       System.out.println(t1.getName()+ " is alive "+t1.isAlive());
	   System.out.println(t2.getName()+ " is alive "+t2.isAlive());
       
       t1.start();
	   try {Thread.sleep(500);} catch (InterruptedException e) {}
	   t2.start();
	   
	   t1.join();
	   t2.join();
	   System.out.println(t1.getName()+ " is alive "+t1.isAlive());
	   System.out.println(t2.getName()+ " is alive "+t2.isAlive());
	   System.out.println("Bye i done with mutithreading");

       
	}

}
