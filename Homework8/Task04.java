
public class Task04 {

	public static void main(String[] args) {
	
		// read file line by line
		TextIO.readFile("src/encodedFile.in");
		int n = TextIO.getlnInt();
		
		
		for(int i = 1; i <= n; i++){
			String pasus = TextIO.getln();
			int l = pasus.length();
		
		// convert to int and -1, then convert back
			
			for (int j = 0;j<l;j++){
				char c = pasus.charAt(j);
				int broj = c-1;
				c = (char)broj;
				System.out.print(c);
			}
			System.out.println();
		}
			

	}

}		

