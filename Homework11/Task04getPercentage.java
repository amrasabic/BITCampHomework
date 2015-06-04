import java.util.Scanner;


public class Task04getPercentage {

	public static void main(String[] args) {
		
		//insert first
		Scanner in = new Scanner(System.in);
		System.out.print("Insert first number: ");
		int num1 = in.nextInt();
		// insert second
		System.out.print("Insert second number: ");
		int num2 = in.nextInt();
		
		// print percentage
		System.out.print("Percentage" + getPercentage(num1,num2));
	}
	
	public static double getPercentage(int n, int m) {
		
		// cast second to double
		double M = (int) m;
		// and cast againg cause it works
		double percentage = (double) ((n * 100) / M);
		//return result
		return percentage;
		
	}
	
}
