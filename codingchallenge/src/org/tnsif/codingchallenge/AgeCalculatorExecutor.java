package org.tnsif.codingchallenge;

import java.util.Scanner;

public class AgeCalculatorExecutor {
	static void ageCalculator(int by,int cy)
	{
		if(cy>by)
		
			System.out.println(cy-by);
		 else
			System.out.println((100-by)+cy);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the birth and current year:");
		int by=s.nextInt();
		int cy=s.nextInt();
		ageCalculator(by,cy);
		
	}

}
