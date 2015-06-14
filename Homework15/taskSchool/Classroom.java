package taskSchool;

public class Classroom {
	// declaration of parameters 
	String className;
	Integer numStudents;
	
	/**
	 * Constructor
	 * @param className - name of the class 
	 * @param numStudents - number of students in the class
	 */
	public Classroom(String className, Integer numStudents) {
		
		this.className = className;
		this.numStudents = numStudents;
	}
	
	/**
	 * to String method for printing out the class above
	 */
	public String toSting(){
		
		String s = "";
		s += "Class name: " + className + "\n";
		s += "Number of students: " + numStudents + "\n";
		return s;
	}
}
