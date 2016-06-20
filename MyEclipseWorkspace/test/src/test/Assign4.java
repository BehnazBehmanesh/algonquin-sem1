package test;

import java.util.Scanner;

/**
 *
 */

public class Assign4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean stillContinue = true;

		int upperLimit = 4;

		Ledger ledger1 = new Ledger(upperLimit);

		System.out.println("Welcome to your monthly ledger. You can see up to " + upperLimit + " invoices.");

		while (stillContinue == true) {

			ledger1.getInvoiceInfo();
			stillContinue = ledger1.wantToContinue();
		}

		ledger1.calculateMonthBills();
		ledger1.printInvoiceInfo();
	}
}
