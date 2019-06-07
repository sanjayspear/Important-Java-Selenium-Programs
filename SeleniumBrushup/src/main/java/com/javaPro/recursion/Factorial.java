package com.javaPro.recursion;

public class Factorial {
	
	public static long fatcorial(long N) {
		if(N==0)
			return 1;
		else 
			return (N * fatcorial(N-1));
	}

	public static void main(String[] args) {
        System.out.println(fatcorial(20));
	}

}
