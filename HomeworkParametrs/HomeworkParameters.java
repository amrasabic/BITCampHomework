
public class HomeworkParameters {
	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("f(10) = " + multiplyNum(10));
		System.out.println("f(10.0) = " + multiplyNum(10.0));
		System.out.println("f(10, 15) = " + multiplyNum(10, 15));
		System.out.println("f(10.0, 15) = " + multiplyNum(10.0, 15));
		
	}

	public static int multiplyNum(int num){
	
		return num * num;
		
	}

	public static double multiplyNum(double num){
		
		return num * num;
		
	}
	public static int multiplyNum(int num1, int num2){
		
		return (num1 * num2);
		
	}
	public static double multiplyNum(double num1, double num2){
		
		return (num1 * num2);
		
	}
	
}
