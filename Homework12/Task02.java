import java.util.Scanner;

public class Task02 {
    
    public static void main(String[] args) {
        
    	Scanner in = new Scanner (System.in);
		System.out.println("Insert hour: (range 1 to 24) ");
		int num = in.nextInt();
      
		switch (num){
		
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			System.out.println("Classes.");
			break;
		case 14:
		case 15: 
		case 16:
		case 17:
			System.out.println("Exercises.");
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 1:
			System.out.println("Homework.");
			break;
		case 2:
		case 3:
		case 4: 
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("Go to sleep!");
		
		}
		
		in.close();	
    }
    
}