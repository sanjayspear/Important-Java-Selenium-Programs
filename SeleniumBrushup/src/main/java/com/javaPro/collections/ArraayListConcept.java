package com.javaPro.collections;

import java.util.ArrayList;

public class ArraayListConcept {
   
	public static void main(String[] args){
		
		ArrayList<Integer> al = new ArrayList<Integer>(5);
		
		al.add(1);
		al.add(30);
		al.add(17);
		al.add(19);
		al.add(21);
		al.add(18);
		al.add(19);
		al.add(19);
		
		for(Integer x : al) {
			System.out.println(x);
		}
		
		System.out.println("Size of the array "+al.size());
		
		al.set(3, 100);
		
		for(Integer x : al) {
			System.out.println(x);
		}
		
		System.out.println("Size of the array "+al.size());

		al.remove(5);
		
		System.out.println("Size of the array "+al.size());

		al.clear();
		
		System.out.println("Size of the array "+al.size());		
	}
}
