package com.javaConcepts;

public class PronicNumber {
	/*A number is said to be pronic number if it is a product of two consecutive numbers.

	For examples:

	6 = 2 x 3
	72 = 8 x 9*/

	public static void main(String[] args) {
		
		int x=2, y=0;
		for(int i=1; i<20; i++)
		{   y=i*x;
			System.out.println(y);
			x++;
			
		}
	}

}
