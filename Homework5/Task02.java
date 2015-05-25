
public class Task02 {

	/*
	 * Vas program sadryi broj n. 
	 * Napisati program koji pronalazi sumu svih parnih brojeva od 1 do n, 
	 * iskljucujuci broj n.
	 */
	
	public static void main(String[] args) {
		
		int num = 23;
		int sum = 0;
		int counter = 0;

		while (counter < num) {
			if (counter % 2 == 0) {
				sum += counter;
			}
			counter += 2;
		}	
		

		System.out.print("Sum of even numbers from 1 to " + num + " is: " + sum);
		
	}

}
