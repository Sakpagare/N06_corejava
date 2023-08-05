package org.tnsinfo.Static;

public class StaticMethodExecutor {
	String str="BKC";
	static float percentage=78.9f;
//	static method 
//	if any method outside the main function and if you want to access that method inside the main function, make it as static
	static void displayScore(int Score)
	{
		System.out.println(percentage);
//		we can't use non-static variable in static variable
		System.out.println("Score is: "+Score);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayScore(56);

	}

}
