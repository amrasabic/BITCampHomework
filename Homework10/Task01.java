import java.util.Arrays;
/*
 * 
 * 
 * 
 */

public abstract class Task01 {

	public static void main(String[] args) {

		int[] array = new int[100];
		int l = array.length;
		
	//	System.out.println(l);
		
		int i = 0;
		int j = 0;
		
		while(i < l){
			while (j < l){
				if (j <= 9){
					array[i] += j;
					j++;
					break;
				} else {
					j = 0;
					array[i] += j;
					j++;
					break;
				}
			}
			i++;
		}
		System.out.println(Arrays.toString(array));
	}

}
