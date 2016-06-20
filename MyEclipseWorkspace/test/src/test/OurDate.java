package test;

import java.util.Scanner;

/**
 */

public class OurDate {
	private int month; // private int month,day,year;
	private int day;
	private int year;
	boolean checkTodayDate;

	public OurDate() { // default constructor
		month = 1;
		day = 1;
		year = 1900;
	}

	public OurDate(int m, int d, int y) { // Initial constructor
		month = m; // this.month=m; is Ok too
		day = d;
		year = y;
	}

	public void setYearFromUser() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter year: ");
			year = input.nextInt();
		} while (year < 1900 || year > 2016);
	}

	public void setMonthFromUser() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter month: ");
			month = input.nextInt();
		} while (month <= 0 || month > 12);
	}

	public void setDayFromUser() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter day: ");
			day = input.nextInt();
		} while (day <= 0 || day > 30);
	}

	public void displayDate() {
		System.out.println(year + "/" + month + "/" + day);
	}

	public String toString() {
		return (year + "/" + month + "/" + day);
	}// end of toString() method

}
// end of class OurDate
