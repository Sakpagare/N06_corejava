package org.tnsif.looping;
import java.util.Scanner;
public class WhileExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>=1)
		{
			System.out.println(n+" ");
			n--;
		}

	}

}