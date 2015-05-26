import java.util.Scanner;


public class Task10 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		
		System.out.print("Insert number one: ");
		int a = input.nextInt();
		System.out.print("Insert number two: ");
		int b = input.nextInt();
		
		int min = 0;
		if (a < b) {
			min = a;
			} else if (b < a) {
				min = b;
			} else {
				min = a;
		}

		for (int i = min; i >= 1; i--) {
			if(a % i == 0 && b % i == 0){
				System.out.print("The greatest common divisor is: " + i);
				break;
			}
		}
		
	input.close();
	}

}
