package com.javaMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(101, null);
		map.put(102, null);
		map.put(103, null);
		map.put(104, null);

		for (Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
