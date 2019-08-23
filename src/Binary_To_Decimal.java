/*
 
 Binary To Decimal

Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

Input Format
   Constraints
     0 < N <= 1000000000

Output Format
   Sample Input
     101010
   Sample Output
     42

*/

import java.util.Scanner;

public class Binary_To_Decimal{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int multiplier = 1;
		while (n != 0) {
			int rem = n % 10;
			ans = rem * multiplier + ans;
			multiplier = multiplier * 2;
			n = n / 10;

		}
		System.out.println(ans);

	}

}
