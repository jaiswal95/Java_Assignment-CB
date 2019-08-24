
/*
 Pattern Number Ladder
 
  Take N (number of rows), print the following pattern (for N = 4)

   1
   2 3
   4 5 6
   7 8 9 10

   Input Format
      Constraints
       0 < N < 100

   Output Format
      Sample Input
       4
      Sample Output
       1  
       2	3  
       4	5	6  
       7	8	9	10
 
 */
import java.util.Scanner;

public class Pattern_Ladder {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, val = 1;
		while (row <= n) {

			int cst = 1;
			while (cst <= row) {
				System.out.print(val + "\t");
				cst++;
				val++;
			}
			System.out.println();
			row++;

		}
	}

}
