package taskSchool;

public class School {
	// declaration of parameters 
	String name;
	Director d;
	Classroom[] schoolClass;
	
	/**
	 * Constructor
	 * @param name - name of school
	 * @param d - director of school
	 * @param schoolClass - Classes in school
	 */
	public School (String name, Director d, Classroom[] schoolClass) {
		
		this.name = name;
		this.d = d;
		this.schoolClass = schoolClass;
	}
	
	/**
	 * to String method for printing out the class above
	 */
	public String toString(){
		
		String s = "";
		s += "School name: " + name + "\n";
		s += "Director: " + d + "\n";
		s += "School classes: " + schoolClass + "\n";
		return s;
		
	}
}
