
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Asking user to enter one binary number and length of desired number
		System.out.print("Enter one binary number: ");
		String bin = input.nextLine();
		System.out.print("Enter desired length in bits: ");
		int n = input.nextInt();
		String firstComplement = "", secondComplement = "";

		// Checking if entered number is longer then is should be
		int originalNumberSize = bin.length();
		if (originalNumberSize > n) {
			System.out.println("The number you entered is longer then specificied length.");
			System.exit(0);
			
			// Checking if entered number is shorter that it should be, if it is I am adding zeros at the beginning
		} else if (originalNumberSize < n) {
			for (int i = originalNumberSize; i < n; i++) {
				bin = '0' + bin;
			}
		}

		// Checking if entered number is positive, if it is there is no need for calculating 2'nd complement
		if (bin.charAt(0) == '0') {
			System.out.println("There is no need to calculating 2'nd complement for entered number, because it is positive.");
		} else {
		
		// Finding 1st complement of entered binary number
			if (bin.charAt(0) == '1') {
				for (int i = 0; i < n; i++) {
					char bit = bin.charAt(i);
					if (bit == '1') {
						bit = '0';
					} else {
						bit = '1';
					}
					firstComplement += bit;
				}
			}

			System.out.println("Original number is: " + bin);
			System.out.println("1'st complement is: " + firstComplement);

		// Since 2'nd complement is 1'st complement + 1
		// And it has to be done from right to left
		// Here I am adding 1 to 1'st complement, but result is going to be
		// written from right to left
		// That is why i have to rotate my result
		
			String secondComplementReverse = "";

		// Setting remember to 1, because that 1 will be our addition to
		// 1'st
		// complement
			
			int remember = 1;

			for (int i = n - 1; i >= 0; i--) {
				char bit = firstComplement.charAt(i);
				if (bit == '0' && remember == 0) {
					secondComplementReverse += '0';
					remember = 0;
				} else if (bit == '0' && remember == 1) {
					secondComplementReverse += '1';
					remember = 0;
				} else if (bit == '1' && remember == 0) {
					secondComplementReverse += '1';
					remember = 0;
				} else if (bit == '1' && remember == 1) {
					secondComplementReverse += '0';
					remember = 1;
				}
			}

		// Rotating calculated result to get proper 2'nd complement
			for (int i = n - 1; i >= 0; i--) {
				char bit = secondComplementReverse.charAt(i);
				secondComplement += bit;
			}

			System.out.println("2'nd complement is: " + secondComplement);
		}
	}
}