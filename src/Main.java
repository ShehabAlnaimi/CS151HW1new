/**
 * Main class serving as a runner for the project
 * 
 * @author shehab
 *
 */
public class Main {
	/**
	 * Main method, where a student object is created with a name passed to the
	 * constructor. Then the value of the instance variable is printed with a
	 * toString() method
	 * 
	 * @param args - String []
	 */
	public static void main(String[] args) {

		Student student = new Student("Tom");

		System.out.println(student.toString());

	}

}
