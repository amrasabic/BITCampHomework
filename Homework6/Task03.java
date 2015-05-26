import java.util.Scanner;


public class Task03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert number: ");
		
		int num = in.nextInt();
		int sum = 0;
		
		for (int i = num; i >= 1; i = num) {
			sum += (i % 10);
			num /= 10;
		}
		
		System.out.println(sum);
		
		in.close();
	}

}

