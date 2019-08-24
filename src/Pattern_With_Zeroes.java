
/*
 Pattern with Zeroes
 
   Take N (number of rows), print the following pattern (for N = 5)
    1
    2 2
    3 0 3
    4 0 0 4
    5 0 0 0 5

    Input Format
       Constraints
         0 < N < 100

    Output Format
       Sample Input
         5
       Sample Output
         1  
         2	 2  
         3	 0	 3    
         4	 0	 0	 4  
         5	 0	 0	 0	 5
 */
import java.util.Scanner;

public class Pattern_With_Zeroes {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int row = 1;
		while (row <= n) {

			// Work
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst) {
					System.out.print(row + "\t");
				} else {
					System.out.print("0" + "\t");
				}
				cst++;
			}

			// Preparartion

			nst++;
			System.out.println();
			row++;
		}

	}

}