import java.util.Scanner;


public class Task03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// insert two strings
		System.out.println("Insert first string: ");
		String str1 = in.nextLine();
		System.out.println("Insert second string: ");
		String str2 = in.nextLine();
		// use method below to combine strings
		// take 1 char of first, then 1 char from second until u reach the end
		combineTwoStrings(str1, str2);
		System.out.println("Second string by alfabet is: " + getSecond(str1, str2));
		
		System.out.println("It has same letters. Statement is: " + doTheyContainSameLetters(str1, str2));
		in.close();
	}
	// first part
	public static void combineTwoStrings (String str1, String str2){
		// lengths
		int l1 = str1.length();
		int l2 = str2.length();
		int l3 = l1 + l2;
		int smaller;
		// count for elements he wrote while there are smaller num of chars
		int counter = 0;
		String combineTwo = "";
		//define which one is smaller
		if (l1 < l2){
			smaller = l1;
		} else {
			smaller = l2;
		}
		// take smaller one, and combine until u reach your goal		
		for (int i = 0; i < smaller; i++ ){
			combineTwo += str1.charAt(i);
			combineTwo += str2.charAt(i);
			counter++;
		}
		// then depending which one is smaller add the rest of string
		if (l1 > l2){
			for(int i = counter; i < l3 - counter; i++){
				combineTwo += str1.charAt(i);
			}
		} else {
			for(int i = counter; i < l3 - counter; i++){
			combineTwo += str2.charAt(i);
			}
		} 
		System.out.println(combineTwo);
	}
	// second part
	public static boolean doTheyContainSameLetters (String str1, String str2){
		
		int counter = 0;

		for (int i = 0; i < str1.length(); i++) {	
			for (int j = 0; j < str2.length(); j++) {	
				if (str1.charAt(i) == str2.charAt(j)) {
					counter++;
					break;
				}
			}
		}
		
		if (counter == str1.length()){
			return true;
		} else {
			return false;
		}
	}
	// third part	
	public static String getSecond (String str1, String str2){
		
		int first = str1.compareTo(str2);
			
		// first larger then second - negative
		// second larger then first - positive
		if (first > 0){
			return str1;
		} else if (first < 0){
			return str2;
		} else {
			return null;
		}
	}
	// fourth part
	
	
	
}
