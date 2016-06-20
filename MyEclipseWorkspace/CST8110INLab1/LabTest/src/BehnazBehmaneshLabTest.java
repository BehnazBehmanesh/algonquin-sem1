import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * This program asks for the meal cost and the %of tip
 * After calculating the tip it will show us 
 * How much we spent on total
 * Instructor Hani 
 * Date Oct/16/2015
 * @author behi
 *
 */

public class BehnazBehmaneshLabTest {
	public static void main(String[] args){
		
	System.out.println("Welcome to Behnaz's tip calculation!!");
	
	System.out.print("Enter meal cost: ");
	Scanner Input = new Scanner (System.in);
	float mealcost = Input.nextFloat();
		
	System.out.print("Enter the tip %: ");
	Scanner Input1 = new Scanner (System.in);
	float tipperc = Input.nextFloat();
		
	//Tip Calculation
	float tip = mealcost*(tipperc/100);
	float spent = tip+mealcost;
	
			
	System.out.println("Meal Cost: "+"$"+mealcost);
	System.out.println("Tip: "+"$"+ Math.floor(tip * 100)/100 );
	System.out.printf("\nYou have spent" +" $"+spent+" for this meal");
	

	}
}
