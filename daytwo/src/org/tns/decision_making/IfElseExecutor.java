// program to demonstrate on to check 
package org.tns.decision_making;
import java.util.Scanner;
public class IfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			System.out.println("not Eligible to donaate the blood");
		}
			

	}

}
