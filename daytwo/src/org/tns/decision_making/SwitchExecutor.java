package org.tns.decision_making;
import java.util.Scanner;
public class SwitchExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the song no");
		int songno=s.nextInt();
		switch(songno)
		{
		case 1:
            System.out.println("Waka Waka");
            break;
		case 2:
			System.out.println("Taki Taki");
			break;
			
		case 3:
			System.out.println("jay shri ram");
			break;
			default:
				System.out.println("no songs invalid");
		}
		

	}

}
