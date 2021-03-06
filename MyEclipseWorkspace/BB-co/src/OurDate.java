/* ******************************************
 * Assignment 2
 * Course Account: 15F-CST8110-320
 *   Author:   Behnaz Behmanesh
 *   Lab teacher: Hani Ezzadeen
 *   Completion date: 29/10/2015
 *   Purpose:  this program gets, sets and calculates
 *   date and time needed to calculate invoice 
*/

import java.util.Scanner;

public class OurDate {
	private int month, day, year;

	public OurDate() {
		month = 1;
		day = 1;
		year = 1901;
	}// end of default constructor

	public OurDate(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public void setYearFromUser() {
		Scanner keyboard = new Scanner(System.in);

		while(true){
			System.out.print("Enter a valid year: ");
			year = keyboard.nextInt();
			
			if (1901> year || year > 2015){
				System.out.println("You have to enter a valid year -> more than 1901 and less than 2015 ");
				
			}else
				break;
		}

		
	}// end setYearFromUser

	public void setMonthFromUser() {
		Scanner keyboard = new Scanner(System.in);
		
		while(true){
			System.out.print("Enter the month: ");
			month = keyboard.nextInt();
			
			if(month<1 || month>12){
				System.out.println("You have to enter a valid month -> more than or equal to 1 and less than 13");
			}else
				break;
		}
		
	}// end setMonthFromUser

	public void setDayFromUser() {
		Scanner keyboard = new Scanner(System.in);
		
		while(true){
			System.out.print("Enter the day: ");
			day = keyboard.nextInt();
			
			if(day<1 || day>30){
				System.out.println("You have to enter a valid day -> more than or equal to 1 and less than 31");
			}else
				break;
		}
		
	}// end setDayFromUser

	public void displayDate() {
		System.out.println(year + "/" + month + "/" + day);
	}// end of displayDate

	public int calcDays() {
		return (int) ((year - 1900) * 360 + (month - 1) * 30 + day - 1);

	}// end calculation days

}// end of class Time
