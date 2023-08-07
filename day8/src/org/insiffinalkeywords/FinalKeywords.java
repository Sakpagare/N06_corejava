//demonstrate final variable
package org.insiffinalkeywords;
public class FinalKeywords {
	//final int x;
//final variable must be initialize during declaration
	
	final float SALARY =67000.78f;
	void print()
	{
		//SALARY=89000.76f;
		//we can't change the value of final variable
		//System.out.println("SALARY is: "+SALARY);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeywords f=new FinalKeywords();
		f.print();
		
		HP h=new HP();
		h.display();
		h.display(h.proccessor);

	}

}
