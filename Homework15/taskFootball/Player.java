package taskFootball;

public class Player {
	// declaration of parameters 
	String name;
	Integer yearOfBirth;
	String position;
	
	/**
	 * Constructor
	 * @param name - players name
	 * @param yearOfBirth - birth year of player
	 * @param position - position on field
	 */
	public Player(String name, Integer yearOfBirth, String position) {
	
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}
	
	/**
	 * to String method for printing out the class above
	 */
	public String toString() {
		
		String s = "";
		s += "Name: " + name + "\n";
		s += "Year of birth: " + yearOfBirth + "\n";
		s += "Position: " + position + "\n";
		
		return s;
	}
	
}
