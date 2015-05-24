
public class HomeworkW01T06 {

	/*
	 * Napraviti program koji sadryi dvije varijable koje predstavljaju
	 * vrijeme u formatu 24:00h (military time). Ispisati na ekran u formatu AM/PM.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int minuteMT = 35;
		int hourMT = 4;
		
		if (hourMT > 12){
			hourMT -= 12;
			System.out.printf("%d:%d PM", hourMT, minuteMT);
		} else if (hourMT == 12 || hourMT == 0){
			if (hourMT == 0){
				hourMT += 12;
				System.out.printf("%d:%d AM", hourMT, minuteMT);							
			} else {
				System.out.printf("%d:%d PM", hourMT, minuteMT);							
			}
		} else {
			System.out.printf("%d:%d AM", hourMT, minuteMT);			
		}

	}

}
