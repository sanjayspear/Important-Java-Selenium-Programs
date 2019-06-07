package com.javaConcepts.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner1 
{
	
	public static void main(String[] args)
	{
		List<Laptop1> laps=new ArrayList<Laptop1>();
		laps.add(new Laptop1("Dell", 16, 800));
		laps.add(new Laptop1("Apple", 8, 1200));
		laps.add(new Laptop1("Acer", 12, 700));
		
		Comparator<Laptop1> com=new Comparator<Laptop1>() {
			public int compare(Laptop1 l1, Laptop1 l2) {
				if(l1.getPrice()>l2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(laps, com);
		
		for(Laptop1 l:laps) {
			System.out.println(l);
		}
	}

}
