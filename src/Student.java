/**
 * This class represents a student object with one instance variable
 * 
 * @author shehab
 *
 */
public class Student {
	private String name;

	/**
	 * Class constructor accepting String argument
	 * 
	 * @param name - String representing student's name
	 */
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + '}';
	}

}
