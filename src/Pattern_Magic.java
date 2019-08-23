/*
   
Print Magic

You will be given a number N. You have to code a hollow diamond looking pattern. The output for (N=5) is given in the following image.

*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********

*/

import java.util.Scanner;

public class Pattern_Magic {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = n ;
		int nsp = 0;

		// Rows
		int row = 1;

		while (row <= 2*n-1) {
			// Work

			// Stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			// spaces
			int csp = 1;
			if (row == 2) {
				nsp = 1;
			}
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// Stars
			cst = 1;
			if (row == 1 || row == 2*n-1) {
				cst = 2;
			}
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// Prep
			if (row <= n -1) {
				nsp += 2;
				nst--;
			} else {
				nsp -= 2;
				nst++;
			}
			System.out.println();
			row++;
		}

	}

}

