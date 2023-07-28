package org.tnsif.hirarchical;

public class Android {
	private String brand;
	private String slot;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", slot=" + slot + "]";
	}
	public Android(String brand, String slot) {
		super();
		this.brand = brand;
		this.slot = slot;
	}
	

}
