
/*
Double_sided_Arrow

    Constraints
       N is odd number.
7
            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
 
 */
import java.util.Scanner;

public class Pattern_Doublesided_Arrow {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp1 = n - 1;
		int nsp2 = -1;
		int nst = 1;

		for (int i = 1; i <= n; i++) {

			int val;

			if (i <= n / 2 + 1) {
				val = i;
			} else {
				val = n - i + 1;
			}

			// spaces
			for (int csp = 1; csp <= nsp1; csp++) {
				System.out.print("  ");
			}

			// numbers
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + " ");
				val--;
			}

			// spaces
			for (int csp = 1; csp <= nsp2; csp++) {
				System.out.print("  ");
			}

			int cst = 1;
			val++;
			if (i == 1 || i == n) {
				cst = 2;

			}

			// numbers
			for (; cst <= nst; cst++) {
				System.out.print(val + " ");
				val++;
			}

			// preparation
			if (i <= n / 2) {
				nsp1 -= 2;
				nst++;
				nsp2 += 2;
			} else {
				nsp1 += 2;
				nst--;
				nsp2 -= 2;
			}
			System.out.println();
		}
	}

}
