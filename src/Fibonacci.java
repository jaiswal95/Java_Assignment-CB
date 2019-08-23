/*

 Nth Fibonacci (Hard)

Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

Input Format
   Constraints
     0 <= N <= 1000

Output Format
   Sample Input
     10
   Sample Output
     55

*/

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		int sum = 0;
		while (c < n) {

			sum = a + b;
			a = b;
			b = sum;
			c++;
		}
		System.out.println(sum);

	}

}