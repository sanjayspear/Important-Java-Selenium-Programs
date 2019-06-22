package com.javaConcepts;

import java.util.ArrayList;
import java.util.List;

/*Program to print the first 10 prime numbers

i.e. we need to print the first 10 prime numbers: 2,3,5,7,11,13,17,19,23,29.

Prime numbers are the natural numbers that can be divided by their self or by 1 without any remainder.*/

public class PrimeNumber2 {

	public static void main(String[] args) {
		int i, size=0;
		List<Integer> list=new ArrayList<>();
		for (i = 1; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true && size<=10) {
				if (i > 1)
			    System.out.println(i);
				list.add(i);
				size=list.size();
			}
		}
	}

}
