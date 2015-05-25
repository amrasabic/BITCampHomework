
public class Task01 {

	/*
	 * Vas program sadrzi broj n. 
	 * Napisati takav code da odredi koliko se n moe puta podijeliti prije 
	 * nego sto postane nula i ispisati rezultat na konzolu.
	 */
	
	public static void main(String[] args) {
	
		int num = 100;
		int counter = 0;

		while ((num / 2) > 0) {
			counter++;
			num /= 2;
		}

		System.out.print("Result is: " + counter);

	}

}
