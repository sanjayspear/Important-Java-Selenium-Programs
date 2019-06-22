package com.javaConcepts;

import java.util.Scanner;

public class DeficientNumber2 {
	
	/*The deficient number can be defined as the number for which the sum of the proper divisors is lesser than the number itself.

	For example, the number 21 with its proper divisors (1, 3 and 7) has sum (11) lesser than itself.*/

	public static void main(String[] args) {
		
		System.out.println("Enter any number to know whether it is deficient or not");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt(), sum=0, k=0;
		
		System.out.print("sum of : ");
		for(int i=1; i<=num-1; i++)
		{
			k=num%i;
			
			if(k==0)
			{
				sum=sum+i;
				System.out.print(i);
				System.out.print(" ");
			}

		}
		System.out.print(" is "+sum);
		System.out.println();
		System.out.println("where, "+sum+" is the sum of the proper divisors for the number "+num);
		
		if(sum < num)
		{
			System.out.println("Yes entered number is Deficient because "+sum+" < "+num);
		}
		else
		{
			System.out.println("No entered number is not Deficient because "+sum+" > "+num);

		}
		sc.close();
	}
	
}
