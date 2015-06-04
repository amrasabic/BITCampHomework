import java.util.Scanner;


public class Task05getNumOnly {

	public static void main(String[] args) {

		//insert string
		Scanner in = new Scanner(System.in);
		System.out.print("Insert random string: ");
		String str = in.nextLine();
		// give back numbers
		System.out.println("Numbers are: " + getNumbersOnly(str));
	}

	public static String getNumbersOnly (String s){
		// new string just for numbers
		String numbersOnly = "";
		//learn how to use trim!
		s = s.trim();
		
		for(int i=0; i < s.length()-1; i++) {
			// cast to int
			if((int)s.charAt(i) > 47 && (int)s.charAt(i) < 58)
				numbersOnly += s.charAt(i);
			}
		return numbersOnly;
	}
}
