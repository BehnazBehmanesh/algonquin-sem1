package montlyLedger;

import java.util.Scanner;

/* ******************************************
 * Assignment 4
 * Course Account: 15F-CST8110-323
 *   Author:   Behnaz Behmanesh
 *   Lab teacher: Hani Ezzadeen
 *   las update date: 29/11/2015
 *   Purpose:  this class is the driver class for monthly ledger 
*/

public class Assign4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean doAgain = true;

		int upperLimit = 100;

		Ledger ledger1 = new Ledger(upperLimit);

		System.out.println("Welcome to monthly ledger program. You can enter up to " + upperLimit + " invoices.");

		while (doAgain == true) {

			ledger1.getInvoiceInfo();
			doAgain = ledger1.doItAgain();
		}

		ledger1.calculateMonthBills();
		ledger1.printInvoiceInfo();
	}
}
