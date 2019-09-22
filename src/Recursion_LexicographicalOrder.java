
/*
 Recursion-Lexicographical order
 
 Take as input N, a number. Write a recursive function which prints counting from 1 to N in lexicographical order.
  In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.

     Input Format
        Enter a number N.

            Constraints
              None

     Output Format
        Display all the numbers upto N in a lexicographical order

            Sample Input
              10
            Sample Output
              0 1 10 2 3 4 5 6 7 8 9 
 */
import java.util.Scanner;

public class Recursion_LexicographicalOrder {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int current = 0;
		int end = scn.nextInt();
		lc(current, end);

	}

	public static void lc(int current, int end) {
		if (current > end) {
			return;
		}

		System.out.print(current + " ");
		int i = 0;
		if (current == 0) {
			i = 1;

		}
		while (i < 10) {

			lc(current * 10 + i, end);
			i++;
		}

	}

}
