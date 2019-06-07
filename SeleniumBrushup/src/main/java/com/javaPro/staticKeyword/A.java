package com.javaPro.staticKeyword;

public class A {

	public static void main(String[] args) {
      Student mark = new Student();
      mark.setName("Sanjay");
      mark.setAge(28);
      System.out.println("Student-1 Details: "+"Age "+mark.getAge()+" Years"+" and name "+mark.getName());
      Student tom = new Student();
      tom.setName("Sahil Gupta");
      tom.setAge(35);
      System.out.println("Student-2 Details: "+"Age "+tom.getAge()+" Years"+" and name "+tom.getName());
   
      System.out.println("Total no. of Students enrolled for java class are: "+Student.getNumberOfStudents());
	}

}
