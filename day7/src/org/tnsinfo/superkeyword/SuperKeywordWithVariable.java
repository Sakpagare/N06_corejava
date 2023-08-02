package org.tnsinfo.superkeyword;
// program to demonstrate on super keyword with variable
class Building
{
	int floors = 23;
	String name ="anantha-Astha";
	
}
class Flat extends Building
{
	String name = "Chintamani Wankhed";
	
	void print()
	{
		// if parent class and child class variable name are name, 
		//and if you want to access parent class variable inside 
		//child class, use super.variablename
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f=new Flat();
		System.out.println(f.name);
		f.print();
		

	}

}
