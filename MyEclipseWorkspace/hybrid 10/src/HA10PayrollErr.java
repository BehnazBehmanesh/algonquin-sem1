
import java.util.*;

public class HA10PayrollErr {

	public static void main(String[] args) {
		float hoursWorked;
		float ratePay;

		float basePay = 0.0f;
		float overtimePay = 0.0f;
		float totalPay = 0.0f;
		float taxDeducted = 0.0f;
		float netPay = 0.0f;

		int doAgain = 0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter hours worked this week");
			hoursWorked = input.nextFloat();
			System.out.println("Enter rate of pay");
			ratePay = input.nextFloat();

			if (hoursWorked > 37.5f) {
				basePay = 37.5f * ratePay;
				overtimePay = (hoursWorked - 37.5f) * (ratePay * 1.5f);
			} else {
				overtimePay = 0;    // added this line
				basePay = hoursWorked * ratePay;
			}
			totalPay = basePay + overtimePay;
			if (totalPay < 1000)
				taxDeducted = 0;
			else if (totalPay > 2000)
				taxDeducted = totalPay * 0.30f;
			else
				taxDeducted = totalPay * 0.20f;

			netPay = totalPay - taxDeducted;

			System.out.println("Base pay is : $" + basePay);
			System.out.println("Overtime pay is : $" + overtimePay);
			System.out.println("Tax deducted is : $" + taxDeducted);
			System.out.println("Net pay is : $" + netPay);

			System.out.println("Enter 0 to repeat, or 1 to quit: ");
			doAgain = input.nextInt();
			while (doAgain != 1 && doAgain != 0) {
				System.out.println("Invalid code");
				System.out.println("Enter 0 to repeat, or 1 to quit: ");
				doAgain = input.nextInt(); //fixed the part that checks 1 and 0 for termination
			}
			if (doAgain == 1)
				break;
		} while (doAgain == 0);
	}

}
