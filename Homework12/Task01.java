import java.util.Scanner;


public class Task01 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		System.out.println("Insert number, and let me do the magic: ");
		int num = in.nextInt();
		
		notReturning(num);
		// second method 
		System.out.println("Number of digits is: " + numOfDigits(num));
		// third 
		System.out.println("Switch first and last digit, and result is: " + switchDigits(num));
		// fourth
		System.out.println("Range between those two numbers is: " +
				rangeBetweenNumbers(num, switchDigits(num)));
		
		in.close();
	}
	
	public static void notReturning(int num){
		
		// this method adds ',' after 3 digits
		// int to string
		String number = num + ""; 
		// reverse number after you r done
		String revNumber = "";
		String result = "";
		int counter = 1;
		
		// length -1 cause of index
		for (int i = number.length() - 1; i >= 0; i--){
			// if counter is != 3 add char
			if (counter != 3){
				revNumber += number.charAt(i);
				counter++;
				// same as if its 0
			} else if (i == 0){
				revNumber += number.charAt(i);
				// else add "," and reset counter
			} else {
				revNumber += number.charAt(i) + ",";
				counter = 1;
			}
		}
		// and now reverse that num and print it out
		for (int i = revNumber.length() - 1; i >= 0; i--){
			result += revNumber.charAt(i);
		}
		
		System.out.println("Insert ',': " + result);
	}
	 
	public static int numOfDigits(int n) {
        //just print number length
        String num = "" + n;
        int numOfDigits = num.length();
        return numOfDigits;
        
    }
	
    public static int switchDigits(int n) {
        
        String num = "" + n;
        int length = num.length();
        // taking first and last digit, -1 cause of index
        String switchedDigits = "";
        char firstDigit = num.charAt(0);
        char lastDigit = num.charAt(length - 1);
        
        for(int i = 0; i <= length - 1; i++) {
        	// add last digit to index 0
            if(i == 0){
            	switchedDigits += lastDigit;
            // add rest digits as they go
            } else if(i > 0 && i < length - 1){
            	switchedDigits += num.charAt(i);
            // and at the end add first digit
            } else {
            	switchedDigits += firstDigit;
            }
        } 	
            return Integer.parseInt(switchedDigits);
        } 
	
    public static String rangeBetweenNumbers (int num1, int num2){
    	
     	int range = 0;
     	// range to decide which number to print out
     	for (int i = num1; i < num2; i++){
    		range++;
    	}
    	
    	String oddNumbers = "";
    	String evenNumbers = "";
    	// count odd and even numbers
        	
    	for (int i = num1; i < num2; i++){
    		// if number % 2 is zero it is even number, count them
    		if (i % 2 == 0){
    			evenNumbers += i + " ";
    		// else count odd numbers 
    		} else {
    			oddNumbers += i + " ";
    		}
    	} 
     	// if range is even number print them, or print odd numbers
    	if (range % 2 == 0){
    		return evenNumbers;
    	} else {
    		return oddNumbers;
    	}
    }
}