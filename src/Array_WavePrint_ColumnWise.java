import java.util.Scanner;

public class Array_WavePrint_ColumnWise {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] arr = takeInput();
		WaveDisplay(arr);
		//display(arr);

	}
	public static int[][] takeInput() {

		int row = scn.nextInt();
		int col = scn.nextInt();
		// Create a new array
		int[][] arr = new int[row][];

		// loop on every row
		for (int r = 0; r < arr.length; r++) {
			

			// Point to some address memory
			arr[r] = new int[col];

			for (int c = 0; c < arr[r].length; c++) {
						arr[r][c] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
					}
			System.out.println();
		}
	}

	public static void WaveDisplay(int[][] arr) {

		for (int c = 0; c < arr[0].length; c++) {

			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++)
					System.out.print(arr[r][c] + ", ");
			} else {
				for (int r = arr.length - 1; r >= 0; r--)
					System.out.print(arr[r][c] + ", ");
				}
			}
		System.out.print("END");
	}
}
