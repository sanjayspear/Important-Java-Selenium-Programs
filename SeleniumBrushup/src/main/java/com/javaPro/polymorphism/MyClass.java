package com.javaPro.polymorphism;

public class MyClass {

	public static void main(String[] args) {
    
		/*1. This program is example for polymorphism
		2. Method overriding is an example for dynamic polymorphism
		3. Method overloading is an example for static polymorphism*/
		
		Bank axis = new Bank_AXIS();
		Bank hdfc = new Bank_HDFC();
		Bank icici = new Bank_ICICI();
		
		System.out.println("Interest rate of AXIX Bank is "+axis.getInterestRate()+"%");
		System.out.println("Interest rate of HDFC Bank is "+hdfc.getInterestRate()+"%");
		System.out.println("Interest rate of ICICI Bank is "+icici.getInterestRate()+"%");
		
		
		
	}

}
