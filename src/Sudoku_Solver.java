/*
   Sudoku Solver
   
    You are given an N*N sudoku grid (N is a multiple of 3). Solve the sudoku and print the solution.

        Input Format
          First line contains a single integer N. Next N lines contains N integers each, 
          where jth integer int ith line denotes the value at ith row and jth column in sudoku grid. This value is 0, if the cell is empty.

            Constraints
             N=9 Solution exists for input matrix.

        Output Format
          Print N lines containing N integers each, where jth integer int ith line denotes the value at ith row and jth column in sudoku grid,
           such that all cells are filled.

            Sample Input
             9
              5 3 0 0 7 0 0 0 0 
              6 0 0 1 9 5 0 0 0 
              0 9 8 0 0 0 0 6 0 
              8 0 0 0 6 0 0 0 3 
              4 0 0 8 0 3 0 0 1 
              7 0 0 0 2 0 0 0 6 
              0 6 0 0 0 0 2 8 0 
              0 0 0 4 1 9 0 0 5 
              0 0 0 0 8 0 0 7 9 
            Sample Output
              5 3 4 6 7 8 9 1 2 
              6 7 2 1 9 5 3 4 8 
              1 9 8 3 4 2 5 6 7 
              8 5 9 7 6 1 4 2 3 
              4 2 6 8 5 3 7 9 1 
              7 1 3 9 2 4 8 5 6 
              9 6 1 5 3 7 2 8 4 
              2 8 7 4 1 9 6 3 5 
              3 4 5 2 8 6 1 7 9 
 */
import java.util.Scanner;

public class Sudoku_Solver {
	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {

		int[][] board = takeInput();
		int N = board.length;

		if (solveSudoku(board, N)) {
			print(board, N);
		} else {
			System.out.println("No solution");
		}
	}

	public static int[][] takeInput() {

		int n = scn.nextInt();

		int[][] board = new int[n][];

		for (int r = 0; r < board.length; r++) {

			board[r] = new int[n];

			for (int c = 0; c < board[r].length; c++) {
				board[r][c] = scn.nextInt();
			}
		}
		return board;
	}

	public static boolean isSafe(int[][] board, int row, int col, int num) {

		for (int d = 0; d < board.length; d++) {

			if (board[row][d] == num) {
				return false;
			}
		}

		for (int r = 0; r < board.length; r++) {

			if (board[r][col] == num) {
				return false;
			}
		}

		int sqrt = (int) Math.sqrt(board.length);
		int boxRowStart = row - row % sqrt;
		int boxColStart = col - col % sqrt;

		for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
			for (int d = boxColStart; d < boxColStart + sqrt; d++) {
				if (board[r][d] == num) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean solveSudoku(int[][] board, int n) {
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 0) {
					row = i;
					col = j;

					isEmpty = false;
					break;
				}
			}
			if (!isEmpty) {
				break;
			}
		}

		if (isEmpty) {
			return true;
		}

		for (int num = 1; num <= n; num++) {
			if (isSafe(board, row, col, num)) {
				board[row][col] = num;

				if (solveSudoku(board, n)) {
					return true;
				} else {
					board[row][col] = 0;
				}
			}
		}
		return false;
	}

	public static void print(int[][] board, int N) {

		for (int r = 0; r < N; r++) {
			for (int d = 0; d < N; d++) {
				System.out.print(board[r][d]);
				System.out.print(" ");
			}
			System.out.print("\n");

			if ((r + 1) % (int) Math.sqrt(N) == 0) {
				System.out.print("");
			}
		}
	}

}
