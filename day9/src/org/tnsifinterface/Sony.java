package org.tnsifinterface;
//program to demonstrate on interface
public interface Sony {
	//by default all the variable inside an interface is public static final
	int noOfChannels=8;
	//by default all the method inside an interface is an abstract method 
	void display();
	// jva 8 provides a static and default method inside and interface
	//static method
	static void accept()
	{
		System.out.println("Static Method");
	}
	//default method
	default void show()
	{
		System.out.println("Default method");
	}

}
