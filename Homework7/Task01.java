
public class Task01 {

	public static void main(String[] args) {
		TextIO.readFile("src/input.in");
		
		// load two num for txt
		int a = TextIO.getlnInt();
		int b = TextIO.getlnInt();
		
		// print numbers between a and b
		for (int i = a + 1; i < b; i++){
			System.out.println(i);
		}
	}

}
