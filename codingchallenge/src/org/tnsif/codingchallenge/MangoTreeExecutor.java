//darshan is very much insteresting in garding hence he plant more tree in his gardern.
//he plant trees in rectangle fashion with order of row and columns and numbers the trees in row wise order.he planted mango tree only in the first row first column and last column so given the tree no.(t) and row and column no(n) here task is to find out whether the given tree is mango tree or not?
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MangoTreeExecutor {
	static void isMangoTree(int n, int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
			System.out.println("mango tree");
		else
			System.out.println("not mango tree");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n and t:");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);

	}

}
