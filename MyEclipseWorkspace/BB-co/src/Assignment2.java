/* ******************************************
 * Assignment 2
 * Course Account: 15F-CST8110-320
 *   Author:   Behnaz Behmanesh
 *   Lab teacher: Hani Ezzadeen
 *   Completion date: 29/10/2015
 *   Purpose:  This program calls classes OurDate and Invoice
 *   and show date, invoice and it's components 
*/

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice();
		OurDate ourDate1 = new OurDate();

		System.out.println("Welcome to the BB-co Telecom Company Billing System");
		invoice1.setMinutesFromUser();
		invoice1.setDatesFromUser();
		invoice1.calculateInvoice();
		invoice1.displayInvoice();

	}

}

