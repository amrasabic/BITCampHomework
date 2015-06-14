

public class Album {
	// declaration of parameters 
	String name;
	Performer artist;
	Song[] songs;
	String genre;
	
	/**
	 * Constructor
	 * @param name - name of album
	 * @param artist - artist name
	 * @param songs - array of songs
	 * @param genre - genre of album
	 */
	public Album(String name, Performer artist, Song[] songs, String genre) {
		
		this.name = name;
		this.artist = artist;
		this.songs = songs;
		this.genre = genre;
	}

	
}
