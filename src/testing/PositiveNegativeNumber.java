package testing;

import java.util.Scanner;

public class PositiveNegativeNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int i = scan.nextInt();
			if(i < 0)
			{
			System.out.println("Negative number");
		}
			else {
			System.out.println("Positive Number");
		}
	}
	}

