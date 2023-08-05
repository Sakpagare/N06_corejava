package org.tnsinfo.Static;

public class StaticBlock {
	String str="BKC";
	static float salary;
//	static block is used to initialize static variable
//	and we can't initialize any non-static variable inside the static block
	static {
		salary=76859.89f;
		//str="BKC";
	
				
	}
	static void print()
	{
		System.out.println(salary);
	}

	public static void main(String[] args) {
//		main function is static and hence it calls static block then method and variable are default
		// TODO Auto-generated method stub
		print();

	}

}
