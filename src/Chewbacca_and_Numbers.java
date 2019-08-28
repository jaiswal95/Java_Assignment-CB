/*
 Chewbacca and Numbers
 
 Luke Skywalker gave Chewbacca an integer number x. 
 Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

 Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits.
 The decimal representation of the final number shouldn't start with a zero.

    Input Format
       The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.

      Constraints
        x <= 100000000000000000

    Output Format
      Print the minimum possible positive number that Chewbacca can obtain after inverting some digits.
      The number shouldn't contain leading zeroes.

      Sample Input
        4545
      Sample Output
        4444
 */
import java.util.Scanner;

public class Chewbacca_and_Numbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();

		long count = n;
		long rem;
		long ans = 0L;
		long Fact = 1L;
		long nod = 0;

		while (count != 0) {
			count = count / 10;
			nod++;
		}
		while (n != 0) {
			rem = n % 10;
			if (rem > 4) {
				if (nod == 1 && rem != 9)
					rem = 9 - rem;
				else if (nod != 1 )
					rem = 9 - rem;
				else if (nod != 1  && rem != 9)
					rem = 9 - rem;
			}
			ans = ans + rem * Fact;
			Fact *= 10;
			n = n / 10;
			nod--;
		}
		System.out.println(ans);
	}
}