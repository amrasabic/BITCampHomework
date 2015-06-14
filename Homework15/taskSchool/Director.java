package taskSchool;

public class Director {
	// declaration of parameters 
	String name;
	Integer yearOfBirth;
	
	/**
	 * Constructor
	 * @param name - director name
	 * @param yearOfBirth - birth year of director
	 */
	public Director(String name, Integer yearOfBirth) {
		
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	/**
	 * to String method for printing out the class above
	 */
	public String toSting(){
		
		String s = "";
		s += "Directors name: " + name + "\n";
		s += "Year of birth: " + yearOfBirth + "\n";
		return s;
	}
}
