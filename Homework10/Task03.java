import java.util.Scanner;


public class Task03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int[] array1 = new int[5];
		int[] array2 = new int[5];

		// elements of first
		for (int i = 0; i < 5; i++) {
			System.out.printf("Insert %d. element of first array: ", i+1);
			System.out.println();
			array1[i] = in.nextInt();
		}
		// elements of second array
		for (int i = 0; i < 5; i++) {
			System.out.printf("Insert %d. element of second array: ", i+1);
			System.out.println();
			array2[i] = in.nextInt();
		}
		
		
		int counter = 0;
		// check if all elements are in both arrays
		for (int i = 0; i < 5; i++){
			
			for(int j = 0; j < 5; j++){
				if (array1[i] == array2[j]){
					counter++;
				}
			}
		}
		
		if (counter == 5){
			System.out.println("Identical.");
		}else {
			System.out.println("Not!");
		}
		
		in.close();
	}

}
