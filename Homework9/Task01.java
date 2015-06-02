import java.util.InputMismatchException;
import java.util.Scanner;


public class Task01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		try {
			System.out.print("Input number of day: ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("Work day!");
					break;
			case 6:
			case 7: System.out.println("Weekend.");
			} } catch (InputMismatchException e) {
				System.out.println("Input should be a number.");
			}
		}
	}