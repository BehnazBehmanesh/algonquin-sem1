/**This is the main method
 * teacher: Hani Ezzedeen
 * writer: Behnaz Behmanesh 
 * Student: 040844523
 */
package labTest;

public class YourNameLabTest {

	public static void main(String[] args) {
		System.out.println("Welcome to the mark - comments converter!");
		
		GradeComment markCom = new GradeComment();
		while (markCom.getMark()!= -1){
			markCom.setMark();
			markCom.doComments();
			markCom.getComments();

			
		}
	}

}
