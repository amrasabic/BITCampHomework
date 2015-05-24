
public class HomeworkT1 {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		
		// Milliseconds to hours, then to 24 hours and +2 for our time zone
		
		long hours = time / 3600000;
		
		long hoursCEST = (hours % 24) + 2;

	
		if (hoursCEST >= 6 && hoursCEST <= 10) {
			System.out.println("Morning.");
			
		} else if (hoursCEST > 10 && hoursCEST <= 18) {
			System.out.println("Day.");
			
		} else if (hoursCEST > 18 && hoursCEST <= 22) {
			System.out.println("Evening.");
			
		} else {
			System.out.println("Night.");
		}
	
	}

}
