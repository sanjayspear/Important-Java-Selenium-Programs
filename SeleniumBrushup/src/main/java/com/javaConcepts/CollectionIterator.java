package com.javaConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIterator {

	public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        li.add(60);
        
        //Iterator is a Container
        Iterator<Integer> num = li.iterator();
        while(num.hasNext()) {
        	System.out.println(num.next());
        }
	}

}
