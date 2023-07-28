package org.tnsif.hirarchical;

public class SnowCone extends Android{
private int version;
	

	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public SnowCone(String brand, String slot,int version) {
		super(brand, slot);
		// TODO Auto-generated constructor stub
		this.version=version;
	}


	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}
	

}
