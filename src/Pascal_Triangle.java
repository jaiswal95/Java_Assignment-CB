/*
 Pascal Triangle
 
Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1


Input Format
   Constraints
     0 < N < 100

Output Format
   Sample Input
     6
   Sample Output
1  
1	1  
1	2	1  
1	3	3	1  
1	4	6	4	1  
1	5	10	10	5	1
 */

import java.util.Scanner;

public class Pascal_Triangle {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int col;
		while (row <= n) {

			int Start = 1; // Starting number
			col = 1;
			while (col <= row) {
				if (col == 1) {
					System.out.print(col + "\t");
				} else {
					Start = Start * (row - col + 1) / (col - 1); // Updating number
					System.out.print(Start + "\t");
				}
				col++;
			}
			System.out.println();
			row++;
		}
	}
}
