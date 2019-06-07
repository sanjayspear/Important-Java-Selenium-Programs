package com.javaMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Employee {

	String name;
	int empid;
	String address;

	public Employee(String name, int empid, String address) {
		this.name = name;
		this.empid = empid;
		this.address = address;
	}

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

		Employee emp1 = new Employee("Sanjay", 100, "Bangalore");
		Employee emp2 = new Employee("Sagar", 101, "Mumbai");
		Employee emp3 = new Employee("Vivek", 102, "Noida");
		Employee emp4 = new Employee("Sumith", 103, "Hydrabad");

		map.put(1, emp1);
		map.put(2, emp2);
		map.put(3, emp3);
		map.put(3, emp4);

		for (Entry<Integer, Employee> m : map.entrySet()) {
			//int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(e.name+" "+e.empid+" "+e.address);
		}
	}
}
