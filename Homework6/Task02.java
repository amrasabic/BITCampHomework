import java.util.Scanner;


public class Task02 {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in); 
			
		System.out.println("Which number from Fibonacci "
				+ "array you wanna know?");
		int n = in.nextInt();
			
		// Limits: 1 < n < 50
		if (n > 50 || n <= 1){
			System.out.println("Please insert value between "
					+ "2 and 50, both included.");
		} else if (n == 2){
			System.out.println("Drugi clan Fib niza je " + 1);
		}
		
		// Calculating Fibonacci array 
		else {
			long fib1 = 1, fib2 = 1, fib3 = 0;
			int counter = 2;
			do {
				fib3 = fib1 + fib2;
				fib1 = fib2;
				fib2 = fib3;
				counter++;
			} while (counter != n);
				
			System.out.println(n + "ti clan Fib niza je " + fib3);
		}
		
	in.close();
	}

}
