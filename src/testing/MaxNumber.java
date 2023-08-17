package testing;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter your number");
		int i = scan.nextInt();
	
		System.out.println("Enter your number");
		int j = scan.nextInt();
		
		System.out.println("Enter your number");
		int k = scan.nextInt();
		
		//System.out.println("Maximum Number is :" + (Math.max(i,j)));

		if(i>j && i>k) {
			System.out.println((i) + " " + "is maximum number");
		}
		if(j>k) {
			System.out.println((j) + " " + "is Maximum Number");
		}
		else {
			System.out.println((k) + " " + "is Maximum Number");
		}
}
}
