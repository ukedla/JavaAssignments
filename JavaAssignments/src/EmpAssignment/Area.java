package EmpAssignment;

public class Area {
	String city;
	String state;
	String zipCode;
	
	public Area(String city, String state, String zipCode) {
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Area [city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
		
}
