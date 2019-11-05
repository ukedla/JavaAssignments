package EmpAssignment;

import java.util.Arrays;

public class Employee {
	String sSN;
	Name empName;
	int empAge;
	Address empAddress;
	int empSalary;
	String[] empDependents;
	
	public Employee(String sSN, Name empName, int empAge, Address empAddress, int empSalary, String[] empDependents) {
		super();
		this.sSN = sSN;
		this.empName = empName;
		this.empAge = empAge;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
		this.empDependents = empDependents;
	}

	@Override
	public String toString() {
		return "Employee [sSN=" + sSN + ", empName=" + empName + ", empAge=" + empAge + ", empAddress=" + empAddress
				+ ", empSalary=" + empSalary + ", empDependents=" + Arrays.toString(empDependents) + "]";
	}

	
	
	
	
	
	

}
