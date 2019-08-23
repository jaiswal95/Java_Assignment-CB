/*
Mirror Star

 Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

      *
   *  *  *  
*  *  *  *  *  
   *  *  *
      *

 Input Format
   Constraints
     0 < N < 10 (only odd numbers allowed)

 Output Format

    Sample Input
      5
    Sample Output
      *
    * * *
  * * * * *
    * * *
      *
 */
import java.util.Scanner;

public class Mirror_Star {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nsp = n/2;
		int nst = 1;

		// Rows
		int row = 1;

		while (row <=  n) {
			// Work

			// Spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// Stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			
			// Prep
            if(row<=n/2) {
			nst+=2;
			nsp--;
            }
            else {
            	nst-=2;
            	nsp++;
            }
			System.out.println();
			row++;
		}

	}

}