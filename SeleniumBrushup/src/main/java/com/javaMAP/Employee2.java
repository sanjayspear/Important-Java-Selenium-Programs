package com.javaMAP;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Employee2 {

	String name;
	int empid;
	String address;

	public Employee2(String name, int empid, String address) {
		this.name = name;
		this.empid = empid;
		this.address = address;
	}

	public static void main(String[] args) {
		Map<Integer, Employee2> map = new Hashtable<Integer, Employee2>();

		Employee2 emp1 = new Employee2("Sanjay", 100, "Bangalore");
		Employee2 emp2 = new Employee2("Sagar", 101, "Mumbai");
		Employee2 emp3 = new Employee2("Vivek", 102, "Noida");
		Employee2 emp4 = new Employee2("Sumith", 103, "Hydrabad");

		map.put(1, emp1);
		map.put(2, emp2);
		map.put(3, emp3);
		map.put(4, emp4);

		for (Entry<Integer, Employee2> m : map.entrySet()) {
			//int key = m.getKey();
			Employee2 e = m.getValue();
			System.out.println(e.name+" "+e.empid+" "+e.address);
		}
	}
}
