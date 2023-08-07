package org.tnsifinterface;
// driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		// we can't instantiate an interface
		// sony s = new sony();
		
		SonyTV s1=new SonyTV();
		s1.display();
		s1.show();
		Sony.accept();
		
		ISRO i=new ISRO();
		i.Status();
		
		Human h=new Human();
		h.showDrink();
	}

}
