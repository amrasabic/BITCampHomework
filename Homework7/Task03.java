
public class Task03 {

	public static void main(String[] args){
	TextIO.writeFile("src/input.in");
		
	int n = 0;
	int minNum = 0;
	int insertNum = 0;
	
	// How many numbers do you wanna enter?
	System.out.println("How many numbers do you wanna enter?");
	n = TextIO.getInt();
	
	// first number declares how many numbers comes after
	TextIO.putln(n);
	System.out.print("Insert number: ");
	insertNum = TextIO.getInt();
	TextIO.putln(insertNum);
	minNum = insertNum;
		
	// min number excluding first one
	
		for(int i = 1; i < n; i++){
			System.out.println("Insert number: ");
			insertNum = TextIO.getInt();
			TextIO.putln(insertNum);
			
			if(insertNum < minNum){
				minNum = insertNum;
			}
		}
		
		System.out.printf("Minimum number inserted is %d. ", minNum);

	}

}
