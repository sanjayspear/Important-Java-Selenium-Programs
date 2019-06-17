package com.javaConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateOccuranceInString {

	public static void main(String[] args) 
	{
    
	String sentence = "Nitte Nitte Nitte Meenajkshi Institue of of of Technology";
	
	String[] word=sentence.split(" ");
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	
		for(String tempString: word)
		{
			if(map.get(tempString) != null)
			{
				map.put(tempString, map.get(tempString)+1);
			}
			else
			{
				map.put(tempString, 1);
			}
		}
		Iterator<String> tempString = map.keySet().iterator();
		
		while(tempString.hasNext())
		{
			String temp=tempString.next();
			
			if(map.get(temp)> 1)
			{
				System.out.println("the word "+temp+" apperd "+map.get(temp)+" no. of times");
			}
		}
	}

}
