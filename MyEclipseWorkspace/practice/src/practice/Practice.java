package practice;

	import java.lang.*; 		//all import statements must be first
	import java.util.Scanner;	//program uses class Scanner
	/**  This program prompts user to enter 10 numbers, then displays 
	  *  largest and average of the numbers.
	  *   Author:   Linda Crane
	  *   CST8110 Introduction to Computer Programming
	  */
	public class Practice {
		public static void main (String args[]) {

			Scanner input = new Scanner (System.in);

			int counter = 0;
			int total = 0;
			float average = 0F;
			int highest = 0;
			int number = 0;


			while (counter < 10) {
				System.out.print ("\nEnter number " + (counter+1) + ":");
				number = input.nextInt();

				total = total + number;
				if (counter == 0)
					highest = number;
				else
					if (number > highest)
						highest = number;
				counter = counter + 1;
		    }
			// calculations
			average = total / 10;

			System.out.println ("Total is: " + total);
			System.out.println ("Highest is: " + highest);
			System.out.println  ("Average is: " + average);
			System.out.println  ("Watch - this average is : " + (total/10.0f));

		} // end of main
	}// end of class


