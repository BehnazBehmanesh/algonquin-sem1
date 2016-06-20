package wage;
import java.util.Scanner;
public class WageCalculate {

	public static void main(String[] args) {
		double hoursWorked, rate, basePay, overTime,totalPay,
		tax, netPay;


		System.out.print("Enter the number of hours worked: ");
		Scanner input1 = new Scanner(System.in);

		while(true){
			hoursWorked = input1.nextDouble();

			if (0>hoursWorked || 60<hoursWorked){
				System.out.print("Total hours of the week should be between 0 & 60");
			}else
				break;
		}
		System.out.print("Enter the rate of pay:");
		Scanner input2 = new Scanner(System.in);

		while(true){
			rate = input2.nextDouble();

			if(0>rate || rate>1500){
				System.out.print("The hourly rate should be between 0 & 1500");
			}else
				break;
		}
		overTime = (hoursWorked-37.50)*(rate*1.50);
		basePay= rate*37.50;
		totalPay= overTime+basePay;


		if(totalPay<=1000.00){
			tax = 0.00;
		}else
			if(1000.00<totalPay && totalPay<2000.00){
				tax = totalPay*0.20;
			}else 
				tax = totalPay*0.30;
		netPay = totalPay-tax;

		System.out.printf("\nBase pay is $%.2f ",basePay);
		System.out.printf("\nOvertime pay is $%.2f ",overTime);
		System.out.printf("\nTotal pay is $%.2f ", totalPay);
		System.out.printf("\nTax deducted is $%.2f ", tax);
		System.out.printf("\nNet pay is $%.2f ", netPay);
	}







}

