import java.util.Arrays;

public class Task02 {

public static void main(String[] args) {
		
		try {

		int min = Integer.parseInt(args[0]);
		System.out.println(Arrays.toString(args));
		//checks every number and if its lowest than previous
			for(int i=0; i<args.length; i++) {
				int arg = Integer.parseInt(args[i]);
					if(arg < min){
						min= arg;
					}
			} 
			
		System.out.printf("The lowest number of all inputs is %d. " , min);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Insert numbers.");
		} catch(NumberFormatException e) {
			System.out.print("Please input only numbers");
		}
		
		
	}
}