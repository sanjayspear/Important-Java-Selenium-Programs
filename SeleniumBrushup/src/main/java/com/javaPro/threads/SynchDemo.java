package com.javaPro.threads;

class Counter{
	int count=0;
	
	public synchronized void count() {
		count++;
	}
}

public class SynchDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
       
		Thread t1=new Thread(new Runnable()
				{
					public void run() {
						for(int i=1; i<=1000; i++)
						{
							c.count();
						}
					}
				});
		
		Thread t2=new Thread(new Runnable()
		{
			public void run() {
				for(int i=1; i<=1000; i++)
				{
					c.count();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count is "+c.count);
		
	}

}
