package montlyLedger;

import java.util.Scanner;

public class Ledgern {
	private double sum;
	private int numberOfBills;
	private Invoice[] invoiceInfo;

	public Ledgern() {

		numberOfBills = 0;

	}

	public Ledgern(int nB) {
		numberOfBills = nB;
		invoiceInfo = new Invoice[numberOfBills];

	}

	public void getInvoiceInfo() {

		for (int i = 0; i < numberOfBills; i++) {

			System.out.println("\nEnter info for invoice number " + i + " :");

			invoiceInfo[i] = new Invoice();
			invoiceInfo[i].setNameFromUser();
			invoiceInfo[i].setAmountFromUser();
			invoiceInfo[i].setDateFromUser();

		}
	}

	public void calculateMonthBills() {
		sum = 0;
		for (int i = 0; i < numberOfBills; i++) {
			sum += invoiceInfo[i].getAmount();
		}
		System.out.println("\n\nTotal monthly bills: " + sum);
	}

	public void printInvoiceInfo() {

		System.out.println("\nBill Summary : ");
		for (int i = 0; i < numberOfBills; i++) {

			System.out.println(invoiceInfo[i].invoiceToString());
			System.out.println("");

		}

	}

	public Invoice[] getInvoices() {
		return invoiceInfo;
	}

	public Ledgern(Ledgern old) {

		Invoice[] oldInvoices;
		oldInvoices = old.getInvoices();
		int length = 2 * (oldInvoices.length);
		invoiceInfo = new Invoice[length];

		System.arraycopy(oldInvoices, 0, invoiceInfo, 0, numberOfBills);
		
		getInvoiceInfo();
		calculateMonthBills();
		printInvoiceInfo();
		

	}

}
