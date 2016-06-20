package lab6;

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		int length, width;
		int pointer1 = 0;
		int pointer2 = 0;

		System.out.print("Enter the lenght: ");
		Scanner input1 = new Scanner(System.in);

		length = input1.nextInt();
		while (20 < length || length < 0) {
			System.out.print("Invalid – enter length between 1 and 20:");
			length = input1.nextInt();
		}
		System.out.print("Enter the width: ");
		Scanner input2 = new Scanner(System.in);

		width = input2.nextInt();
		while (20 < width || width < 0) {
			System.out.print("Invalid – enter width between 1 and 20:");
			width = input2.nextInt();

		}

		for (pointer1 = 0; pointer1 < length; pointer1++) {
			System.out.println(" ");
			for (pointer2 = 0; pointer2 < width; pointer2++)
				System.out.print("*");
		}

	}
}
/*
 * while(pointer1<length){ System.out.println(" "); pointer1++;
 * 
 * pointer2=0; while(pointer2<width){ System.out.print("*"); pointer2++;
 * 
 * }
 * 
 * }
 */

// or this
