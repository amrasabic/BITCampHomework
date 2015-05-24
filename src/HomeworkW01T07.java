
public class HomeworkW01T07 {

	/*
	 * Dizajnirati program koji sadryi jednu cetverocifrenu varijablu int tipa. 
	 * Ispisati na konzolu sumu njezinih cifara, 
	 * npr. ukoliko je varijabla 1815 onda je rezultat 1+8+1+5=15.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int num = 1815;
		
		int thousandth = num / 1000;
		int hundredth = (num % 1000) / 100;
		int tenth = (num % 100) / 10;
		int residual = num % 10;
		
		int sum = thousandth + hundredth + tenth + residual;
		
		System.out.printf("The sum of digits of your number is: %d.", sum);

	}

}
