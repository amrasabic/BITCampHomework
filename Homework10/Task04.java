import java.util.Arrays;
import java.util.Scanner;


public class Task04 {
	
	public static void main (String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Insert 10 letters. Eg Dandelions: ");
	String chars = input.nextLine();
	
	char[] array = new char[10];
	int counter = 0;
	int index = 0;

	for(int i = 0; i < 10; i++) {
		array[i] = chars.charAt(i);
	}
	
	System.out.print("Insert number of times you want to shift array? ");
	int n = input.nextInt();
	
	for(int i = 0; i < 10; i++) {
		index = counter + n;
		counter++;
		
		if(index > 9) {
			array[index - 10] = chars.charAt(i);
		} else if (index < 0) {
			array[index + 10] = chars.charAt(i);
		} else
			array[index] = chars.charAt(i);
	}
	
	System.out.println(Arrays.toString(array));
	
	}
}
