package org.tnsif.codingchallenge;
import java.util.Scanner;

public class MultiplicationOfTwoNumbersWithoutUsingOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,x,y,sum=0;
		System.out.println("Enter the number first: ");
		x=sc.nextInt();
		System.out.println("Enter the number second:");
		y=sc.nextInt();
		
		for(i=1;i<=x;i++)
		{
			sum = sum+y;
		}
		System.out.println("The multiplication of "+x+" and "+y+" is "+sum);
		

	}

}
