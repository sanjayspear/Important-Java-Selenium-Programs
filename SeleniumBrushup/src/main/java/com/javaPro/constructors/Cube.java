package com.javaPro.constructors;

public class Cube {
	/*1. Constructors are member methods of a class which has same name as class name and it is used for 
	initialization purpose and constructor do not have return type.
			
	2. Java also  supports overloaded constructor.*/
	
	int length, breadth, height;
	
	public int getCubeVolume() {
		return (length * breadth * height);
	}
	
	Cube () {
		length=10;
		breadth=10;
		height=10;
	}
	
    Cube (int l, int b, int h) {
        length=l;
        breadth=b;
        height=h;
	}

}
