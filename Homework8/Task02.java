
public class Task02 {

	public static void main(String[] args) {
		
		// input
		String  brackets = ("{{{}");
		// length
		int b = brackets.length();
		
		// counters
		int counterFirstBracket = 0;
		int counterSecondBracket = 0;
		
		// counting and adding to counter every bracket
		for (int i = 0; i < b; i++){
			char c = brackets.charAt(i);
			char first = '{';
			char second = '}';
			
			if (c == first){
				counterFirstBracket++;
			} 
			else if (c == second){
				counterSecondBracket++;
			}
		
		}
		
		// if there is same number of both print all closed, 
		// else there are brackets that aren't closed
		
		if (counterFirstBracket != counterSecondBracket){
			System.out.println("Bracket is not closed.");
		} else {
			System.out.println("All closed.");
		}
	}

}
