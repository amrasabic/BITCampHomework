
public class HomeworkW01T04 {

	/*
	 * Napraviti program koji za dati datum odredi horoskopski znak koji pripada tom datumu.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int day = 20;
		int month = 9;
		
		// March 21 - April 19 is Aries
		
		if (day >= 21 && month == 3){
			System.out.println("Your zodiac sign is Aries.");
		} else if (day <= 19 && month == 4){
			System.out.println("Your zodiac sign is Aries.");
		}
		
		// April 20 - May 20 is Taurus
		
		if (day >= 20 && month == 4){
			System.out.println("Your zodiac sign is Taurus.");
		} else if (day <= 20 && month == 5){
			System.out.println("Your zodiac sign is Taurus.");
		}
		
		// May 21 - June 20 is Gemini 
		
		if (day >= 21 && month == 5){
			System.out.println("Your zodiac sign is Gemini.");
		} else if (day <= 20 && month == 6){
			System.out.println("Your zodiac sign is Gemini.");
		}
		
		// June 21 - July 22 is Cancer
		
		if (day >= 21 && month == 6){
			System.out.println("Your zodiac sign is Cancer.");
		} else if (day <= 22 && month == 7){
			System.out.println("Your zodiac sign is Cancer.");
		}
		
		// July 23 - August 22 is Leo
		
		if (day >= 23 && month == 7){
			System.out.println("Your zodiac sign is Leo.");
		} else if (day <= 22 && month == 8){
			System.out.println("Your zodiac sign is Leo.");
		}
				
		// August 23 - September 22 is Virgo
		
		if (day >= 23 && month == 8){
			System.out.println("Your zodiac sign is Virgo.");
		} else if (day <= 22 && month == 9){
			System.out.println("Your zodiac sign is Virgo.");
		}
		
		// September 23 - October 22 is Libra
		
		if (day >= 23 && month == 9){
			System.out.println("Your zodiac sign is Libra.");
		} else if (day <= 22 && month == 10){
			System.out.println("Your zodiac sign is Libra.");
		}		
		
		// October 23 - November 21 is Scorpio
		
		if (day >= 23 && month == 10){
			System.out.println("Your zodiac sign is Scorpio.");
		} else if (day <= 21 && month == 11){
			System.out.println("Your zodiac sign is Scorpio.");
		}		
		
		// November 22 -  December 21 is Sagittarius
		
		if (day >= 22 && month == 11){
			System.out.println("Your zodiac sign is Sagittarius.");
		} else if (day <= 21 && month == 12){
			System.out.println("Your zodiac sign is Sagittarius.");
		}		
		
		// December 22 - January 19 is Capricorn
		
		if (day >= 22 && month == 12){
			System.out.println("Your zodiac sign is Capricorn.");
		} else if (day <= 19 && month == 1){
			System.out.println("Your zodiac sign is Capricorn.");
		}		
		
		// January 20 - February 18 is Aquarius
		
		if (day >= 20 && month == 1){
			System.out.println("Your zodiac sign is Aquarius.");
		} else if (day <= 18 && month == 2){
			System.out.println("Your zodiac sign is Aquarius.");
		}		
		
		// February 19 - March 20 is Pisces
		
		if (day >= 19 && month == 2){
			System.out.println("Your zodiac sign is Pisces.");
		} else if (day <= 20 && month == 3){
			System.out.println("Your zodiac sign is Pisces.");
		}		
		
	}
}
