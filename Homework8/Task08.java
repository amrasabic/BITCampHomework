
public class Task08 {

	public static void main(String[] args) {
			
		String page = "www.nekastranica.com?name=Jon&surname=Stark";
			
		int l = page.length ();
		int counter = 0;
			
		String surname = "";
		String name = "";
		String reverse1 = "";
		String reverse2 = "";
		
		// for - until it reach sign =
		for (int i = l-1; i > 0; i--) {
			char c1 = page.charAt(i);
				
				if (c1 != '=') {
					surname += c1;	
					counter++;
				} else {
					break;
			}
		}
		
		// when if reach =, we have surname and need to invert it
		int m = surname.length();
		
		for (int j = m-1; j >=0;j--) {
			char c2 = surname.charAt(j);
			reverse1 += c2;	
		}
		
		// adding 10, cause by default there are 10 char until you reach name
		counter +=10;
		
		// for - until it reach sign =
		for (int k = l - counter; k > 0; k--) {
			char c3 = page.charAt(k);
			if (c3 != '='){
				name += c3;
			} else {
				break;
			}
				
		}
		// when if reach =, we have name and need to invert it	
		int n = name.length();
			
		for(int p = n - 1; p >= 0; p--){
			char c4 = name.charAt(p);
			reverse2 += c4;	
		}
		surname = reverse1;
		name = reverse2;
		
		// print it out
		System.out.printf("%s %s",name, surname);
			
	}
	
}
