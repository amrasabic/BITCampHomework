package taskBooks;

public class Author {
	// declaration of parameters 
	String name;
	Integer yearOfBirth;
	Books[] book;
	
	/**
	 * Constructor
	 * @param name - Name of author
	 * @param yearOfBirth - Year of authors birth 
	 * @param book - array of books written by author above
	 */
	public Author(String name, Integer yearOfBirth, Books[] book) {
		
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.book = book;
	}
	
	/**
	 * to String method for printing out the class above
	 */
	public String toString() {
		
		String s = "";
		s += "Name: " + name + "\n";
		s += "Year of birth: " + yearOfBirth + "\n";
		s += "Book: " + book + "\n";
		
		return s;
	}
}
