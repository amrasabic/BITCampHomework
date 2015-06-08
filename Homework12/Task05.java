import java.util.Arrays;
import java.util.Scanner;


public class Task05 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("Insert how much elementrs in array you want: ");
		int maxLength1 = input.nextInt();
		
		int [] numbers1 = new int [maxLength1];
				
		for (int i = 0; i < numbers1.length; i++){
			System.out.println("Insert value of element: ");
			numbers1[i] = input.nextInt();
		}
		
		System.out.print("Insert how much elementrs in second array you want: ");
		int maxLength2 = input.nextInt();
		
		int [] numbers2 = new int [maxLength2];
				
		for (int i = 0; i < numbers2.length; i++){
			System.out.println("Insert value of element: ");
			numbers2[i] = input.nextInt();
		}
		
		System.out.println("Are they the same? " + areTheyTheSame(numbers1, numbers2));
		System.out.println(addMembersOfTwoArrays(numbers1, numbers2));
		System.out.println(addArray1ToArray2(numbers1, numbers2));
		
		input.close();
	}
	// part one
	public static boolean areTheyTheSame (int [] array1, int [] array2){
		
		boolean identical = true;
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if (array1[i] != array2[i]) {
					identical = false;
				} 
			}
		}
		
		return identical;
	
	}
	// second part
	
	public static int[] addMembersOfTwoArrays (int[] arr1, int[] arr2) {		
		
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		int[] arrRes = null;
		
		if (l1 > l2) {
			arrRes = new int[l1];
			arr2 = Arrays.copyOf(arr2, l1); 
			
			for(int i = 0; i < l1; i++) {
				arrRes[i] = arr1[i] + arr2[i];
			}
			
		} else if(l1 < l2) {
			arrRes = new int[l2];
			arr1 = Arrays.copyOf(arr1, l2); 
			
			for(int i = 0; i < l2; i++) {
				arrRes[i] = arr1[i] + arr2[i];
			}
		} else {
			for(int i = 0; i < l1; i++) {
				arrRes = new int[l1];
				arrRes[i] = arr1[i] + arr2[i];
			}
		}
		return arrRes;
	}
	
	
	//third part
	public static String addArray1ToArray2 (int [] array1, int [] array2){
		// lengths
		int l1 = array1.length;
		int l2 = array2.length;
		int l3 = l1 + l2;
		// create third array
		int[] array3 = new int[l3];
		// add values form first to new array3
		for (int i = 0; i < l1; i++){
			array3[i] = array1[i];
		}
		// counter to add values from index 0 of array2 
		// and continue with array3 where u ended before
		int counter = 0;
			for (int i = l1; i < l3; i++){
				array3[i] = array2[counter];
				counter++;
			}
		return Arrays.toString(array3);
	}
}
