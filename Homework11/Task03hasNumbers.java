import java.util.Scanner;


public class Task03hasNumbers {

	public static void main(String[] args) {
		
		// insert string with or without numbers
		Scanner input = new Scanner(System.in);
		System.out.print("Insert string: ");
		String example = input.nextLine();
		
		// let me tell you does it have numbers
		System.out.println("Has numbers. This statement is: " + hasNumbers(example));
	}

	public static boolean hasNumbers(String s) {
		
		// count numbers
		int counter = 0;
		// pull that string thought for loop
		// using chars so we are looking for ascii values
		for(int i=0; i < s.length() - 1; i++) {
			
			if(s.charAt(i) > 47 && s.charAt(i) < 58)
				counter++;
		}
		
		// if counter has moved form zero
		// guess what there a number in that string
		if (counter > 0){
			return true;
		} else {
			return false;
		}
		
	}
	
}