package com.javaConcepts;

public class FileFormatExceptionConcept {
	
	public static void m1() {
		String s="10004M";
		int num=Integer.parseInt(s);
		System.out.println(num);
		
	}

	public static void main(String[] args) {
		try {
			m1();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
