import java.util.Scanner;

public class Array_SpiralPrint_Anticlockwise {
	
	static Scanner scn = new Scanner(System.in);
	
public static void main(String[] args) {
		
		int[][] arr = takeInput();
		SpiralDisplay(arr);
		

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
	
	public static void SpiralDisplay(int[][] arr) {

		int minRow = 0;
		int maxRow = arr.length - 1;

		int minCol = 0;
		int maxCol = arr[0].length - 1;

		int count = 0;
		int nel = arr.length * arr[0].length;

		while (count < nel) {

			// First col
			for (int r = minRow; r <= maxRow && count < nel; r++) {

				System.out.print(arr[r][minCol] + ", ");
				count++;
			}
			minCol++;

			// Last Row
			for (int c = minCol; c <= maxCol && count < nel; c++) {

				System.out.print(arr[maxRow][c] + ", ");
				count++;
			}
			maxRow--;

			// Last Col
			for (int r = maxRow; r >= minRow && count < nel; r--) {

				System.out.print(arr[r][maxCol] + ", ");
				count++;
			}
			maxCol--;

			// First row
			for (int c = maxCol; c >= minCol && count < nel; c--) {

				System.out.print(arr[minRow][c] + ", ");
				count++;
			}
			minRow++;

		}
		System.out.println("END");

	}

}



