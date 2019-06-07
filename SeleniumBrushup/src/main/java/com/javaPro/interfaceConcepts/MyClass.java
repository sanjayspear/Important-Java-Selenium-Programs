package com.javaPro.interfaceConcepts;

public class MyClass {

	public static void main(String[] args) {
		Bank axis = new Bank_AXIS();
		Bank hdfc = new Bank_HDFC();
		
		System.out.println("Interest rate of AXIX bank is "+axis.getInterestRate()+"%");
		System.out.println("Interest rate of HDFC bank is "+hdfc.getInterestRate()+"%");

	}

}
