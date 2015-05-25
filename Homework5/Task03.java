
public class Task03 {

	/*
	 * Vaš program sadrzi broj n. Napisati program koji odreduje 
	 * da li je dati broj n savrsen ili ne. Savrsen (engl. perfect) je broj
	 * u kojega suma svih djelioca (iskljucujuci sebe) daje zapravo taj broj. 
	 * Npr. broj 28 je savrsen jer je suma svih njegovih djelioca 
	 * 1, 2, 4, 7 i 14 zapravo 28 (sam taj broj).
	 * 
	 */
	
	public static void main(String[] args) {
		
		int n = 28;
		int sum = 0;
		int counter = 1;

		while (counter <= n / 2) {
			if (n % counter == 0) {
				sum += counter;
				counter++;
			} else {
				counter++;
			}
		}

		if (n == sum) {
			System.out.println("Number is perfect!");
		} else {
			System.out.println("Number is not perfect.");
		}

	}

}
