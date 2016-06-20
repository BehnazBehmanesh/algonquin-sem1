package dice;

import java.util.Random;

/**
 * CST8110-323 Lab Instructor: Hani Ezzedeen Author: Behnaz Behmanesh This Class
 * generates random number for dice
 * 
 * @author behi
 */

public class Die {
	private int dieValue;

	public Die() {
		dieValue = 0;
	}

	public Die(int d) {
		dieValue = d;
	}

	public int rollDie() {

		Random randNum = new Random();
		dieValue = randNum.nextInt(6) + 1;
		return (dieValue);

	}

	public void displayDie() {
		System.out.println(dieValue);

	}

}
