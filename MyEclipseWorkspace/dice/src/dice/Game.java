package dice;

import java.util.Scanner;

/**
 * CST8110-323 Lab Instructor: Hani Ezzedeen Author: Behnaz Behmanesh This class
 * simulates a created dice game
 * 
 * @author behi
 */

public class Game {
	private int potAmount, betAmount;

	public Game() {
		potAmount = 50;
		betAmount = 50;
	}

	public Game(int p) {
		potAmount = p;
	}

	public void getBetAmountFromUser() {

		Scanner userbA = new Scanner(System.in);

		System.out.print("\nYour current pot is " + potAmount);
		System.out.print("\nEnter your bet amount: ");
		betAmount = userbA.nextInt();

		while (betAmount < 0 || betAmount > potAmount) {
			System.out.print(
					"Error - Your bet cannot bet less than 0 or more than " + potAmount + "...Enter your bet amount: ");
			betAmount = userbA.nextInt();

		}

	}

	public void playGame() {

		while (betAmount >= 0 && potAmount != 0) {

			int num1 = 0;
			int num2 = 0;
			int num3 = 0;

			Die die1 = new Die();
			Die die2 = new Die();
			Die die3 = new Die();

			getBetAmountFromUser();

			num1 = die1.rollDie();
			num2 = die2.rollDie();
			num3 = die3.rollDie();

			if (betAmount == 0 || potAmount == 0) {
				System.out.println("You end the game with the pot of " + potAmount);
				break;
			}
			System.out.println("Your dice are: " + num1 + " and " + num2 + " and " + num3);

			if (betAmount > 0 && potAmount > 0) {
			}
			if ((num1 == num2) && (num1 == num3)) {
				System.out.println("You WIN....triple your bet");
				potAmount = (potAmount - betAmount) + (betAmount * 3);
			} else if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
				System.out.println("You WIN....double your bet");
				potAmount = (potAmount - betAmount) + (betAmount * 2);
			} else if ((num1 + num2 + num3) > 12) {
				System.out.println("You WIN....your bet back");
				potAmount = potAmount;

			} else if (betAmount == 0 || potAmount == 0) {
				System.out.println("You end the game with pot of " + potAmount);
				break;
			} else {
				System.out.println("You LOSE...your bet");
				potAmount = potAmount - betAmount;
			}

		}

	}
}
