package com.javaPro.threads;

public class MyClass9 {

	public static void main(String[] args){
		
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
      /* t1.setPriority(1);
       t2.setPriority(10);*/
       
       t1.setPriority(Thread.MIN_PRIORITY);
       t2.setPriority(Thread.MAX_PRIORITY);
       
       System.out.println("t1 priority is "+t1.getPriority());
       System.out.println("t2 priority is "+t2.getPriority());

       
       t1.start();
	   try {Thread.sleep(500);} catch (InterruptedException e) {}
	   t2.start();
	   
	   System.out.println("Bye i done with mutithreading");

       
	}

}
