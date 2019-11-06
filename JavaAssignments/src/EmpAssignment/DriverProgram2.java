package EmpAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DriverProgram2 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\Uma\\git\\JavaAssignments\\JavaAssignments\\src\\EmpAssignment\\DataFile"));
			
			Employee emp = null;
			Employee []employees = new Employee[10];
			int i=0;
			
			while(scanner.hasNext()) {
				emp = new Employee();
				String eachLine = scanner.nextLine();
				String[] split = eachLine.split(",");
				
				emp.sSN=split[0];
				emp.empName = new Name(split[1],split[2],split[3]);
				emp.empAge=Integer.parseInt(split[4]);
				emp.empSalary=Integer.parseInt(split[9]);
				String tempDependents[] = new String[] {split[10],split[11],split[12]};
				emp.empDependents=tempDependents;
				
				
				if(i<4) {
					employees[i]= emp;
					i++;
				}
				System.out.println(eachLine);
				System.out.println("array length  = "+ split.length);
							
			}
			scanner.close();
		} catch (NumberFormatException e) {
	
			e.printStackTrace();
		}

	}

}
