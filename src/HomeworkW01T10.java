
public class HomeworkW01T10 {

	/*
	 * Implementirati kod koji odreduje da li je dati broj jedan od rjesenja 
	 * date kubne jednacine oblika ax^3 + bx^2 + cx + d. Vas kod treba da ima 
	 * pet varijabli: vrijednosti a, b, c, i d, kao i dato (potencijalno) rjesenje.
	 */
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int c = 7;
		int d = 1;
		
		// potential solution
		
		int x = -1;
		
		int result = a*x*x*x + b*x*x + c*x + d;
		
		if (result == 0){
			System.out.printf("x = %d is potential solution of "
					+ "ax^3 + bx^2 + cx + d = 0 equation.", x);
		} else {
			System.out.printf("x = %d is not solution of "
					+ "ax^3 + bx^2 + cx + d = 0 equation.", x);			
		}	
		
	}

}
