/*
 Pattern X
  
  Print the following pattern.

    Input Format
     N : Integer

     Constraints
       1<N<100

    Output Format
      Print the Pattern

        Sample Input
          4
        Sample Output
          1     1
           2   2
            3 3
             4
            3 3
           2   2
          1     1
 */
import java.util.Scanner;

public class Pattern_X {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			System.out.print(i);
			for (int j = 1; j <= ((n - i) * 2 - 1); j++) {
				System.out.print(" ");

			}
			if (i != n)
				System.out.print(i);
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			for (int j = 1; j <= ((n - i) * 2 - 1); j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			System.out.println();
		}

	}
}
