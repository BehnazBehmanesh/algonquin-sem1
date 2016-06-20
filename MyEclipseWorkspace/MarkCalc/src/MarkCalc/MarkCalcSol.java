package MarkCalc;

	import java.util.Scanner;

	/* CST8110 F15 Assignment #1
	 * This program calculates the course final mark based on
	 * the weighting in the course outline:
	 * 
	 * Lab Activity(ies) (10%)
	 * Assignment(s) (20%)
	 * Hybrid Assignment(s) (5%)
	 * Quiz(zes)/Test(s) (25%)
	 * Practical Assessment (s) (10%)
	 * Final Exam (30%)
	 */

	 public class MarkCalcSol {

		public static void main(String [] args) {
			
			//variable declarations and initializations
			Scanner scan = new Scanner(System.in);
			
			double hybrid, lab, assign, tests, labTest, finalExam;
			double finalMark = 0.0;
			
			//welcome message
			System.out.println("Welcome to the CST8110 Final Mark Calculator\n");
			
			//prompt user for data and enter data into memory
			System.out.print("Enter your hybrid activity mark out of 5: ");
			hybrid = scan.nextDouble();
			
			System.out.print("Enter your lab mark out of 10: ");
			lab = scan.nextDouble();
			
			System.out.print("Enter your assignments mark out of 100: ");
			assign = scan.nextDouble();
			
			System.out.print("Enter your test(s)/quiz  mark out of 25: ");
			tests = scan.nextDouble();
			
			System.out.print("Enter your lab test mark out of 5: ");
			labTest = scan.nextDouble();
			
			System.out.print("Enter your final exam mark out of 30: ");
			finalExam = scan.nextDouble();
			
			//calculate final mark
			//supply appropriate weightings
			finalMark = hybrid + lab + assign/5.0 + tests + labTest * 2.0 + finalExam;
			
			//display final mark with two decimal places
			System.out.printf("\nCalculated final mark: %.2f\n", finalMark);

		}//end main method

	}//end class definition




