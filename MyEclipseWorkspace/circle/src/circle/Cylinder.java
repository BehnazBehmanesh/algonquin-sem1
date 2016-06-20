package circle;

import java.util.Scanner;

public class Cylinder {
	private Circle circle;
	private double height;
	
	
	public Cylinder(double h, Circle c) {
		height = h;
		circle= c;
		}
	
	public double calculateVolume() {
	
		return ((circle.calcArea())* (height));
	}
		
	public void getRadius() {
		circle.getRadius();
	}

	public void putRadius() {
		circle.putRadius();
	}

	public void putHeight() {
		System.out.print("Please input a value for cylinder's height:");
		Scanner newHeight = new Scanner(System.in);
		height= newHeight.nextDouble();
	}

}
