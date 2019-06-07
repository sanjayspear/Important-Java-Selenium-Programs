package com.javaConcepts;

class Person{
	String naam="Sagar";
	String city="Bangalore";
	String state="Karnataka";
	
	String name;
	int id;
	
	Person(String name, int id){
		this.name=name;
		this.id=id;
       
	}
	
	void m1() {
		System.out.println("I am method and i also called as behavoir from super class");
	}
}

class Employee extends Person{
	String naam="Sanjay";
	String city="Mumbai";
	String state="Maharastra";
	
	float salary;
	Employee(String name, int id, float salary){
		//calling super class constructor
		super(name, id);
		this.salary=salary;
	}
	
	void m1() {
		System.out.println("I am method and i also called as behavoir from current class");
	}
	
	void display() {
		System.out.println(name+" "+id+" "+salary);
		//calling super class method --> m1()
		super.m1();
		
		//calling current class method --> m1()
		this.m1();
		
		//referring parent class instance variable
		System.out.println("Employee details :"+super.naam+"===***==="+super.city+"===***==="+super.state);
		
		//referring current class instance variable
		System.out.println("Employee details :"+this.naam+"===***==="+this.city+"===***==="+this.state);
	}
}

public class TestSuper {

	public static void main(String[] args) {
       Employee emp=new Employee("Ankit", 95, 50000);
       emp.display();
	}

}
