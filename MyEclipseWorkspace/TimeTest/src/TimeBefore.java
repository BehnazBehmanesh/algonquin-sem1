
	import java.util.*;
	/*    Time class
	      Author:   Linda Crane
		Purpose:  this program reads in values for hours/minutes/ seconds from the user and computes and displays total seconds for this time 
	*/

	public class TimeBefore {



		public static void main (String [] args) {
			int hours = 0;
			int minutes = 0;
			int seconds= 0;

			Scanner keyboard = new Scanner (System.in);

			// enter values....
		   	System.out.println("Enter the hours(0-23): ");
	        	hours = keyboard.nextInt();
			System.out.println("Enter the minutes (0-59): ");
		   	minutes = keyboard.nextInt();
			System.out.println("Enter the seconds (0-59): ");
			seconds = keyboard.nextInt();


			System.out.print ("\nThe time entered is  ");
			System.out.println (hours + ":" + minutes + ":" + seconds);

			int totalSeconds = ((hours*60+minutes)*60+seconds);
			System.out.print ("\nThe total time is seconds is " + 	totalSeconds);
		} // end of main

	
}

