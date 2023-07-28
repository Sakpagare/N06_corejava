package org.tnsif.hirarchical;

public class Tiramisu extends Android {
	private int version;
	

	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public Tiramisu(String brand, String slot,int version) {
		super(brand, slot);
		this.version=version;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	

}
