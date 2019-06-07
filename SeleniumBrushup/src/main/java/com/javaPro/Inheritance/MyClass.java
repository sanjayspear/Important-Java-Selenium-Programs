package com.javaPro.Inheritance;

public class MyClass {

	public static void main(String[] args) {
       
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		
		t.set_values(60, 40);
		r.set_values(200, 400);
		
		System.out.println("Area of triangle is "+t.area());
		System.out.println("Area of rectangle is "+r.area());
		
	}

}
