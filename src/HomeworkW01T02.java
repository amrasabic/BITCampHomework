
public class HomeworkW01T02 {

	/*
	 * Napisati program koji sadrzi varijablu a. 
	 * Ispisati da li se varijabla a nalazi izmedu 5 i 7.5,
	 * izmedu 7.5 i 10 ili je van opsega.
	 * 
	 */
	
	public static void main(String[] args) {
		
		double num = 5;
		
		if (num >= 5 && num < 7.5){
			System.out.println("Number is between 5 and 7.5.");
		} else if (num >= 7.5 && num <= 10){
			System.out.println("Number is betwen 7.5 and 10.");
		} else 
			System.out.println("Number is out of range.");

	}

}
