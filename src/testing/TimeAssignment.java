package testing;

import java.util.Scanner;

public class TimeAssignment {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int i = scan.nextInt();

		System.out.println((i/3600) + " " + "Hour" + " " + ((i/60)) + " " +  "Minute" + " " + (i) +  " " + "Second");
		
}
}
