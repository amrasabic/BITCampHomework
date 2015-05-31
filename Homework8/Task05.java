
public class Task05 {

	// as name says get next odd number		
	public static int getNextOddNumber(int num){
				
		if (num % 2 == 0) {
				num = num + 1;
			} else 
				num = num +2;
			return num;
		}
	
	// get area of circle
	
	public static double getAreaOfCircle(int diameter) {
			
		double area = (diameter / 2) * (diameter / 2) * Math.PI; 
			return area;
		}
	
	// is it in range 
		public static boolean isInRange(int start, int finish, int n) {
				
			boolean numIsInRange = true;
				if (start < n  && n < finish) {
					numIsInRange = true;
				} else 
					numIsInRange = false;
				return numIsInRange;
			}

	// insert numbers and print results
	public static void main(String[] args) {
				
		System.out.print("Next odd number is: ");
		System.out.println(getNextOddNumber(3));
			
		System.out.print("Area of circle is: ");
		System.out.println(getAreaOfCircle(4));
		
		System.out.print("Number is in range: ");
		System.out.print(isInRange(1, 5, 2));
			
	}

}
