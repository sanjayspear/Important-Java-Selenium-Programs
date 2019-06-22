package com.javaConcepts;

public class DeficientNumber1 {

	public static void main(String[] args) {
		
		int num=21, sum=0, k=0;
		
		for(int i=1; i<=num-1; i++)
		{
			k=num%i;
			
			if(k==0)
			{
				sum=sum+i;
			}

		}
		
		if(sum < num)
		{
			System.out.println("Yes entered number "+num+" is Deficient");
		}
		else
		{
			System.out.println("No entered number "+num+" is not Deficient");

		}
	}

}
