import java.util.Scanner;


public class Task05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Insert number: ");
			long n = in.nextLong();
			long num = n;
			long numRev = 0;
			
			while (num != 0) {
	            long digits = num % 10;
	            if (digits != 0) {
	            	numRev = numRev * 10 + digits;
	            }            
	          num /= 10;
	        }
			
			long newNum = numRev, newNum2 = 0;
			
			while (newNum != 0) {
	            long digits = newNum % 10;
	            if (digits != 0) {
	            	newNum2 = newNum2 * 10 + digits;
	            }            
	            newNum /= 10;
	        }
			
			System.out.println(newNum2);
			in.close();

	}

}
