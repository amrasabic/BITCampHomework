package taskFootball;

public class Team {
	// declaration of parameters 
	String clubName;
	Player[] player;
	
	/**
	 * Constructor
	 * @param clubName - name of football club
	 * @param player - array of players in the club
	 */
	public Team(String clubName, Player[] player) {
		
		this.clubName = clubName;
		this.player = player;
	}

	/**
	 * to String method for printing out the class above
	 */
	public String toString() {
		
		String s = " ";
		s += "Club name " + clubName + "\n";
		s += "Players: " + player + "\n";
			
		return s;
	}
}
