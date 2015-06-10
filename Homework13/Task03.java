import java.util.InputMismatchException;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		try {
			// if empty throw exception
			if (args.length == 0) {
				throw new NullPointerException();
			// if there is more strings than one
			} else if (args.length > 1) {
				throw new ArrayIndexOutOfBoundsException();
			// if there is only one string it check for numbers 
			} else if (args.length == 1) {
				System.out.println("The string that you have inserted has: "
						+ getCountOfNumbers(args[0]) + " numbers.");
			}
			// catches exceptions 
		} catch (NullPointerException e) {
			System.out.println("Please inset one string");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You've inserted too many strings, please insert only one");
		}
	}
	
	/**
	 * Counts all numbers inside of string
	 * 
	 * @param s - string line
	 * @return - counter for numbers
	 */
	public static int getCountOfNumbers(String s) {

		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 47 && s.charAt(i) < 58)
				counter++;
		}
		return counter;
	}
}
