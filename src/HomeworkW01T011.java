
public class HomeworkW01T011 {

	/*
	 * Implementirati kod koji odreduje u koliko sati i minuta avion slijece na aerodrom 
	 * ukoliko vam je poznato u koliko sati i minuta avion uzlijece i 
	 * koliko minuta bude u letu. Avion uzlijece i slijece u istoj vremenskoj zoni.
	 * 
	 */
	
	public static void main(String[] args) {

		// insert departing hour and minutes
		
		int departingHour = 2;
		int departingMin = 43;
		
		// insert hour and minutes on flight
		
		int flightHour = 3;
		int flightMin = 19;
		
		// calculate flight time
		
		int flightTme = flightHour*60 + flightMin;
		
		int landMin = departingMin + flightTme;
		int landHour = departingHour + landMin / 60;
		
		// % - Divides left hand operand by right hand operand and returns remainder
		
		landMin = landMin % 60;
		
		System.out.printf("Plane arrives at %02d:%02dh.", landHour, landMin);			

		
	}

}
