package montlyLedger;

import java.util.Scanner;

/* ******************************************
 * Assignment 4
 * Course Account: 15F-CST8110-323
 *   Author:   Behnaz Behmanesh
 *   Lab teacher: Hani Ezzadeen
 *   las update date: 29/11/2015
 *   Purpose:  gets info of the bills
*/

public class Invoice {

	private String name;
	private double billAmount;

	private OurDate invoiceDate;

	public Invoice() {
		name = new String(" ");
		billAmount = 0.0;
		invoiceDate = new OurDate();
	}// end of default constructor

	public void setNameFromUser() {
		System.out.print("Enter Company Name: ");
		Scanner companyName = new Scanner(System.in);
		name = companyName.nextLine();

	}// end of setNameFromUser() method

	public void setDateFromUser() {

		System.out.println("Enter invoice due date: ");
		invoiceDate.setDayFromUser();
		invoiceDate.setMonthFromUser();
		invoiceDate.setYearFromUser();
	}// end of setDatesFromUser() method

	public void setAmountFromUser() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter bill amount: ");
		billAmount = input.nextDouble();

		while (billAmount <= 0) {
			System.out.println("Invalid Input--> The bill amount should be greater than zero.");
			billAmount = input.nextDouble();
		}
	}// end of setAMountFromUser() method

	public double getAmount() {
		return billAmount;
	}// end of getAmount() method

	public String toString() {

		return name + "\n" + billAmount + "\n" + invoiceDate.toString() + "\n";
	}// end of toString() method

}