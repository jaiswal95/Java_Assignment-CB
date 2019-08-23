/*
 
 Decimal To Octal

Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

Input Format
   Constraints
     0 < N <= 1000000000

Output Format
   Sample Input
     63
   Sample Output
     77

*/

import java.util.Scanner;

public class Decimal_To_Octal{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int multiplier = 1;
		while (n != 0) {
			int rem = n % 8;
			ans = rem * multiplier + ans;
			multiplier = multiplier * 10;
			n = n / 8;

		}
		System.out.println(ans);

	}

}
