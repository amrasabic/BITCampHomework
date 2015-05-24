
public class HomeworkW01T03 {

	/*
	 *  Napisati program koji sadrži sest varijabli koje predstavljaju dva datuma.
	 *  Ispisati na konzolu datum koji od ta dva datuma dodje prije drugoga.
	 * 
	 *  NAPOMENA: ispis prvog i drugog datuma dodan zbog laske provjere tacnosti programa.
	 */
	
	public static void main(String[] args) {
		
		byte day1 = 31;
		byte month1 = 12;
		short year1 = 2100;
		
			System.out.printf("First date you entered is: %d.%d.%d.\n", day1, month1, year1);
		
		byte day2 = 1;
		byte month2 = 12;
		short year2 = 1900;
		
			System.out.printf("Second date you entered is: %d.%d.%d.\n\n", day2, month2, year2);
		
		/* 
		 * in this if loop we examine:
		 *  - which year comes first, if they are the same check months
		 *  - which month comes first, if they are the same check days
		 *  - and if days are the same print it out
		*/
		
		if (year1 < year2){
			System.out.println("First date you entered comes first.");
		} else if (year1 > year2){
			System.out.println("Second date you entered comes first.");
		} else if (month1 < month2){
			System.out.println("First date you entered comes first.");
		} else if (month1 > month2){
			System.out.println("Second date you entered comes first.");
		} else if (day1 < day2){
			System.out.println("First date you entered comes first.");
		} else if (day1 > day2){
			System.out.println("Second date you entered comes first.");
		} else if (day1 == day2){
			System.out.println("They are the same!");
		}
	}

}
