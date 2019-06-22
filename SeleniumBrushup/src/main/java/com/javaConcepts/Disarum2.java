package com.javaConcepts;

public class Disarum2 {

	public static void main(String[] args) 
	
	//Program to print all Disarium numbers between 1 to 100
	{
      for(int p=1; p<=100; p++)
      {
    	String q=Integer.toString(p);
    	String s=q, c;
  		int i,exponent=0;
  		double result=0.0, sum=0.0;
  		
  		for(i=0; i<s.length(); i++)
  		{
  			c = ""+s.charAt(i);
  			double base=Double.parseDouble(c);
  			exponent++;
  			
  	        result = Math.pow(base, exponent);
            sum=sum+result;
  		}
  		double num=Double.parseDouble(s);
  		
  		if(num==sum)
  		{
  			System.out.print(p);
  			System.out.print(" ");
  		}
  		else
  		{
  		}
      }
	}

}
