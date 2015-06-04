import java.util.Scanner;


public class Task02GetGrade {

	public static void main(String[] args) {
		
		//Insert number of credits you earned
		Scanner in = new Scanner(System.in);
		System.out.print("Insert number of credits you earned: ");
		int credits = in.nextInt();
		
		// print grade you earned 
		System.out.println(getGrade(credits));	
	}

	public static char getGrade(int score){
		
		// if its on lower limit, you shall not pass
		if (score == 54){
			return 'F';
		}
		
		// now if you earned a bit more, well you should pass
		score = (score - 4) / 10;
		
		// calculating your grade and returning it to main
		switch (score){
		case 9: 
			return 'A';
		case 8: 
			return 'B';
		case 7: 
			return 'C';
		case 6: 
			return 'D';
		case 5: 
			return 'E';
		default: 
			return 'F';
		}	
	
	}
}
