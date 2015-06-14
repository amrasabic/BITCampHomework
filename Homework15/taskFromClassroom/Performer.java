

import java.util.Arrays;

public class Performer {
	// declaration of parameters 
	String name;
	Boolean group;
	Integer activeSince;
	String genre;
	
	/**
	 * Constructor
	 * @param name - performers name
	 * @param group - boolean is it a group
	 * @param activeSince - since when are they active
	 * @param genre - genre
	 */
	public Performer(String name, Boolean group, Integer activeSince, String genre) {
	
		this.name = name;
		this.group = group;
		this.activeSince = activeSince;
		this.genre = genre;
	}
	
	
	
}
