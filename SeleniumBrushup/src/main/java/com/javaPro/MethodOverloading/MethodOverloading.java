package com.javaPro.MethodOverloading;

public class MethodOverloading {
	
    /*Method overloading is we can define multiple methods with same name with different types of parameters
	to perform different operations*/
	
	public static void main(String[] args) {
       System.out.println(m1(10,20,30));
       System.out.println(m1(44.89, 78.9349, 68.6994));
       System.out.println(m1("United", "India"));
	}
	
	public static int m1(int i, int j, int k) {
		return (i+j+k);
		
	}
	public static double m1(double i, double j, double k) {
		return (i+j+k);
		
	}

	public static String m1(String i, String j) {
		return (i+j);
		
	}


}
