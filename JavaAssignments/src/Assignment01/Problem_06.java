package Assignment01;

import java.util.Scanner;

/**
 * Solve (a + b) whole square = a square + b square + 2ab
 * Solve (4a + 5b)2
 *
 * Take the input from command prompt.
 */

public class Problem_06 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter two integers");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("("+a + " + " + b+")" + " whole square = " +(a*a + b*b +2*a*b));
		System.out.println("(4*"+a+ " + "+ "5*"+b+")2 = " + ((4*a + 5*b)*2));
		
	}

}
