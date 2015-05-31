import java.util.Scanner;


public class Task03 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Insert number: ");
		int num = ulaz.nextInt();
		
		int fakt = 1;
		int cifra = 0;
		int noviBroj = 0;
		
		// factorial of some number, code not done
		
		for(int i = 1; i <= num; i++){
			fakt *= i;
			if(fakt > 99){
				cifra = fakt % 10;
				if(cifra == 0){
					
					while(fakt > 99){
						cifra = fakt % 10;
						if(cifra == 0){
							fakt /= 10;
						}else{
							break;
						}
				}
				} else if (cifra!=0){
					
					while(fakt > 9999){
						noviBroj = fakt % 10;
						noviBroj *= 10;
						fakt /= 10;
						noviBroj += fakt % 10;
						fakt = noviBroj % 10;
						fakt *= 10;
						noviBroj /= 10;
						fakt += noviBroj % 10;
					}
				}
				
			}	
				
		}
	
		if(fakt > 99){
			noviBroj = fakt % 10;
			noviBroj *= 10;
			fakt /= 10;
			noviBroj += fakt % 10;
			fakt = noviBroj % 10;
			fakt *= 10;
			noviBroj /= 10;
			fakt += noviBroj % 10;
		}
		System.out.println(fakt);
		
	}

}