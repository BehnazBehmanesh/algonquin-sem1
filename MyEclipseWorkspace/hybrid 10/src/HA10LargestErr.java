import java.util.*;
public class HA10LargestErr {
	private int num1;
	private int num2;
	private int num3;
	
	public HA10LargestErr() {
		num1 = 0;
		num2 = 0;
		num3 = 0;
	}
	
	public void  getNumsFromUser() {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter three numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
	}
	
	public int returnLargest() {
		if (num1 >= num2 && num1 >= num3) // added "=" to both
			return num1;
		else if (num2 >= num3 ) // added "=" and "else" and removed one compare
			return num2;
		else return num3;  // added "else"
	}

	
	public static void main(String[] args) {
		
		HA10LargestErr data = new HA10LargestErr(); //HA8LargestErr changed to HA10LargestErr 
		
		data.getNumsFromUser();
		System.out.println ("The largest is : " + data.returnLargest());

	}

}

