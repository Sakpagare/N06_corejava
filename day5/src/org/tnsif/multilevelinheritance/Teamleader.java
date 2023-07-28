package org.tnsif.multilevelinheritance;

public class Teamleader extends Manager{
	private String leadName;
	private String projectName;
	
	

	public String getLeadName() {
		return leadName;
	}



	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public Teamleader(String deptname, String name, int empID,String leadName,String projectName) {
		super(deptname, name, empID);
		this.leadName=leadName;
		this.projectName=projectName;
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Teamleader [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}
	
	
	
	
	

}
