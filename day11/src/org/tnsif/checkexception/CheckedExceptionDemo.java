package org.tnsif.checkexception;
import java.io.FileInputStream;
public class CheckedExceptionDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
		FileInputStream f=new FileInputStream("\"C:\\Users\\ganes\\Downloads\\1.jpg\"");
		System.out.println("file is exists!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled:"+e);
		}
	}
}
