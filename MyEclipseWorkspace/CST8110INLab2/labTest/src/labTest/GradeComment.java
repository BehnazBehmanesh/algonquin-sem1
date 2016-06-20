/**This is the program for giving comments
 * on the grades
 * teacher: Hani Ezzedeen
 * writer: Behnaz Behmanesh 
 * Student: 040844523
 */
package labTest;

import java.util.Scanner;

public class GradeComment {

	float mark;
	String comments;

	public GradeComment() {
		mark = 0;
		comments = null;
	}

	public void setMark() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the course mark (numeric value): ");
		mark = input.nextInt();

		while (mark < 0 || mark > 100) {
			
			System.out.println("The mark you entered is not valid!");
			System.out.print("Enter the course mark (numeric value): ");
			mark = input.nextInt();
				
			
		}
	}

	public void doComments() {
		if (mark <= 100 && mark >= 90) {
			comments = "Excellent";
		} else if (mark <= 89 && mark >= 80) {
			comments = "Good job";
		} else if (mark <= 79 && mark >= 70) {
			comments = "Doing OK";
		} else if (mark <= 69 && mark >= 50) {
			comments = "Passed";
		} else if (mark <= 50) {
			comments = "Failed";
		}
	}

	public String getComments() {
		System.out.println("The comment is: " + comments);
		return comments;
	}

	public float getMark() {
		return mark;
	}

}
