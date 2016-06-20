package montlyLedger;

import java.util.Scanner;

/* ******************************************
 * Assignment 4
 * Course Account: 15F-CST8110-323
 *   Author:   Behnaz Behmanesh
 *   Lab teacher: Hani Ezzadeen
 *   las update date: 29/11/2015
 *   Purpose:  this program gets, sets and calculates
 *   date and time 
*/

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

		while (true) {
			System.out.print("Enter year: ");
			year = keyboard.nextInt();

			if (1901 > year || year > 2015) {
				System.out.println("You have to enter a valid year -> more than 1901 and less than 2015 ");

			} else
				break;
		}

	}// end setYearFromUser

	public void setMonthFromUser() {
		Scanner keyboard = new Scanner(System.in);

		while (true) {
			System.out.print("Enter month: ");
			month = keyboard.nextInt();

			if (month < 1 || month > 12) {
				System.out.println("You have to enter a valid month -> more than or equal to 1 and less than 13");
			} else
				break;
		}

	}// end setMonthFromUser

	public void setDayFromUser() {
		Scanner keyboard = new Scanner(System.in);

		while (true) {
			System.out.print("Enter day: ");
			day = keyboard.nextInt();

			if (day < 1 || day > 30) {
				System.out.println("You have to enter a valid day -> more than or equal to 1 and less than 31");
			} else
				break;
		}

	}// end setDayFromUser

	public String toString() {
		return day + "/" + month + "/" + year;
	}

}// end of class OurDate
