package com.javaConcepts;

public class SumOfGivenNumber {
	
	public static void main(String[] args) {
     
		String s="135891293345855346", a=null;
		long x=0, sum=0;
		 
        for(int i=0; i<s.length(); i++)
        {
        	a=""+s.charAt(i);
            x=Integer.parseInt(a);
            sum=sum+x;
        }
        System.out.println(sum);
        
	}

}
