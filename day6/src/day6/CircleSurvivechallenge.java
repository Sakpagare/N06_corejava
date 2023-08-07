package day6;
import java.util.Scanner;
public class CircleSurvivechallenge {
	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else 
			return(survive(n-1,k)+k-1)%n+1;
		
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value for n and k:");
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
	}

}
