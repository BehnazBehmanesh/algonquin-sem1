package circle;

import java.util.Scanner;

public class Circle {
	private double radius;

	
	public Circle(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double calcArea() {
		return ((radius * radius) * 3.14);
	}
	
	public void putRadius() {
		System.out.print("Please input a value for cylinder's radius:");
		Scanner newRadius = new Scanner(System.in);
		radius = newRadius.nextDouble();
	}
	
}
