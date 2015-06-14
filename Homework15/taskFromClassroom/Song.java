
import java.util.Arrays;

public class Song {
	// declaration of parameters 
	Performer artist; // summons up a performer class
	String nameSong;
	Integer publishingYear;
	String genre;
	
	/**
	 * constructor
	 * 
	 * @param artist
	 * @param nameSong
	 * @param publishingYear
	 * @param genre
	 */
	public Song(Performer artist, String nameSong, Integer publishingYear, String genre){
		
		this.artist = artist;
		this.nameSong = nameSong;
		this.publishingYear = publishingYear;
		this.genre = genre;
	}
	/**
	 * to String method for printing out the class above
	 */
	public String toString(){
		// artist.name - name from performer class
		String s = "Artist: " + artist.name + "\n"; 
		s = s  + "Song " + nameSong + "\n";
		s = s  + "Publishing year " + publishingYear + "\n";
		s = s  + "Genre " + genre + "\n";
		
		return s;
	}
}
