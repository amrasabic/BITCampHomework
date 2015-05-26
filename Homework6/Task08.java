import java.util.Scanner;


public class Task08 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insert number: ");
		int n = in.nextInt();	
		
		
		for (int i = 1; i < n; i++) {
			
			int sum = 0;
			int num = i;
			
			for (int j = i; j >= 1; j = num) {
				sum += (j % 10);
				num /= 10;
			}
			
			if (i % sum == 0){
				System.out.println(i);
			}
		}
		
	in.close();
	}

}
