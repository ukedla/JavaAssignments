package EmpAssignment;

public class Employee {
	String sSN;
	Name empName;
	Address empAddress;
	int empAge;
	int empSalary;
	String[] dependents;
	

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
	
	
	public Employee() {
		
	}
	
	public Employee(String ssn, Name name, Address address, int age, int salary, String[] dependents) {
		this.sSN = ssn;
		this.empName = name;
		this.empAddress = address;
		this.empAge = age;
		this.empSalary = salary;
		this.dependents = dependents;
	}
	
	
	public String getsSN() {
		return sSN;
	}



	public void setsSN(String sSN) {
		this.sSN = sSN;
	}



	public Name getEmpName() {
		return empName;
	}



	public void setEmpName(Name empName) {
		this.empName = empName;
	}



	public Address getEmpAddress() {
		return empAddress;
	}



	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}



	public int getAge() {
		return empAge;
	}



	public void setAge(int age) {
		this.empAge = age;
	}



	public int getSalary() {
		return empSalary;
	}



	public void setSalary(int salary) {
		this.empSalary = salary;
	}



	public String[] getdependents() {
		return dependents;
	}



	public void setDependents(String[] dependents) {
		dependents = dependents;
	}



}
