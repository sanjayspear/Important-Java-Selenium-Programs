package com.javaPro.collections;

import java.util.HashMap;
import java.util.Map.Entry;


public class MapConcepts {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		
		map.put("Name", "Sanjay");
		map.put("Native", "Gangavathi");
		map.put("Currrent Address", "Bangalore");
		map.put("Father", "Mallikarjun");
		map.put("Mather", "Vinodha");
		map.put("Brother", "Sagar");
		map.put("Designation", "Automation Engineer");
		map.put("Company", "First America");
		
		//System.out.println(map);
		
		//System.out.println(map.get("abc"));
		
		/*Set<String> key = map.keySet();
		
		for(Object obj: key) {
			System.out.println(obj+" "+map.get(obj));
		}*/
		
		
		for(Entry<String, String> x: map.entrySet()) {
			System.out.println(x.getKey()+"---->"+x.getValue());
		}
	}

}
