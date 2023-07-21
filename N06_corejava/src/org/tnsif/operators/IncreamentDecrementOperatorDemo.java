package org.tnsif.operators;

public class IncreamentDecrementOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=23,y=6;
		int res1=x++ + ++y;
		System.out.println(res1);
		System.out.println(x);
		System.out.println(y);
		
		int res2=x-- + --y;
		System.out.println(res2);
		System.out.println(x);
		System.out.println(y);


	}

}
