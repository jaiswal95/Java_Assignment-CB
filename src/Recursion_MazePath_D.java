
/*
 Mazepath_D(Count,Print)
 
 Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board.
  Our player starts in top-left corner of the board and must reach bottom-right corner.
   In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).

    a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.
    b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).

      Input Format
        Enter the number of rows N1 and number of columns N2

          Constraints
            None

      Output Format
        Display the total number of paths and print all the possible paths in a space separated manner

          Sample Input
           3
           3
          Sample Output
           VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
           13
 */
import java.util.Scanner;

public class Recursion_MazePath_D {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int er = scn.nextInt();
		int ec = scn.nextInt();
		getMazePath(1, 1, er, ec, "");

		System.out.println("\n" + count);

	}

	static int count = 0;

	public static void getMazePath(int current_row, int current_column, int end_row, int end_column, String ans) {

		if (current_row == end_row && current_column == end_column) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (current_row > end_row || current_column > end_column) {
			return;
		}

		getMazePath(current_row + 1, current_column, end_row, end_column, ans + "V");

		getMazePath(current_row, current_column + 1, end_row, end_column, ans + "H");

		getMazePath(current_row + 1, current_column + 1, end_row, end_column, ans + "D");

	}

}
