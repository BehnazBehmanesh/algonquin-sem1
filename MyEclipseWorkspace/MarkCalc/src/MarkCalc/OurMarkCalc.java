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

	 public class OurMarkCalc {
		 
		private double hybrid, lab, assign, tests, labTest, finalExam;

		public OurMarkCalc() {
			hybrid = 0;
			lab = 0;
			assign =0;
			tests =0;
			labTest =0;
			finalExam =0;
		}
		
		public OurMarkCalc (double h, double l, double a, double t, double lt, double ft) {
			hybrid = h;
			lab = l;
			assign = a;
			tests = t;
			labTest = lt;
			finalExam = ft;
		}
		
		public void inputHybrid() {
			   Scanner keyboard = new Scanner (System.in);
			   System.out.println("Welcome to the CST8110 Final Mark Calculator\n");
			   System.out.print("Enter your hybrid activity mark out of 5: ");
			hybrid = keyboard.nextDouble();
			 }// end inputHybrid
					
		public void inputLab() {
			   Scanner keyboard = new Scanner (System.in);
			   System.out.print("Enter your lab mark out of 10: ");
			 lab = keyboard.nextDouble();
			 }// end inputLab
			
		
		public void inputAssign() {
			   Scanner keyboard = new Scanner (System.in);
			   System.out.print("Enter your assignments mark out of 100: ");
			 assign = keyboard.nextDouble();
			 }// end inputAssign
					
		public void inputTests() {
			   Scanner keyboard = new Scanner (System.in);
			   System.out.print("Enter your test(s)/quiz  mark out of 25: ");
			 tests = keyboard.nextDouble();
			 }// end inputTests
								
		public void inputLabTest() {
			   Scanner keyboard = new Scanner (System.in);
			   System.out.print("Enter your lab test mark out of 5: ");
			 labTest = keyboard.nextDouble();
			 }// end inputLabTest
			
		public void inputFinalExam() {
			   Scanner keyboard = new Scanner (System.in);
			   System.out.print("Enter your final exam mark out of 30: ");
			 finalExam = keyboard.nextDouble();
			 }// end inputFinalExam
						
		public double calcFinalMark() {
            return (double) (hybrid + lab + assign/5.0 + tests + labTest * 2.0 + finalExam);
             }// end calcFinalMark
		
		public void main (String [] args) {
			OurMarkCalc ourMarkCalc1 = new OurMarkCalc();

			ourMarkCalc1.inputHybrid();
			ourMarkCalc1.inputLab();
			ourMarkCalc1.inputAssign();
			ourMarkCalc1.inputTests();
			ourMarkCalc1.inputLabTest();
			ourMarkCalc1.inputFinalExam();


			ourMarkCalc1.display();
			System.out.printf("\nCalculated final mark: %.2f\n", calcFinalMark());
			
		}

		void display() {
			// TODO Auto-generated method stub
			
		}//end main method

	}//end class definition




