
public class HomeworkW01T09 {

	/*
	 * Dizajnirati program koji za dati trocifreni broj odredi 
	 * da li je taj broj djeljiv sa zbirom svojih cifara.
	 * 
	 * 
	 * KOMENTAR: ne razumijem
	 */
	
	public static void main(String[] args) {
		
		int threeDigitNum = 999;
		
		int hundredth = threeDigitNum / 100;
		int tenth = (threeDigitNum / 100) / 10;
		int residual = threeDigitNum / 10;
		
		int sumOfDigits = hundredth + tenth + residual;
		
		System.out.println(sumOfDigits);
		
		if ( threeDigitNum % sumOfDigits == 0  ){
			System.out.println("Number can be divided by the sum of its digits.");
		} else {
			System.out.println("Number cannot be divided by the sum of its digits.");			
		}
	}

}
