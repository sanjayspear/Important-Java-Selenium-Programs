package com.javaConcepts;

public class Abundant2 {

	public static void main(String[] args) {
      for(int x=1; x<=100; x++)
      {
    	  int sum=0, k=0;
  		
  		for(int i=1; i<=x-1; i++)
  		{
  			k=x%i;
  			
  			if(k==0)
  			{
  				sum=sum+i;
  			}

  		}
  		
  		if(sum > x)
  		{
  			System.out.print(x+" ");
  		}
      }
	}

}
