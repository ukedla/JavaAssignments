package EmpAssignment;


public class DriverProgram {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("231-21-3333",new Name("John","M","Walker"), 45, 
				new Address("31,Ruby Lane", new Area("Phoenix","AZ","85024")), 50000, new String[] {"Robin","Emma","Walter"});
		
		Employee emp2 = new Employee("233-21-3333",new Name("Cody","M","Walker"), 45, 
				new Address("31,Ruby Lane", new Area("Phoenix","AZ","85024")), 50000, new String[] {"Robin","Emma","Walter"});
		
		Employee emp3 = new Employee("333-21-3333",new Name("Ryan","M","Walker"), 45, 
				new Address("31,Ruby Lane", new Area("Phoenix","AZ","85024")), 50000, new String[] {"Robin","Emma","Walter"});
		
		Employee emp4 = new Employee("444-21-3333",new Name("Stan","M","Walker"), 45, 
				new Address("31,Ruby Lane", new Area("Phoenix","AZ","85024")), 50000, new String[] {"Robin","Emma","Walter"});
		
		Employee emp5 = new Employee("555-21-3333",new Name("Christy","M","Walker"), 45, 
				new Address("31,Ruby Lane", new Area("Phoenix","AZ","85024")), 50000, new String[] {"Robin","Emma","Walter"});
		
		Employee empArray[] = new Employee[] {emp1, emp2, emp3, emp4, emp5};
		
		for(Employee emp : empArray) {
			System.out.println(emp.toString());
		}
				
	}
}
