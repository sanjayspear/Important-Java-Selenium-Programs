package com.javaConcepts;

/*   Following points defines "Runtime polymorphism or Dynamic Method Dispatch".
 * 
 * 	1. If the reference variable of Parent class refers to the 
  	   object of Child class, it is known as up casting. For example
  	   
  	2. For up casting, we can use the reference variable of class 
  	   type or an interface type. For Example:
  	   
  	   NOTE: In runtime polymorphism method resolution happens at runtime based on runtime object.
 */

interface WorldBank {
	public abstract float getRateOfInterest();
}

class Bank {
	float getRateOfInterest() {
		return 0;
	}
}

class AXISBank implements WorldBank {

	@Override
	public float getRateOfInterest() {
		return 10.4f;
	}

}

class ICICIBank extends Bank {
	float getRateOfInterest() {
		return 7.3f;
	}

}

class HDFCBank extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}

}

public class RuntimePolyMorphism {

	public static void main(String[] args) {
	   Bank b;
	   
       WorldBank wb=new AXISBank();
       System.out.println("AXIS Bank Rate of Interest: "+wb.getRateOfInterest());  
       
       b=new ICICIBank();
       System.out.println("ICICI Bank Rate of Interest: "+b.getRateOfInterest());  
       
       b=new HDFCBank();
       System.out.println("HDFC Bank Rate of Interest: "+b.getRateOfInterest());  
       
       /*   1. The java instanceof operator is used to test whether 
               the object is an instance of the specified type 
               (class or subclass or interface).
               
            2. An object of subclass type is also a type of parent class. 
            For example, if Dog extends Animal then object of Dog can be 
            referred by either Dog or Animal class
       */       
       
       System.out.println(wb instanceof WorldBank);
       System.out.println(wb instanceof AXISBank);
       
       System.out.println(b instanceof Bank);
       System.out.println(b instanceof ICICIBank);
       System.out.println(b instanceof HDFCBank);
	}

}
