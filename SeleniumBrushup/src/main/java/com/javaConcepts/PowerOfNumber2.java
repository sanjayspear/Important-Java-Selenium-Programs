package com.javaConcepts;

public class PowerOfNumber2 {

	public static void main(String[] args) {
		// Calculate power of a number using a for loop
		
		 int base = 3, exponent = 4;
	        long result = 1;
	        for (;exponent != 0; --exponent)
	        {
	            result *= base;
	        }
	        System.out.println("Answer = " + result);
	}

}
