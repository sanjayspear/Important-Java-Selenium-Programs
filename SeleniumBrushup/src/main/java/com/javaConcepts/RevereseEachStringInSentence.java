package com.javaConcepts;

public class RevereseEachStringInSentence {

	public static void main(String[] args) 
	{
		
		String str="Nitte Meenakshi Institute Of Technology";
		
		String a[]=str.split(" ");
		
		String x, revString="";
		
		for(int i=0; i<a.length; i++)
		{
			//System.out.println(a[i]);
			String y="";
			
			x=a[i];
			
			for(int j=x.length()-1; j>=0; j--)
			{
				y=y+x.charAt(j);
			}
			revString = revString + y + " ";	
		}
		
		System.out.println(revString);
	}


}
