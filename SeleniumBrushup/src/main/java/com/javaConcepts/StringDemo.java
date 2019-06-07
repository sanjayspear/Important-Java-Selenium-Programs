package com.javaConcepts;

public class StringDemo {
	
	String name, city;
	
	private StringDemo(String name, String city) {
		
		this.name=name;
		this.city=city;		
	}
	
	

	@Override
	public String toString() {
		return "StringDemo [name=" + name + ", city=" + city + "]";
	}



	public static void main(String[] args) {
       
		StringDemo demo=new StringDemo("Sanjay", "GVT");
		System.out.println(demo);
	}

}
