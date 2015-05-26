import java.util.Scanner;


public class Task07 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		System.out.print("Insert number: ");
		long n = in.nextLong();

		for (int i = 1; i <= n; i++) {
			
			int sum = 0;
			
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			
			if (i == sum) {
				System.out.println("It's magic. " + i);
			} 
		}
		
		in.close();
	}

}
