/* ******************************************
 * Assignment 2
 * Course Account: 15F-CST8110-320
 *   Author:   Behnaz Behmanesh
 *   Lab teacher: Hani Ezzadeen
 *   Completion date: 29/10/2015
 *   Purpose:  this program calculates 
 *   the invoice and it's related componnents 
*/
import java.util.Scanner;

public class Invoice {
	private double minutesPurchased, invoiceAmount, interest, tax, totalAmount, minsToBuy;

	private OurDate todayDate;
	private OurDate invoiceDate;

	public Invoice() {
		minutesPurchased = 0;
		invoiceAmount = 0;
		interest = 0;
		tax = 0;
		totalAmount = 0;

		todayDate = new OurDate();
		invoiceDate = new OurDate();
	}// end of default constructor

	public void setMinutesFromUser() {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the number of minutes you wish to purchase: ");
			minutesPurchased = input.nextDouble();

			if (minutesPurchased <= 0) {
				System.out.println("Invalid Input- The entered purchased minutes should be greater than zero.");

			} else
				break;
		}

	}// end of getting minutes from user

	public void setDatesFromUser() {
		
		
		System.out.println("Enter today's date:");

		todayDate.setYearFromUser();
		todayDate.setMonthFromUser();
		todayDate.setDayFromUser();

		System.out.println("Enter invoice date:");

		invoiceDate.setYearFromUser();
		invoiceDate.setMonthFromUser();
		invoiceDate.setDayFromUser();

	}// end of getting date from user

	public void calculateInvoice() {

		System.out.print("\nToday Date: ");
		todayDate.displayDate();

		System.out.print("Invoice Date: ");
		invoiceDate.displayDate();

		todayDate.calcDays();
		invoiceDate.calcDays();

		invoiceAmount = (minutesPurchased * 0.02) + 5.0;

		if ((todayDate.calcDays() - invoiceDate.calcDays()) > 60) {
			interest = invoiceAmount * 0.1;
		} else {
			interest = 0;
		}
		tax = invoiceAmount * 0.13;

		totalAmount = invoiceAmount + tax + interest;
	}

	public void displayInvoice() {

		System.out.println("\nThe number of days since invoice date: " + (todayDate.calcDays() - invoiceDate.calcDays()));
		System.out.printf("Invoice amount  : $%.2f\n", invoiceAmount);
		System.out.printf("Tax             : $%.2f\n", tax);
		System.out.printf("Interest        : $%.2f\n", interest);
		System.out.printf("TOTAL           : $%.2f", totalAmount);

	}

}
