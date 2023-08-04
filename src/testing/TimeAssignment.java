package testing;

import java.util.Scanner;

public class TimeAssignment {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int Num = scan.nextInt();
		int Sec = Num % 60;
		int Hr = Num / 60;
		int Min = Hr % 60;
		Hr = Hr/60;

		System.out.println(Hr + " " + "Hours" + " " + Min + " " + "Minute" + " " + Sec + " " + "Second");
		
}
}
