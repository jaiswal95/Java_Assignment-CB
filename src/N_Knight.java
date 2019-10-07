/*
 N_Knight Problem
 
  Take as input N, the size of a chess board. We are asked to place N number of Knights in it, so that no knight can kill other.

         a. Write a recursive function which returns the count of different distinct ways the knights can be placed across the board.
              Print the value returned.
         b.Write a recursive function which prints all valid configurations (void is the return type for function).

      Input Format
        Enter the size of the chessboard N

         Constraints
          None

      Output Format
        Display the number of ways a knight can be placed and print all the possible arrangements in a space separated manner

        Sample Input
         2
        Sample Output
         {0-0} {0-1}  {0-0} {1-0}  {0-0} {1-1}  {0-1} {1-0}  {0-1} {1-1}  {1-0} {1-1} 
          6
 */



import java.util.Scanner;

public class N_Knight {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();

		KnightCombinationBoxRespect2DRecCall(new boolean[n][n], 0, 0, n, 0, "");
		System.out.println(count);
	}

	static int count = 0;

	public static void KnightCombinationBoxRespect2DRecCall(boolean[][] board, int row, int col, int tk, int kpsf,
			String ans) {

		if (kpsf == tk) {
			System.out.println(ans);
			count++;
			return;
		}

		if (col == board[0].length) {
			KnightCombinationBoxRespect2DRecCall(board, row + 1, 0, tk, kpsf, ans);
			return;
		}

		if (row == board.length) {
			return;
		}

		// place

		if (isItSafeToPlaceKnight(board, row, col)) {
			board[row][col] = true;
			KnightCombinationBoxRespect2DRecCall(board, row, col + 1, tk, kpsf + 1, ans + "{" + row + "-" + col + "} ");
			board[row][col] = false;
		}

		// not place
		KnightCombinationBoxRespect2DRecCall(board, row, col + 1, tk, kpsf, ans);

	}

	public static boolean isItSafeToPlaceKnight(boolean[][] board, int row, int col) {

		int[] rowArr = { -1, -2, -2, -1 };
		int[] colArr = { -2, -1, 1, 2 };

		for (int i = 0; i < rowArr.length; i++) {

			int nr = row + rowArr[i];
			int nc = col + colArr[i];

			if (nr >= 0 && nc >= 0 && nr < board.length && nc < board[0].length) {

				if (board[nr][nc]) {
					return false;
				}
			}
		}

		return true;

	}

}
