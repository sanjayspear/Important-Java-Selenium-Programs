package com.javaConcepts;

public class ReverseString {

	public static void main(String[] args) 
	{
       String s="sanjay";
       int lang=s.length();
       String rev="";
       
       for(int i=lang-1; i>=0; i--) {
    	   rev=rev+s.charAt(i);
       }
       System.out.println("Reverse of "+s+" is "+rev);
    }
}
