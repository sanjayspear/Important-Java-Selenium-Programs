package com.javaPro.constructors;

public class MyClass {

	public static void main(String[] args) {
        Cube c1=new Cube();
        
        System.out.println(c1.getCubeVolume());
        
        Cube c2=new Cube(20, 20, 20);
        System.out.println(c2.getCubeVolume());
	}

}
