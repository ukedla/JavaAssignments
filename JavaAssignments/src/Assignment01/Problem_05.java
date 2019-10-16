package Assignment01;

import java.util.Scanner;

/*
(Area and perimeter of a rectangle) Displays the area and
perimeter of a rectangle with the width of 6.5 and height of 4.9 using the following
formula:
						area = width * height
						perimeter = (width + height) * 2
NOTE:
	pass width and height as an input to the program.
*/

public class Problem_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter width of the rectangle");
		float width = scanner.nextFloat();
		
		System.out.println("Enter height of the rectangle");
		float height = scanner.nextFloat();
		
		System.out.println("Area = " + width*height);
		System.out.println("Perimeter = " + ((width + height)*2));
		
		scanner.close();
	}

}
