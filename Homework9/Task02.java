import java.util.InputMismatchException;
import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int factorial = 1;
		int i = 1;
		
		try {
		System.out.print("Insert name of the file: ");
		String name = input.nextLine();
		
		TextIO.readFile("src/" + name + ".txt");
		} catch(IllegalArgumentException e) {
			System.out.println("There is no such text file, please try again.");
		}
		
		try {
		int a = TextIO.getInt();
		TextIO.writeStandardOutput();
		
			if( a == 0) {
				System.out.println("Zero (0) cannot be converted to factorial");
				System.exit(0);
			} else {

				while(i <= a && a > 0) {
					factorial *= i;
					i++;
				}
				System.out.println(factorial);
			} 
		} catch (IllegalArgumentException e) {
			System.out.println("There is no number at start of file that can be converted to factorial");
			} 
		
	}
}