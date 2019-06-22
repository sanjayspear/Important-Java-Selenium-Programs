package com.javaConcepts;

public class Abundant {
	
	/*The abundant number can be called as an excessive number and defined as the number 
	for which the sum of its proper divisors is greater than the number itself.

	A first abundant number is the integer 12 having the sum (16) of its proper 
	divisors (1, 2, 3, 4, 6) which is greater than itself (12).

	Examples: 12, 18, 20, 24, 30, 36*/

	public static void main(String[] args) {
    int num=16, sum=0, k=0;
		
		for(int i=1; i<=num-1; i++)
		{
			k=num%i;
			
			if(k==0)
			{
				sum=sum+i;
			}

		}
		
		if(sum > num)
		{
			System.out.println("Yes entered number "+num+" is Abundant");
		}
		else
		{
			System.out.println("No entered number "+num+" is not Abundant");

		}
	}

}
