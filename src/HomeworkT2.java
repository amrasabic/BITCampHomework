
public class HomeworkT2 {

	public static void main(String[] args) {

		String num = args[0];
		
		int a = Integer.parseInt(num) % 3;
		int b = Integer.parseInt(num) % 5;
		
		if (a == 0 && b != 0) {
			System.out.println("Fizz!");
		} else if (a != 0 && b == 0) {
			System.out.println("Buzz!");
		} else if (a == 0 && b == 0) {
			System.out.println("FizzBuzz!");
		} else {
			System.out.println(num);
		}
			
	}

}
