package testing;

import java.util.Scanner;

public class OperatorAssignment {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int i = scan.nextInt();
		
		System.out.println("Enter your number");
		int j = scan.nextInt();
		
			System.out.println("Sum is :" + (i+j));
			System.out.println("Difference is :" + (i-j));
			System.out.println("Product is :" + (i*j));
			System.out.println("Average is :" + ((i+j)/2));
			System.out.println("Maximum Number is :" + (Math.max(i,j)));
			System.out.println("Minimum Number is :" + (Math.min(i,j)));
		
		}
			


}

