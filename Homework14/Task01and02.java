import java.util.Scanner;

public class Task01and02 {

	/**
	 * Homework #14
	 * <p>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// insert values
		System.out.print("Insert number of rows: ");
		int rows = in.nextInt();
		System.out.print("Insert number of columns: ");
		int columns = in.nextInt();

		// creates matrix with numbers user defined
		int[][] matrix = new int[rows][columns];

		System.out.print("Which number do you wanna count?");
		int countNum = in.nextInt();

		fillMatrix(matrix);
		print2DArray(matrix);

		System.out.printf("\nNumber %d repeats itself %d times.", countNum,
				countNumber(matrix, countNum));
		System.out.println("\nHas zero: " + getNumOfZeroRowsAndColumns(matrix));
		in.close();
	}

	/**
	 * Fill matrix values
	 * <p>
	 * This method allows user to insert values for every element of the matrix.
	 * 
	 * @param matrix
	 *            - insert 2D array elements
	 */
	public static void fillMatrix(int[][] matrix) {

		Scanner in = new Scanner(System.in);

		// for loop for inserting elements of array
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("Insert value for [%d][%d]: ", i, j);
				matrix[i][j] = in.nextInt();
			}
		}
		System.out.println();
	}

	/**
	 * Print 2D array / matrix
	 * <p>
	 * This method just prints 2D array.
	 * 
	 * @param matrix
	 */
	public static void print2DArray(int[][] matrix) {

		System.out.print("2D array / Matrix : ");
		// printing 2D based on inserted values
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%2d ", matrix[i][j]);
			}
		}

	}

	// Task 01
	/**
	 * Count one number in matrix
	 * <p>
	 * Allows to count one number in matrix, and returns how many times does it
	 * appears in matrix.
	 * 
	 * @param matrix
	 *            - 2D array / matrix in which you want to count number
	 * @param num
	 *            - number you want to count
	 * @return int value - how many times does that number appears
	 */
	public static int countNumber(int[][] matrix, int num) {
		// counting number in matrix
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// if any element of this matrix is equal to number
				// counter++
				if (matrix[i][j] == num) {
					counter++;
				}
			}
		}
		// returning value of counter
		return counter;
	}

	// Task 02
	/**
	 * Count rows and columns sum = 0
	 * <p>
	 * 
	 * @param matrix
	 *            - 2D array
	 * @return - number of rows and columns sum equals zero
	 */
	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {

		int sum = 0;
		int counter = 0;
		// calculates sum for columns
		for (int i = 0; i < matrix.length; i++) {
			// reset sum every time
			sum = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				sum += matrix[i][j];
			}

			if (sum == 0) {
				// counter for sum = 0
				counter++;
			}
		}
		// calculates sum for rows
		for (int j = 0; j < matrix[0].length; j++) {
			// reset sum every time
			sum = 0;
			for (int i = 0; i < matrix.length; i++) {
				sum += matrix[i][j];
			}
			if (sum == 0) {
				// counter for sum = 0
				counter++;
			}
		}
		return counter;
	}
	
}