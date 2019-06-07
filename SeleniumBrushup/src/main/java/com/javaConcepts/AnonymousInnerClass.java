package com.javaConcepts;

class Cellphone{
	public void phone() {
		System.out.println("Make call");
	}
}

public class AnonymousInnerClass{
	
	public static void main(String[] args) {
		Cellphone obj=new Cellphone() {
    	   public void phone() {
    			System.out.println("Make call, Watch video, Listen to Podcast");
    		}
       };
       obj.phone();
       
	}

}
