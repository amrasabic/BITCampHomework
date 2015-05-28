
public class Task05 {

	public static void main(String[] args) {

		// loads decimal number from file
		
		TextIO.readFile("src/decimal.in");
			
		int decimal = 0;
		decimal = TextIO.getInt();
		
		// toBinaryString and save to file
		
		String binary = Integer.toBinaryString(decimal);
		
		TextIO.writeFile("src/binary.out");
		TextIO.put(binary);
	}

}
