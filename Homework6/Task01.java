import java.util.Scanner;


public class Task01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
			
		// input
		
		System.out.print("Input side one: ");
		int a = in.nextInt();
		System.out.print("Input side one: ");
		int b = in.nextInt();

		for (int i = 1; i <= a; i++) {
			
			for (int j = 1; j <= b; j++) {
				
				// print values for different output
				
				if ((i == 1 || i == a) && (j == 1 || j == b)) {
					System.out.print("+");
				}
				else if (j == 1 || j == b){
					System.out.print("|");
				}
				else if (i == 1 || i == a) {
					System.out.print("-");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
		in.close();
	}

}
