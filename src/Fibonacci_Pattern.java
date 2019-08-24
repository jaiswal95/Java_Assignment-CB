
/*
 Fibonacci Pattern
 
   Take N (number of rows), print the following pattern (for N = 4)
     0
     1 1
     2 3 5
     8 13 21 34

 Input Format
   Constraints
     0 < N < 100

 Output Format
   Sample Input
     4
   Sample Output
     0 
     1    1 
     2    3     5 
     8   13    21    34
 */
import java.util.Scanner;

public class Fibonacci_Pattern {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int a = 0;
		int b = 1;
		while (row <= n) {
			int col = 1;

			while (col <= row) {
				if (row == 1) {
					System.out.print(a);
				} else {
					System.out.print(b + "	");
					int s = a + b;
					a = b;
					b = s;

				}
				col++;
			}
			System.out.println();
			row++;
		}
	}
}
