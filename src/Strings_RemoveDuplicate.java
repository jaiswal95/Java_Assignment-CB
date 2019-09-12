
/*
 Strings-Remove Duplicate
 
  Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

     Input Format
       String

          Constraints
            A string of length between 1 to 1000

     Output Format
       String

          Sample Input
            aabccba
          Sample Output
            abcba
 */

import java.util.Scanner;

public class Strings_RemoveDuplicate {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.print(str.charAt(0));

		int i = 0;
		while (i <= str.length() - 2) {

			char ch = str.charAt(i);
			if (str.charAt(i) != str.charAt(i + 1)) {

				System.out.print(str.charAt(i + 1));

			}
			i++;
		}

	}
}
