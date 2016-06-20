import java.util.Scanner;

/**
 * 
 */

/**
 * @author behi
 *
 */
public class JavaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will produce a printout of three multiples of a number");

		Scanner s = new Scanner(System.in);
		
		int input = s.nextInt();
		
		System.out.println("The first three multiples of" +input+ "are");
			System.out.println(input*1);
			System.out.println(input*2);
			System.out.println(input*3);
			
		}

	}




