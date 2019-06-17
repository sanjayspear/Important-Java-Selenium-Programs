package com.javaConcepts;

public class RevstrWithoutAffectingSpecialCharacter {

	//To reverse string without affecting special character.
	public static void main(String[] args)
	   { 
	     System.out.println(reverseString("san$#%,jay")); 
	   } 
	   public static String reverseString(String input) { 
	      char[] inputArr = input.toCharArray(); 
	      int l = 0; 
	      int r = inputArr.length - 1; 
	      while (l < r) { 
	        if (!Character.isAlphabetic(inputArr[l])) { 
	          l++; 
	        } else if (!Character.isAlphabetic(inputArr[r])) { 
	          r--; 
	        } else { 
	          char tempChar = inputArr[l]; 
	          inputArr[l] = inputArr[r]; 
	          inputArr[r] = tempChar; 
	          l++; 
	          r--; 
	          
	        } 
	      } 
	      return new String(inputArr); 
	    } 

}
