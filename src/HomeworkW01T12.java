
public class HomeworkW01T12 {

	/*
	 * Implementirati kod koji odreduje da li je lopta sa datim poluprecnikom 
	 * „dobre kvalitete“. U ovom slucaju „dobra kvaliteta“ znaci da lopta 
	 * ima volumen od 6.014 sa odstupanjem od ±0.05%.
	 * 
	 */
	
	public static void main(String[] args) {
	
		double radius = 1.234;
		
		double volume = (4 * Math.PI * radius * radius * radius)/3;
		
		// System.out.println(volume);
		
		double volumeDefault = 6.014;
		
		double volumeUpperLimit = volumeDefault + (volumeDefault * 0.05) / 100;
		double volumeLowerLimit = volumeDefault - (volumeDefault * 0.05) / 100;
		
		if (volume >= volumeLowerLimit && volume <= volumeUpperLimit ) {
			System.out.printf("Good quality.");	
		} else {
			System.out.println("Bad quality.");	
		}
		
	}

}
