
public class Task04 {

	public static void main(String[] args) {
		TextIO.writeFile("src/input4.in");
		
		int n = 0;
		int insertNum = 0;
		int lookingForThisNum = 0;
		boolean var = false;
		
		// how many and which one
		System.out.print("How many numbers do you wanna enter? ");
		n = TextIO.getInt();
		System.out.print("Which number are you looking for? ");
		lookingForThisNum = TextIO.getInt();
		
		// insert numbers
		for(int i = 0; i < n; i++){
			System.out.print("Insert number: ");
			insertNum = TextIO.getInt();
			TextIO.putln(insertNum);
				
		// if any of inserted number is equal to the number you are looking for
				if(insertNum==lookingForThisNum)
						var = true;
				}
		
		// if value is true and false prints
		if(var == true) {
			System.out.println("It does exists in set of numbers you entered.");
		} else {
			System.out.println("You are looking for number you didn't enter?"
					+ " Srsly? Get a life!");
		}
	}

}
