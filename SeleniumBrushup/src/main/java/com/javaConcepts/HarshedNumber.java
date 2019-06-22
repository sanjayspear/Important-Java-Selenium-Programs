package com.javaConcepts;

import java.util.Scanner;

public class HarshedNumber {
	
/*
   	A number is said to be the Harshad number if it is divisible by the sum of its digit.
*/
	public static void main(String[] args) {
		
		System.out.println("Enter any number to find harshed or not");
		
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		
		String num=x;
		int sum=0, i, n;
		int k=Integer.parseInt(num);
		
		for(i=0; i<num.length(); i++)
		{
			String d=""+num.charAt(i);
			n=Integer.parseInt(d);
			sum=sum+n;
		}
		
		System.out.println("sum of given number is :"+sum);
		System.out.println(k+" % "+sum+" = "+(k%sum));
		
		if((k%sum)==0) {
			System.out.println(num+" : is harshed number because it is divisible by sum of its digit and remainder is: "+(k%sum));
		}
		else
		{
			System.out.println(num+" : is not harshed number because it is not divisible by sum of its digit and remainder is: "+(k%sum));
		}
		
		sc.close();
	}

}
