/*

Print reverse

Take N as input, Calculate it's reverse also Print the reverse.

Input Format
   Constraints
     0 <= N <= 1000000000

Output Format
   Sample Input
     123456789
   Sample Output
     987654321

*/
import java.util.Scanner;

public class Print_reverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int reverse = 0;
		while (n != 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;

		}
		System.out.println(reverse);
	}

}
