package com.javaConcepts;

/*   The final keyword can be applied with the variables,
 *   a final variable that have no value it is called 
 *   blank final variable or uninitialized final variable.
 *   It can be initialized in the constructor only. 
 *   The blank final variable can be static also which
 *   will be initialized in the static block only. 
*/
public class BlankFinalVariable {
	
	public final int number;
	public static final String name;
	
	static 
	{
		//Blank static final variable can be initialized in static block 
		name="Sanjay";
	}
	
	//Blank final variable can be initialized in constructor block 
	BlankFinalVariable(int num){
		number=num;
	}
	
	//NOTE: We must initialize final variable and initializing in static block or constructor is exceptional
	

	public static void main(String[] args) {
		BlankFinalVariable obj=new BlankFinalVariable(100);
	}

}
