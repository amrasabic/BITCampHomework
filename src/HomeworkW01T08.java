
public class HomeworkW01T08 {

	/*
	 * Dizajnirati program koji za date koordinate x, y i z tacke A 
	 * u 3D prostoru odreduje koliko je tacka daleko od koordinatnog pocetka (0,0,0).
	 * 
	 */
	
	public static void main(String[] args) {
		
		int coordinateX = 3;
		int coordinateY = 4;
		int coordinateZ = 6;
		
		double distance = Math.sqrt(coordinateX*coordinateX + coordinateY*coordinateY 
				+ coordinateZ*coordinateZ);
		
		System.out.printf("Distance of this coordinate from (0,0,0) is: %.3f.", distance);
		
	}

}
