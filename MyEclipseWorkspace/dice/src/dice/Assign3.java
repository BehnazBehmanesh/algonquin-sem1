package dice;

/**
 * CST8110-321 Lab Instructor: Hani Ezzedeen Author: Behnaz Behmanesh This
 * programe is the main part of the Dice Game program
 * 
 * @author behi
 */

public class Assign3 {

	public static void main(String[] args) {

		Game game1 = new Game(50);

		System.out.println(
				"Welcome to Solitaire DICE GAME. " + "Bet an amount-"+"\n-If the sum of the three die is greater than 12,"
						+ " you keep your bet,"+"\n-If you roll doubles, you win double your bet, "
						+ "\n-If you roll triples, you win triple your bet,"+" \n-Otherwise, you lose your bet. "
						+ "\n-A bet of 0 ends the game.");

		game1.playGame();

	}

}
