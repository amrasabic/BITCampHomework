package taskBooks;

public class Books {
	// declaration of parameters 
	String name;
	Integer year;
	String genre;
	boolean isBestSeller;
	
	/**
	 * Constructor
	 * @param name - name of the book
	 * @param year - publishing year
	 * @param genre - genre of the book
	 * @param isBestSeller - boolean true value if it's a best seller
	 */
	public Books(String name, Integer year, String genre, boolean isBestSeller) {
		
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.isBestSeller = isBestSeller;
	}
	
	/**
	 * to String method for printing out the class above
	 */
	public String toString() {
		
		String s = "";
		s += "Name: " + name + "\n";
		s += "Year: " + year + "\n";
		s += "Genre " + genre + "\n";
		s += "Is best seller? " + isBestSeller + "\n";
		
		return s;
	}
}
