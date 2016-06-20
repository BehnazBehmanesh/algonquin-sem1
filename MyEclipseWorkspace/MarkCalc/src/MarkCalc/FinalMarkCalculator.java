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

public class FinalMarkCalculator {

	private double hybrid, lab, assign, tests, labTest, finalExam;

	public FinalMarkCalculator() {
		hybrid = 0;
		lab = 0;
		assign = 0;
		tests = 0;
		labTest = 0;
		finalExam = 0;
	}

	public FinalMarkCalculator(double h, double l, double a, double t, double lt, double ft) {
		hybrid = h;
		lab = l;
		assign = a;
		tests = t;
		labTest = lt;
		finalExam = ft;
	}

	public void getGradesFromUser() {
		
		System.out.println("Welcome to the CST8110 Final Mark Calculator\n");

		Scanner keyboard1 = new Scanner(System.in);
		System.out.print("Enter your hybrid activity mark out of 5: ");
		hybrid = keyboard1.nextDouble();
		
		Scanner keyboard2 = new Scanner(System.in);
		System.out.print("Enter your lab mark out of 10: ");
		lab = keyboard2.nextDouble();
		
		Scanner keyboard3 = new Scanner(System.in);
		System.out.print("Enter your assignments mark out of 100: ");
		assign = keyboard3.nextDouble();
		
		Scanner keyboard4 = new Scanner(System.in);
		System.out.print("Enter your test(s)/quiz  mark out of 25: ");
		tests = keyboard4.nextDouble();
		
		Scanner keyboard5 = new Scanner(System.in);
		System.out.print("Enter your lab test mark out of 5: ");
		labTest = keyboard5.nextDouble();
		
		Scanner keyboard6 = new Scanner(System.in);
		System.out.print("Enter your final exam mark out of 30: ");
		finalExam = keyboard6.nextDouble();
	}// end etGradesFromUser

	public double calcFinalGrade() {
		return (double) (hybrid + lab + assign / 5.0 + tests + labTest * 2.0 + finalExam);
	}// end calcFinalMark

	public void main(String[] args) {
		FinalMarkCalculator finalCalc = new FinalMarkCalculator();
		finalCalc.getGradesFromUser();
		finalCalc.calcFinalGrade();

		finalCalc.display();
		
	}
	private void display() {
		System.out.printf("\nCalculated final mark: %.2f\n", calcFinalGrade());
		// TODO Auto-generated method stub

	}// end main method

}// end class definition
