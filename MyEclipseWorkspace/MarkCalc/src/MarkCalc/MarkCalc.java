package MarkCalc;

//import java.text.DecimalFormat;
import java.util.Scanner;

	/** This program Calculate your final mark based on
	 *  the weighting of the course outline 
	 *  Author:   Behnaz Behmanesh   Student# 040844523
	 *  CST8110-323 Introduction to Computer Programming
	 *  Lab Teacher:  Hani Ezzadeen
	 *  Date:  07/oct/2015
	 *  Assignment #1
	 */

public class MarkCalc {
	public static void main(String[] args){
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the CST8110 Final Mark Calculator");
		
		
		System.out.print("Enter your hybrid activity mark out of 5: " );
		float hybrid = scanner.nextFloat();
		System.out.print("Enter your lab mark out of 10: " );
		float lab = scanner.nextFloat();
		System.out.print("Enter your assignments mark out of 100: " );
		float assignments = scanner.nextFloat();
		System.out.print("Enter your test(s)/quiz mark out of 25: " );
		float testquiz = scanner.nextFloat();
		System.out.print("Enter your lab test mark out of 5: " );
		float labtest = scanner.nextFloat();
		System.out.print("Enter your final exam mark out of 30: " );
		float finalexam = scanner.nextFloat();
		
		scanner.close();
		
		
		//Final Mark calculation
		//hybrid activity = 5%
		//lab mark = 10%
		//assignments = 20%
		//test(s)/quiz = 25%
		//lab test = 10%
		//final = 30%
		
		
		assignments= (float) (assignments /5);
		labtest= (float) (labtest *2);
		
		
		float finalNumber=hybrid+lab+assignments+testquiz+labtest+finalexam;
				
    	System.out.printf("\nCalculated final mark:%.2f",finalNumber);
		
		

	
	}
}
