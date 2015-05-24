
public class HomeworkW01T01 {

	/*
	 * Napisati program koji sadrzi tri cijela broja a, b i c.
	 * Ispisati da li je moguce konstruisati trougao sa stranicama vrijednosti a, b i c.
	 */
	
	public static void main(String[] args) {
		
		/*
		String sideOne = args[0];
		int sideA = Integer.parseInt(sideOne);
		*/
		
		int sideA = 1; 
		int sideB = 1; 
		int sideC = 2; 
		
		
		// to calculate area of triangle we will use Herons formula
		
		int parimeter = sideA + sideB + sideC;
		double p = (double)parimeter/2; // this is half of parimeter
		
		double area = Math.sqrt(p*(p - sideA)*(p - sideB)*(p - sideC));
		
		// if input values cannot form a triangle result will be zero
		
		if (area > 0){
			System.out.printf("Area of triangle is: %.3f", area);
		} else System.out.println("Values cannot form a triangle, please insert new values.");
		
	}

}
