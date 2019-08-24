
/*
 Pattern Rhombus
 
 Take N (number of rows), print the following pattern (for N = 3).

                         1
                       2 3 2
                     3 4 5 4 3
                       2 3 2
                         1

       Input Format
          Constraints
           0 < N < 10

       Output Format
         Sample Input
          3
         Sample Output
                1
	       2	3	 2
       3   4	5	 4	 3
	       2	3	 2
		        1
 */
import java.util.Scanner;

public class Pattern_Rhombus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0, count1 = 0, k = 0;
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print("\t");
				count++;
			}
			while (k != 2 * i - 1) {
				if (count <= n - 1) {
					System.out.print(i + k + "\t");
					count++;
				} else {
					count1++;
					System.out.print(i + k - 2 * count1 + "\t");
				}
				k++;
			}
			count1 = count = k = 0;
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int space = n - i; space < n; space++) {
				System.out.print("\t");
			}
			int j, L;
			for (j = n - i, L = 0; L < n - i; L++, j++) {
				System.out.print(j + "\t");
			}
			j -= 2;
			L = 1;
			for (; L < n - i; L++, j--)
				System.out.print(j + "\t");
			System.out.println();
		}
	}
}
