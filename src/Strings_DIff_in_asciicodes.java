/*
 Strings-Difference in Ascii codes.
 
  Take as input S, a string. Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.

     Input Format
        String

          Constraints
           Length of String should be between 2 to 1000.

     Output Format
        String

          Sample Input
           acb
          Sample Output
           a2c-1b
 */
import java.util.Scanner;

public class Strings_DIff_in_asciicodes {

	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {

		String str = scn.nextLine();
		StringBuilder sb = new StringBuilder(str);
		int n = sb.length();
		int k = 2;
		for (int i = 0; i < 2 * n - 2; i = i + k) {
			int diff = sb.charAt(i + 1) - sb.charAt(i);
			sb.insert(i + 1, diff);
			if (diff < 0 || diff >= 10) {
				k = 3;
			} else {
				k = 2;
			}
		}
		System.out.print(sb);

	}
}