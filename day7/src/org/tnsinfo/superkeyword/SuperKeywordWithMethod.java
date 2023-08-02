package org.tnsinfo.superkeyword;
class MET
{
	String ownerName="Chagan Bhujbal";
	void displayName()
	{
		System.out.println("owner is: "+ownerName);
	}
}
class BKC extends MET{
	String ownerName="shefali Bhujbal";
	void displayName()
	{
		super.displayName();
		System.out.println("owner is: "+ownerName);
	}

	
}
// driver class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BKC b=new BKC();
		b.displayName();

	}

}
