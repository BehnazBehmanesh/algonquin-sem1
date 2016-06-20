package montlyLedger;

import java.util.Scanner;

/* ******************************************
 * Assignment 4
 * Course Account: 15F-CST8110-323
 *   Author:   Behnaz Behmanesh
 *   Lab teacher: Hani Ezzadeen
 *   las update date: 29/11/2015
 *   Purpose:  will caculate the monthly ledger 
*/

public class Ledger {

	private int numberOfBills;
	private Invoice[] invoiceInfo;
	private int counter;
	boolean doAgain = true;

	public Ledger() {
		numberOfBills = 0;
	}// end of default constructor

	public Ledger(int nB) {
		numberOfBills = nB;
		counter = nB;
		invoiceInfo = new Invoice[numberOfBills];
	}// end of initial constructor

	public void getInvoiceInfo() {

		System.out.println("\nEnter info for invoice number " + (numberOfBills - counter) + ": ");

		invoiceInfo[numberOfBills - counter] = new Invoice();
		invoiceInfo[numberOfBills - counter].setNameFromUser();
		invoiceInfo[numberOfBills - counter].setAmountFromUser();
		invoiceInfo[numberOfBills - counter].setDateFromUser();

	}// end of getInvoiceInfo() method

	public void calculateMonthBills() {
		double sum = 0;

		for (int i = 0; i <= (numberOfBills - counter); i++) {

			sum += invoiceInfo[i].getAmount();
		}
		System.out.println("\n\nTotal monthly bills: " + sum);
	}// end of calculateMonthBills() method

	public void printInvoiceInfo() {

		System.out.println("\nBill Summary :");

		for (int i = 0; i <= (numberOfBills - counter); i++) {
			System.out.println(invoiceInfo[i].toString());
		}
	}// end of printInvoiceInfo() method

	// bonus part

	public boolean doItAgain() {

		boolean doAgain = true;
		String userRespons;
		char res;

		Scanner in = new Scanner(System.in);

		System.out.println("Do you want to add another Invoice ?--> Pres Y for 'Yes' and N for 'No'. ");
		userRespons = in.nextLine();
		res = userRespons.charAt(0);

		switch (res) {
		case 'Y':
		case 'y':
			doAgain = true;
			numberOfBills++;
			break;

		case 'N':
		case 'n':
			doAgain = false;
			break;
		}

		if (doAgain == true) {
			if ((numberOfBills - counter) >= counter) {
				doAgain = false;
				numberOfBills--;
				System.out.println("You have reached to the max!");
			}
		}
		return (doAgain);
	}

}
