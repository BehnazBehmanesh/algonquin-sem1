package test;

import java.util.Scanner;

/**
 * 
 */

public class Ledger {

	private int numOfInvoice;
	private Invoice[] monthlyInvoice;
	private int k;
	boolean stillContinue = true;

	public Ledger() {
		numOfInvoice = 0;
		// monthlyInvoice = null;
		monthlyInvoice = new Invoice[numOfInvoice];
	}// end of default constructor

	public Ledger(int num) {
		numOfInvoice = num;
		k = num;
		monthlyInvoice = new Invoice[numOfInvoice];
	}// end of initial constructor

	public void getInvoiceInfo() {

		// for (int i = 0; i < numOfInvoice; i++) {
		System.out.println("\nEnter info for invoice number " + (numOfInvoice - k) + ": ");

		monthlyInvoice[numOfInvoice - k] = new Invoice();
		monthlyInvoice[numOfInvoice - k].setNameFromUser();
		monthlyInvoice[numOfInvoice - k].setAmountFromUser();
		monthlyInvoice[numOfInvoice - k].setDatesFromUser();
		// }
	}// end of getInvoiceInfo() method

	public void calculateMonthBills() {
		double totalBill = 0;

		// monthlyInvoice = new Invoice[numOfInvoice];
		// Having this line written makes everything zero
		for (int i = 0; i <= (numOfInvoice - k); i++) {

			totalBill += monthlyInvoice[i].getAmount();
		}
		System.out.println("\n\nTotal monthly bills: " + totalBill);
	}// end of calculateMonthBills() method

	public void printInvoiceInfo() {

		System.out.println("\nBill Summary :");

		for (int i = 0; i <= (numOfInvoice - k); i++) {
			System.out.println(monthlyInvoice[i].toString());
		}
	}// end of printInvoiceInfo() method

	public boolean wantToContinue() {

		boolean stillContinue = true;
		String answer;
		char ans;

		Scanner in = new Scanner(System.in);

		// Invoice[] monthlyInvoice = new Invoice[20];

		System.out.println("Do you need to add another Invoice (Y/N) ?");
		answer = in.nextLine();
		ans = answer.charAt(0);

		switch (ans) {
		case 'Y':
		case 'y':
			stillContinue = true;
			numOfInvoice++;
			break;

		case 'N':
		case 'n':

			stillContinue = false;
			break;
		}
		// System.out.println("K = "+k);
		// System.out.println("numOfInvoice" +numOfInvoice);
		if (stillContinue == true) {
			if ((numOfInvoice - k) >= k) {
				stillContinue = false;
				numOfInvoice--;
				System.out.println("You have reached to the max!");
			}
		}
		return (stillContinue);
	}

}
