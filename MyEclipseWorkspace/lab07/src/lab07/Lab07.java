package lab07;

import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) {
		System.out.println("Enter the phrase: ");

		Scanner input = new Scanner(System.in);
		String phrase = input.nextLine();

		int length = phrase.length();

		char[] characters = phrase.toCharArray();
		System.out.println("The total number of letters is " + length);

		int lowerCase = 0;
		int uperCase = 0;
		
		for (int i = 0; i < length; i++) {

			if (characters[i] >= 0x61 && characters[i] <= 0x7A) {
				lowerCase++;
			}
			else if (characters[i] >= 0x41 && characters[i] <= 0x5A) {
				uperCase++;
			}
		}
		System.out.println("The number of lower case letters is " + lowerCase);
		System.out.println("The number of upper case letters is  " + uperCase);
		int character = length - (lowerCase + uperCase);
		System.out.println("The number of other letters is " + character);
	}
}
