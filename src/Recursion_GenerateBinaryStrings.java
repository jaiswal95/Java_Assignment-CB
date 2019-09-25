
/*
 
 Generate Binary Strings
 
 Given a string containing of ‘0’, ‘1’ and ‘?’ wildcard characters, generate all binary strings that 
 can be formed by replacing each wildcard character by ‘0’ or ‘1’.

     Input Format
      The first line of input contains a single integer T denoting the number of test cases.
      Then T test cases follow. Each test case consist of two lines. The first line of each test case consists of a string S.

             Constraints
                1 ≤ T ≤ 60 
                1 ≤ length of string S ≤ 30

     Output Format
       Print all binary string that can be formed by replacing each wildcard character separated by space.

            Sample Input
             1
             1??0?101
            Sample Output
             10000101 10001101 10100101 10101101 11000101 11001101 11100101 11101101
 */

import java.util.Scanner;

public class Recursion_GenerateBinaryStrings {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int tc = scn.nextInt();
		while (tc-- > 0) {
			String str = scn.next();
			char[] ch = str.toCharArray();
			print(ch, 0);
		}
	}

	public static void print(char[] ch, int P_i) {
		if (P_i == ch.length) {
			System.out.print(ch);
			System.out.print(" ");
			return;
		}

		if (ch[P_i] == '?') {

			ch[P_i] = '0';
			print(ch, P_i + 1);

			ch[P_i] = '1';
			print(ch, P_i + 1);

			ch[P_i] = '?';
		} else
			print(ch, P_i + 1);
	}

}
