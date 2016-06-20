package montlyLedger;

import java.util.Scanner;

public class Assign4n {
	public static void main(String[] args) {

		System.out.print("You can Enter info for 2 invoices: ");
		int doAgain =0;

		Ledgern ledgern1 = new Ledgern(2);
		ledgern1.getInvoiceInfo();
		System.out.println("\nDo you want to enter more invoces? -->press 1 for CONTINUE, press 0 for QUIT");

		Scanner key = new Scanner(System.in);
		doAgain = key.nextInt();

		while (doAgain != 1 && doAgain != 0) {
			System.out.println("Invalid code");
			doAgain = key.nextInt();
		}
		
		if (doAgain == 1) {
			ledgern1.Ledgern(Ledgern old);
	} else ;
		break;
	}

}
