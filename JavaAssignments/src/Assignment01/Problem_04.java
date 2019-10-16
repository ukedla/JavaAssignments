package Assignment01;

import java.util.Scanner;

/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi
SUGGESTIONS:
Use Math.PI for the pi value
*/

public class Problem_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double perimeter, area;
		float radius;
		
		System.out.println("Enter Radius of a circle : \n");
		radius = scanner.nextFloat();
		System.out.println("Radius = "+ radius);
		
		perimeter = 2*radius*Math.PI;
		System.out.println("Perimeter = " + perimeter);		

		area = radius*radius*Math.PI;
		System.out.println("Area = " + area);
		
		scanner.close();
	}


}
