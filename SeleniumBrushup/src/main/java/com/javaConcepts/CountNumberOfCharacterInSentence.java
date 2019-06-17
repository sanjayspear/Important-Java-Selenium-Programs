package com.javaConcepts;

public class CountNumberOfCharacterInSentence {

	public static void main(String[] args) {
		String str = "Nitte Meenakshi Institute Of Technology";
		
		String[] split=str.split(" ");
		int count=0;
	    
		for(int i=0; i<split.length; i++)
		{
			String word=split[i];
			count=count+word.length();
		}
		
		System.out.println(count);
	}
}


