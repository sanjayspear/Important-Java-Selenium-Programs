package com.javaConcepts;

public class PrintStringAlphabeticalOrder {

	//static String[] name = {"Gangavathi", "Koppal", "Bangalore", "Ananthpur", "Jaipur"};

	public static void main(String[] args) {
		
		String[] name = {"Gangavathi", "Koppal", "Bangalore", "Ananthpur", "Jaipur"};
		
		//Gangavathi and Koppal
		System.out.println(name[0].compareTo(name[1])); //-4
		
		//Gangavathi and Bangalore
	    System.out.println(name[0].compareTo(name[2])); //5
	    
	    //Gangavathi and Bangalore
	    System.out.println(name[0].compareTo(name[3])); //6
	    
	    //Gangavathi and Bangalore
	    System.out.println(name[0].compareTo(name[4])); //-3
		
		

		int size = name.length;
		String temp = null;
		
		System.out.println("\n\t---------Before Sotring------------");
		for(int i=0; i<size; i++) {
			System.out.println("\n\t"+name[i]);
		}
		
		for(int i=0; i<size; i++) 
		{
			for(int j=i+1; j<size; j++) {
				//Note here, comparison happens based on unicode of the character. 
				if(name[i].compareTo(name[j]) > 0) 
				{
					temp = name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		
		System.out.println("\n\t----------After Sotring---------------");
		for(int i=0; i<size; i++) {
			System.out.println("\n\t"+name[i]);
		}
	}

}
