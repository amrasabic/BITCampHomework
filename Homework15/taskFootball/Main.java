package taskFootball;

public class Main {

	public static void main(String[] args) {
		// declaration of different players
		Player p1 = new Player("Adam", 1979, "Goalkeeper");
		Player p2 = new Player("Kerim", 1996, "Defender");
		Player p3 = new Player("Adis", 1985, "Midfielder");
		Player p4 = new Player("Ruud van Nistelrooy", 1976, "Striker");
		Player p5 = new Player("Ronaldo", 1976, "Striker");
		Player p6 = new Player("Gordan", 1979, "Midfielder");
		Player p7 = new Player("Ajdin", 1992, "Midfielder");
		Player p8 = new Player("Nidal", 1991, "Midfielder");
		Player p9 = new Player("Hajrudin", 1987, "Midfielder");
		Player p10 = new Player("Gordan", 1991, "Midfielder");
		Player p11 = new Player("Zeljko", 1988, "Midfielder");
		// array of players
		Player[] team = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11};
		// declaration of team
		Team pandaBears = new Team("Panda BEARS", team);
		// calls out for methods and prints result
		System.out.println("Players in team: " + countPlayers(pandaBears, 1976) );
		System.out.println("How many many player are in the team? " + 
				countPlayers(pandaBears, "Goalkeeper"));
		System.out.println("Youngest player:\n" + getYoungestPlayer(pandaBears));
		
	}
	/**
	 * Count players in team born of specific year
	 * @param t - team
	 * @param year - birth year
	 * @return - number of players born on that year
	 */
	public static int countPlayers(Team t, int year){
		
		int counter = 0;
		// for loop within range of players 
		for(int i = 0; i < t.player.length; i++){
			//if players birth year is equal to specific year counter++
			if(t.player[i].yearOfBirth == year){
				counter++;
			}
		}
		return counter;
	}
	/**
	 * Count players on specific position in team
	 * @param t - team
	 * @param position - position in team
	 * @return - number of players on that position
	 */
	public static int countPlayers(Team t, String position){
		
		int counter = 0;
		// for loop within range of players 
		for(int i = 0; i < t.player.length; i++){
			// if player is on that position counter++
			if(t.player[i].position == position){
				counter++;
			}
		}
		return counter;
	}
	/**
	 * Calculates youngest player
	 * 
	 * @param t - team
	 * @return - the player who is youngest in team
	 */
	public static Player getYoungestPlayer(Team t){
		
		// record youngest player in this var
		int getYoungest = 0;
		// for loop within range of players 
		for(int i = 0; i < t.player.length; i++){
			// if already recorded player isn't youngest overwrite it
			if(getYoungest < t.player[i].yearOfBirth){
				getYoungest = t.player[i].yearOfBirth;
			}
		}
		// for loop within range of players 
		for(int i = 0; i < t.player.length; i++){
			// if already recorded player is youngest return that player
			if(t.player[i].yearOfBirth == getYoungest){
				return t.player[i];
			}
		} 
		return null;
	}
}
