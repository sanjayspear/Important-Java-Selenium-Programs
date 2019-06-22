package com.javaConcepts;

public class PowerOfNumber1 {

	public static void main(String[] args) {
		
		// Calculate power of a number using a while loop
		int base = 3, exponent = 4;
        long result = 1;
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);
	}

}
