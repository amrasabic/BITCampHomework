import java.util.Scanner;


public class Task06 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Insert number : ");
		long n = in.nextLong();
		System.out.println("Pick one digit.");
		int digit = in.nextInt();
			
		long num = n;
		long rev = 0;
		int counter = 1;
		
		while (num != 0) {
			
			long remainder = num % 10;
			rev = rev * 10 + remainder;
			
				if (counter == digit) {
					System.out.println("Digit is: " + remainder);
				}

				counter++;
				num /= 10;
			}
			
	in.close();
	}

}
