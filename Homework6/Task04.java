import java.util.Scanner;


public class Task04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Insert number: ");
		int a = in.nextInt();
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			
			if (a % i == 0) {
				sum += i;
			}
		}

		System.out.print("Sum of dividers of entered number is: " + sum);

	in.close();
	}

}
