import java.util.InputMismatchException;
import java.util.Scanner;


public class Task01 {

		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			
			while (true) {
				try {
					System.out.print("Insert celsiuses that you want to convert to kelvins: ");
					double cel = in.nextDouble();
					System.out.println(celsiusToKelvin(cel));
					break;
				} catch (InputMismatchException e) {
					System.out.println("Wrong input, please try again");
					in.nextLine();
				}
			}
			in.close();
		}

		/**
		 * This method converts Celsius to Kelvin.
		 * 
		 * @param - celsius
		 * @return - kelvin
		 */
		public static double celsiusToKelvin(double celsius) {
			// just add 274.15 to convert 
			double kelvin = celsius * 274.15;
			return kelvin;
		}

}
