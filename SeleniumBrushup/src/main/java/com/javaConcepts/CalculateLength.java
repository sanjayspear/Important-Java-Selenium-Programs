package com.javaConcepts;

import java.util.Scanner;

public class CalculateLength {
	
	public static long calculateLength(long n){  
        long length = 0; 
        System.out.println("The value of n is :");
        System.out.println(n);
        while(n != 0){  
            length = length + 1;  
            n = n/10;
            System.out.println(n);
        }  
        return length;  
    }  

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any number to know the length of the given number");
	   long num=sc.nextLong();
       long length=calculateLength(num);
       System.out.println("The length of the given number is :"+length);
       sc.close();
	}

}
