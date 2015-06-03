import java.util.Scanner;


public abstract class Task02 {

	public static void main(String[] args) {
		
		// define two arrays
		Scanner in = new Scanner(System.in);
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		// elements of first
		for (int i = 0; i < 5; i++) {
			System.out.printf("Insert %d. element of first array: ", i+1);
			System.out.println();
			array1[i] = in.nextInt();
		}
		System.out.println();
		// elements of second
		for (int i = 0; i < 5; i++) {
			System.out.printf("Insert %d. element of second array: ", i+1);
			System.out.println();
			array2[i] = in.nextInt();
		}
		// counter 0-5, cause of 5 elements
		int counter = 0;
		
		// are the same elements on the same position
		for (int i = 0; i < 5; i++){
			
			for(int j = 0; j < 5; j++){
				if (array1[i] == array2[j]){
					counter++;
				}
			}
		}
		
		if (counter == 5){
			System.out.print("Identical arrays.");
		}else {
			System.out.print("Not identical!");
		}
		
		in.close();
	}

}
