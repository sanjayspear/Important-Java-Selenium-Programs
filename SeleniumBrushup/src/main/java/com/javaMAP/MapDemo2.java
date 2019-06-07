package com.javaMAP;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new Hashtable<Integer, String>();

		map.put(101, "Sanjay");
		map.put(102, "Sagar");
		map.put(102, "Vijay");
		map.put(103, "Vivek");

		for (Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
