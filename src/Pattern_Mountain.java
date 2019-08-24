
/*
 Pattern Mountain
 
 Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   

    Input Format
       Constraints
         0 < N < 10

    Output Format
       Sample Input
         4
       Sample Output
         1						1
         1	2				2	1
         1	2	3		3	2	1
         1	2	3	4	3	2	1
 */
import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;
		int nsp = 2 * n - 3;

		// Rows
		int row = 1;

		while (row <= n) {
			// Work
			int num = 1;
			// Stars
			int cst = 1;
			while (cst <= nst) {
				if (cst != n)
					System.out.print(num + "\t");
				num++;
				cst++;
			}
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			// Stars
			cst = num - 1;
			while (cst >= 1) {
				System.out.print(cst + "\t");
				cst--;
			}

			// Prep

			nst++;
			nsp -= 2;
			System.out.println();
			row++;
		}

	}

}
