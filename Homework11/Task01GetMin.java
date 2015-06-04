import java.util.Scanner;


public class Task01GetMin {

	public static void main(String[] args) {
	//insert first
	Scanner in = new Scanner(System.in);
	System.out.print("Insert first number: ");
	int num1 = in.nextInt();
	// insert second
	System.out.print("Insert second number: ");
	int num2 = in.nextInt();
	// and insert third
	System.out.print("Insert third number: ");
	int num3 = in.nextInt();
	
	// with method getMin2 find lowest of first two entered
	System.out.println("Lower number of first two is: " + getMin2(num1, num2));
	// and with method getMin3 find lowest of them all 
	System.out.println("And the lowest off them all: " + getMin3(num1, num2, num3));
	
	}
	
	// method to find lowest of two numbers
	public static int getMin2(int a, int b){
		
		if (a < b){
			return a;
		} else {
			return b;
		}
		
	}
	// method to find lowest of three entered using method above
	public static int getMin3(int a, int b, int c){
		
		if (a < getMin2(b, c)){
			return a;
		} else {
			return getMin2(b, c);
		}

	}
}
