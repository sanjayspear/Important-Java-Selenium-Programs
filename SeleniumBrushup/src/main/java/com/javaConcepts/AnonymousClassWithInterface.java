package com.javaConcepts;

interface X{
	public abstract void m1();
}

public class AnonymousClassWithInterface {
	
	public static void main(String[] args) {
       X obj=new X() {
    	   public void m1() {
    		   System.out.println("Implementation is done.");
    		   for(int i=1; i<=10; i++) 
    		   {
    		   System.out.println(i+"."+"Random number ==> "+Math.random());
    		   }
    	   }
       };
       obj.m1();
	}

}
