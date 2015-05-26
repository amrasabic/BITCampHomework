import java.util.Scanner;


public class Task09 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Size of a triangle side? ");
		int a = in.nextInt();

		for (int i = 0; i <= a; i++) {
			
			for (int j = 0; j < i; j++) { // konsultacije s Ajlom oko ovog j < i
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		in.close();
	}

}
