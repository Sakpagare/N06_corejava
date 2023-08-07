package org.insifencapsulation;

public class IncapsulationExecutor {
	public static void main(String[] args) {
		Hdfc h= new Hdfc();
		
		// Setting a value to private data members
		h.setAccType("Saving Account");
		h.setAccountNo(345623445678L);
		h.setAtmCardNo(6223456789L);
		h.setPinNo(1221);
		
		System.out.println("Account No. is:"+h.getAccountNo());
		//below line will call to toString() method
		System.out.println(h);
		
		
	}



}
