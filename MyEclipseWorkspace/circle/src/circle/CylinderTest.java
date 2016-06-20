package circle;

public class CylinderTest {
	public static void main(String args[]) {

		Circle c1 = new Circle(10);
		Cylinder c2 = new Cylinder(20,c1);
		
		System.out.println("The radius of the cylinder's circle is: " + c1.getRadius());
		System.out.println("The volume of the cylinder is: " + c2.calculateVolume());
		
		c1.putRadius();
		c2.putHeight();
		
		
		
		
		System.out.println("The radius of the cylinder's circle is: " + c1.getRadius());
		System.out.print("The volume of the cylinder is: " + c2.calculateVolume());
	}

}
