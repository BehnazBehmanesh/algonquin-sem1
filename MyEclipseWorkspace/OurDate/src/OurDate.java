import java.util.*;
	/*    DateTest
	      Author:   Behnaz Behmanesh
		Purpose:  this class models a time in hours/minutes/seconds
	*/

public class OurDate {
	private int month;
	private int day;
	private int year;

	public OurDate() {
		month = 1;
		day = 1;
		year = 1901;
	}

	public OurDate (int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
	public void inputMonth() {
		   Scanner keyboard = new Scanner (System.in);
		   System.out.println("Enter a month: ");
	        month = keyboard.nextInt();
		 }// end inputMonth
	
	public void inputDay() {
		   Scanner keyboard = new Scanner (System.in);
		   System.out.println("Enter a day: ");
		   day = keyboard.nextInt();
		}// end inputDay

		public void inputYear() {
			Scanner keyboard = new Scanner (System.in);
			System.out.println("Enter a year: ");
			year = keyboard.nextInt();
		}// end inputYear
		
		
		public void display() {
			System.out.println (month + "/" + day + "/" + year);
		}// end of display
		
		
	}// end of class Time


