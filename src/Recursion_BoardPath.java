/*
Recursion-Board path.
 
 Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders).
  Take as input M, a number. M is the number of faces of the dice.

   a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. Print the value returned.
   b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).

    Input Format
      Enter a number N (size of the board) and number M(number of the faces of a dice)

        Constraints
          None

    Output Format
      Display the number of paths and print all the paths in a space separated manner

        Sample Input
          3
          3
        Sample Output
         111 12 21 3 
         4
 */
import java.util.Scanner;

public class Recursion_BoardPath {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int End = scn.nextInt();
		int n = scn.nextInt();
		Path(0, End, n, "");
		System.out.println();
		System.out.println(count);
	}

	static int count = 0;

	// Recursion Print
	public static void Path(int Current, int End, int n, String ans) {

		// Base Case
		if (Current == End) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (Current > End) {
			return;
		}

		for (int dice = 1; dice <= n; dice++) {
			Path(Current + dice, End, n, ans + dice);

		}

	}

}
