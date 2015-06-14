import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// declaration of different performers
		Performer p1 = new Performer("Artic monkeys", true, 2002, "Rock");
		Performer p2 = new Performer("Imagine dragons", true, 2008, "Rock");
		Performer p3 = new Performer("Tarja Turunen", false, 1996, "Power metal");
		// arrays of performers
		Performer[] groupOnePerformers = {p1, p2};
		Performer[] groupTwoPerformers = {p3};
		// declaration of different songs
		Song s1 = new Song(p2, "Radioactive", 2012, "Rock");
		Song s2 = new Song(p2, "Demons", 2012, "Rock");
		Song s3 = new Song(p1, "Do I Wanna Know?", 2013, "Rock");
		Song s4 = new Song(p3, "Angels fall first", 1997, "Power metal");
		Song s5 = new Song(p3, "Moondance", 1998, "Power metal");
		// arrays of songs
		Song[] songsID = {s1, s2};
		Song[] songsAM = {s3};
		Song[] songsT = {s4};
		// arrays of songs two different performers
		Song[] songsIDandAM = {s1, s2, s3};
		// declaration of different albums
		Album a1 = new Album ("Night Visions", p2, songsID, "Rock");
		Album a2 = new Album ("Angels fall first", p3, songsT, "Power metal");
		Album a3 = new Album ("Oceanborn", p3, songsT, "Power metal");
		// arrays of albums
		Album[] albums = {a1, a2, a3};
		// declaration of different concerts
		Concert togetherIDandAM = new Concert(groupOnePerformers, songsIDandAM);
		Concert justT = new Concert(groupTwoPerformers, songsT);
		// calls out for methods and prints result
		System.out.println("Performer is the same? " + isSameAuthor(s2, s1));
		System.out.println(s1);
		System.out.println("Is from solo author? " + isFromSoloAuthor(s3));
		System.out.println("\nThis song was published before:\n" + getOlderSong(s1, s2));
		System.out.println("Count genre number: " + countGenreNumber(a1, s2.genre));
		printAlbumInformation(albums, s1);
		System.out.println("Number of song per album: " +
				Arrays.toString(getNumberOfSongsPerAlbum(togetherIDandAM, albums)));
	}
	/**
	 * Is author the same
	 * <p>
	 * compares to song authors and return true if they are the same.
	 * @param s1 - song one to compare
	 * @param s2 - second song 
	 * @return - true if they are the same, if not return false
	 */
	public static boolean isSameAuthor(Song s1, Song s2){
		// compare artists of songs
		if(s1.artist == s2.artist){
			// if it's same return true
			return true;
		} // else return false
		return false;
	}
	/**
	 * Is from solo author
	 * <p>
	 * determines if author of the song is a solo artist or group
	 * @param s - song
	 * @return - true if it's a song from solo author 
	 */
	public static boolean isFromSoloAuthor(Song s){
		// check boolean value - artist group
		if(s.artist.group == true){
			// if it's a solo return true 
			return true;
		} else{
		return false;
		}
	}
	/**
	 * Get older song
	 * <p>
	 * Compares two song and returns one that was published earlier
	 * @param s1 - first song to compare
	 * @param s2 - second song to compare
	 * @return - song published earlier
	 */
	public static Song getOlderSong(Song s1, Song s2){
		// compare publishing years
		if(s1.publishingYear < s2.publishingYear){
			// return s1 in case it's lower
			return s1;
		}
		return s2;
	}
	/**
	 * Count genre number in album
	 * @param a - album
	 * @param genre - which you want count
	 * @return - number of songs with that genre
	 */
	public static int countGenreNumber(Album a, String genre){
		
		int counter = 0;
		// for loop within songs length
		for (int i = 0; i < a.songs.length; i++){
			// it the genre is same counter++
			if(a.songs[i].genre == genre){
				counter++;
			}
		}
		return counter;
	}
	/**
	 * Print album information
	 * <p>
	 * Prints null if that song is not in that album.
	 * @param a - album
	 * @param s - song
	 */
	public static void printAlbumInformation(Album[] a, Song s){
	
	int counter = 0;
	// for loop within album length
	for(int i = 0; i < a.length; i++){
		// for loop within songs length
		for(int j = 0; j < a[i].songs.length; j++){
			// if song is in the album print info
			if(a[i].songs[j].nameSong == s.nameSong){
				System.out.println("Album of the song is: " + a[i].name);
				counter++;
				break;
			}			
		} 		
	} 
	// if song isn't in album return null
	if (counter == 0){
		System.out.println("null");
	}
	
	}
	
	/**
	 * Get number of songs per Album on concert
	 * @param c - concert
	 * @param a - album
	 * @return - array of songs per album
	 */
	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a){
		
		int counter = 0;
		// create array of songs
		int[] songNumber = new int[a.length];
		// for loop within album length
		for(int i = 0; i < a.length; i++){
			// reset counter
			counter = 0;
			// for loop within songs length
			for(int j = 0; j < c.songs.length; j++){
				// compare songs form concert with album songs
				for(int k = 0; k < a[i].songs.length; k++){
					if(c.songs[j].nameSong.equals(a[i].songs[k].nameSong)){
						counter++;
					}
				}
				// add counter to i position
				songNumber[i] = counter;
			} 
			
		}
		return songNumber;
		
	}
	/**
	 * Get max number of songs on concert
	 * <p>
	 * 
	 * @param c - concert
	 * @return - max number of songs by one performer
	 */
	public static int getMaxNumberOfSongs(Concert c){
		// store max number of songs in this var
		int getMaxNumOfSongs = 0;
		// for loop within artist length
		for(int i = 0; i < c.artist.length; i++){
			// reset counter
			int counter = 0;
			// for loop within songs length
			for(int j = 0; j < c.songs.length; j++){
				// compare artist i and songs j, if it's a match counter++ 
				if(c.artist[i] == c.songs[j].artist){
					counter++;
				}
				// overwrite if counter is larger then previous number
				if(getMaxNumOfSongs < counter){
					getMaxNumOfSongs = counter;
				}
			}
		}
		return getMaxNumOfSongs;
	}
}
