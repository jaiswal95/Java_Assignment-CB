/*
 
 Hollow Diamond (Pattern 19 Practice)
 
 Take N (number of rows), print the following pattern (for N = 5).

     * * * * *
     * *   * *
     *       *
     * *   * *
     * * * * *

 Input Format
   Constraints
     0 < N < 10 (where N is an odd number)

 Output Format
   Sample Input
    5
   Sample Output
    *	*	*	*	*	
    *	*		*   *	
    *				*	
    *   *		*	*	
    *	*	*	*	*
 */
import java.util.Scanner;

public class Hollow_Diamond {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = n / 2 + 1;
		int nsp = 0;

		// Rows
		int row = 1;

		while (row <= n) {
			// Work

			// Stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*"+"\t");
				cst++;
			}
			// spaces
			int csp = 1;
			if (row == 2) {
				nsp = 1;
			}
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			// Stars
			cst = 1;
			if (row == 1 || row == n) {
				cst = 2;
			}
			while (cst <= nst) {
				System.out.print("*"+"\t");
				cst++;
			}

			// Prep
			if (row <= n / 2) {
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
