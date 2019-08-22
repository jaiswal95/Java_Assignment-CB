
/*

 1.Bitwise(Print Primes)

Take N as input. Print all prime numbers from 2 to N.

Input Format
  Constraints
   1 <= N <= 1000

Output Format
  Sample Input
   10
  Sample Output
   2
   3
   5
   7

 */

import java.util.Scanner;

public class Bitwise {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1, j;
		int flag;
		while (i <= n) {
			flag = 0;
			j = 1;
			while (j <= n) {
				if (i % j == 0) {
					flag++;
				}
				j++;
			}
			if (flag == 2) {
				System.out.println(i);
			}
			i++;
		}
	}
}