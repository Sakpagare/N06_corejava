// program m
package org.tnsif.customerexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCredentials {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String userid=s.nextLine();
		String password=s.nextLine();
		try {
			
	
		if(userid.equals("sakshipagare@771.gmail.com") &&
				password.equals("1234"))
		{
			System.out.println("Credentials are matched!!!");
			
		}
		else 
		{
			throw new LoginCredentials("Invalid Credentatials");
		}
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Invalid"+ e);
		}
		

	}

}
