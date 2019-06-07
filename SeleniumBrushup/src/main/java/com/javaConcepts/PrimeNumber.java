package com.javaConcepts;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i>2) {
				for(int j=2; j<i; j++) {
					if(i%j==1) {
						System.out.println(i);
					}
				}
			}
			else {
				System.out.println(i);
			}
		}
  }
}
