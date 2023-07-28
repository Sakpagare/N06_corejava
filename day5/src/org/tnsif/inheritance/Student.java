package org.tnsif.inheritance;

public class Student extends Citizen
{
	
 private int rollno;
 private String CollegeName;


	public int getRollno() {
	return rollno;
}


public void setRollno(int rollno) {
	this.rollno = rollno;
}


public String getCollegeName() {
	return CollegeName;
}


public void setCollegeName(String collegeName) {
	CollegeName = collegeName;
}


	public Student(String city, int pincode, String area, long adharNo, int rollno, String CollegeName) {
		super(city, pincode, area, adharNo);
		this.rollno=rollno;
		this.CollegeName=CollegeName;
		
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", CollegeName=" + CollegeName + ", toString()=" + super.toString() + "]";
	}
	
	
}
