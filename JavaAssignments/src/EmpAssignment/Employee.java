package EmpAssignment;

public class Employee {
	String SSN;
	Name empName;
	Address empAddress;
	int age;
	int salary;
	String[] Dependents;
	

	public class Name{
		String firstName;
		String middleInitial;
		String lastName;
	}
	
	public class Address{
		String street;
		Area area;
	}
	
	public class Area {
		String city;
		String state;
		String zip;
	}
	
	public static void main(String[] args) {
		Employee[] emp = new Employee[10];
		
	}

}
