
/*
 ChessBoard Problem(Count,Print).
 
 Take as input N, a number. N represents the size of a chess board.
  We’ve a piece standing in top-left corner and it must reach the bottom-right corner. The piece moves as follows –

    a. In any cell, the piece moves like a knight. But out of the possible 8 moves for a knight, only the positive ones are valid
        i.e. both row and column must increase in a move.
    b. On the walls (4 possible walls), the piece can move like a rook as well (in addition of knight moves).
        But, only the positive moves are allowed i.e. as a rook, piece can move any number of steps horizontally or vertically but in a manner,
      such that row or column must increase.
    c. On the diagonals (2 possible diagonals), the piece can move like a bishop as well
     (in addition to the knight and possibly rook moves). But, only the positive moves are allowed i.e. as a bishop, piece can move in a
      way such that row and column must increase.
     
   You are supposed to write the following functions
     a. Write a recursive function which returns the count of different distinct ways this board can be crossed. Print the value returned.
     b. Write a recursive function which prints all valid paths (void is the return type for function).

       Input Format
         Enter the size of the chessboard N

          Constraints
            None

       Output Format
         Display the total number of valid paths and print all the valid paths in a space separated manner

          Sample Input
           3
          Sample Output
           {0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2} {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}
            18
 */
import java.util.Scanner;

public class Chessboard1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		System.out.println("\n" + chess1(0, 0, n - 1, n - 1, ""));
	}

	public static int chess1(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + er + "-" + ec + "} ");
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int count = 0;
		// Knight
		count += chess1(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		count += chess1(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		// Rook
		if (cr == 0 || cr == er || cc == 0 || cc == ec) {

			// Horizontal
			for (int move = 1; move <= ec; move++) {
				count += chess1(cr, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}

			// Vertical
			for (int move = 1; move <= er; move++) {
				count += chess1(cr + move, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}

		}
		// Bishop
		if (cr == cc || cr + cc == ec) {

			// Diagonal
			for (int move = 1; move <= ec && move <= er; move++) {
				count += chess1(cr + move, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}B");
			}

		}

		return count;

	}
}