
public class HomeworkW01T05 {
	
	/*
	 * Napraviti program koji sadrzi cetiri varijable. 
	 * Ispisati na konzolu varijable tako da su sortirane od najmanje ka najvecoj.
	 * 
	 */

	public static void main(String[] args) {
		
		int a = 0;
		int b = 8;
		int c = 0;
		int d = 1;
		
		// nakon konsultacija s kolegom Nidalom pocinjem ponovo zadatak
		
		// First we'll define variables that will be used to sort numbers
		
		int min1;
		int max1;
		int min2;
		int max2;
		int min;
		int num1;
		int max;
		int num2;
		
		// first step is to determine is if a is lower or higher then b
		
		if (a < b) {
			min1 = a;
			max1 = b;
		} else {
			min1 = b;
			max1 = a;
		}
		
		// second  step is to determine is if c is lower or higher then d
		
		if (c < d) {
			min2 = c;
			max2 = d;
		} else {
			min2 = d;
			max2 = c;
		}
		
		// third step is to determine is same for new variables min1 and min2
		
		if (min1 < min2) {
			min = min1;
			num1 = min2;      
		} else {
			min = min2;
			num1 = min1;
		}
		
		// fourth step is to determine is same for new variables max1 and max2
		
		if (max1 > max2) {
			max = max1;
			num2 = max2;
		} else {
			max = max2;
			num2 = max1;
		}

		// fifth step is to determine is same for new variables num1 and num2 and print 
		
		if (num1 < num2) {
			System.out.printf("Sequence from lowest to highest is: %d < %d < %d < %d.",
					min, num1, num2, max);
		} else {
			System.out.printf("Sequence from lowest to highest is: %d < %d < %d < %d.",
					min, num2, num1, max);
		}
			
	}

}

