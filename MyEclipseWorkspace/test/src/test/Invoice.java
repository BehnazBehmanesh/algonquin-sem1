package test;

import java.util.Scanner;

/**
 * 
 */

public class Invoice {

	private String companyName;
	private double billAmount;

	private OurDate invoiceDate;

	public Invoice() {
		companyName = null; // or companyName= new String(" ");
		billAmount = 0.0;
		invoiceDate = new OurDate();
	}// end of default constructor

	public String setNameFromUser() {

		Scanner input = new Scanner(System.in);
		companyName = new String();
		boolean isValidInput;

		do {
			System.out.print("Enter Company Name: ");
			companyName = input.nextLine();

			for (int i = 0; i < companyName.length(); i++) {
				if (companyName.charAt(i) >= 0 || companyName.charAt(i) <= 9) {
					isValidInput = false;
					break;
				}
				System.out.println("Invalid Input- The entered companyName cannot be a number.");
				companyName = input.nextLine();
			}
		} while (isValidInput = false);

		return companyName;

	}// end of setNameFromUser() method

	public void setDatesFromUser() {

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
			System.out.println("Invalid Input- The entered bill amount should be greater than zero.");
			billAmount = input.nextDouble();
		}
	}// end of setAMountFromUser() method

	public double getAmount() {
		return billAmount;
	}// end of getAmount() method

	public String toString() {

		return companyName + "\n" + billAmount + "\n" + invoiceDate.toString() + "\n";
	}// end of toString() method

}
// end of class Invoice