package EmpAssignment;

public class Address {
	String stAddress;
	Area area;
	
	
	public Address(String stAddress, Area area) {
		this.stAddress = stAddress;
		this.area = area;
	}


	@Override
	public String toString() {
		return "Address [stAddress=" + stAddress + ", area=" + area + "]";
	}
	
	

}
