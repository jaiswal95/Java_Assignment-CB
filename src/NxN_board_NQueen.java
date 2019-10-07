/*
 N_Queen Problem.
 
 Take as input N, the size of a chess board. We are asked to place N number of queens in it, so that no queen can kill other.

     a. Write a recursive function which returns the count of different distinct ways the queens can be placed across the board. 
          Print the value returned.
     b. Write a recursive function which prints all valid configurations (void is the return type for function).

      Input Format
        Enter the number N(Size of the chessboard)

          Constraints
           None

      Output Format
        Display the number of possible ways of arranging N queens and print all the possible arrangements in a space separated manner

          Sample Input
           4
          Sample Output
           {1-2} {2-4} {3-1} {4-3}  {1-3} {2-1} {3-4} {4-2}
            2
 */
import java.util.Scanner;

public class NxN_board_NQueen {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n=scn.nextInt();
		QCrec(new boolean[n][n], 0, 0, n, 0, "");
		System.out.println(count);
	}

	static int count = 0;

	public static void QCrec(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {

		// Base Place
		if (qpsf == tq) {
			System.out.println(ans);
			count++;
			return;

		}
		if (col == board[0].length) {
			QCrec(board, row + 1, 0, tq, qpsf, ans);
			return;
		}
		if (row == board.length) {
			return;
		}

		// Place
		if (isitsafetoplaceQuuen(board, row, col)) {
			board[row][col] = true;
			QCrec(board, row + 1, 0, tq, qpsf + 1, ans + "{" + (row + 1) + "-" + (col + 1) + "} ");
			board[row][col] = false;

		}
		// Not Place
		QCrec(board, row, col + 1, tq, qpsf, ans);

	}

	public static boolean isitsafetoplaceQuuen(boolean[][] board, int row, int col) {

		// Vertically Up

		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}

		// Diagonal Left

		r = row - 1;
		c = col - 1;

		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// Diagonal Right

		r = row - 1;
		c = col + 1;

		while (c < board[0].length && r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

}
