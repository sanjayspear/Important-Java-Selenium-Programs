package com.javaConcepts;

public class Disarum {
	
	/*  A number will be called Disarium if the sum of its digits powered with their respective position
    is equal with the number itself. 
    
    Example:
    
    1 power 1 + 3 power 2 + 5 power 3 = 135

    
    Some other DISARIUM are 89, 175, 518 etc.
*/

	public static void main(String[] args) {
     
		String s="175", c=null;
		int i,exponent=0;
		double result=0.0, sum=0.0;
		
		for(i=0; i<s.length(); i++)
		{
			c=""+s.charAt(i);
			double base=Double.parseDouble(c);
			exponent++;
			
	        result = Math.pow(base, exponent);
            sum=sum+result;
		}
		System.out.println(sum);
		double num=Double.parseDouble(s);
		
		if(num==sum)
		{
			System.out.println("Yes the given number is Disarum");
		}
		else
		{
			System.out.println("No the given number is not Disarum");
		}
	}

}
