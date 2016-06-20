package star;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int num;
		// read in valid odd number between 1 and 19 inclusive
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an odd number between 1 and 19:");
		num = input.nextInt();
		while (num < 1 || num > 19 || num % 2 == 0) {
			System.out.println("Error...you must enter an odd number between 1 and 19:");
			num = input.nextInt();
		}
		// first half of loop
		for (int i = 1; i <= num; i += 2) { // number of lines
			for (int j = (num - i) / 2; j > 0; j--) // number of spaces
				System.out.print(" ");
			for (int j = 1; j <= i; j++) // number of stars
				System.out.print("*");
			System.out.println(); // end of line
		}
		// second half of loop
		for (int i = num - 2; i >= 1; i -= 2) {
			for (int j = (num - i) / 2; j > 0; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}
