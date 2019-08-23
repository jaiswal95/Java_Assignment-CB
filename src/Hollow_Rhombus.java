
/*
 
Hollow Rhombus 
 
  Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.


Input Format
    Single integer N.

  Constraints
     N <= 20

Output Format
    Print pattern.

  Sample Input
    5
  Sample Output
        *****
       *   *
      *   *
     *   *
    *****
 */

import java.util.Scanner;

public class Hollow_Rhombus {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, col;
		int nsp = n - 1;
		while (row <= n) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			col = 1;
			while (col <= n) {
				if (row == 1 || row == n || col == 1 || col == n)
					System.out.print("*");
				else
					System.out.print(" ");
				col++;
			}
			nsp--;
			row++;
			System.out.println();
		}
	}

}
