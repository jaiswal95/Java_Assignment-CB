/*

 3. Check prime

Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

Input Format
   Constraints
     2 < N <= 1000000000

Output Format
   Sample Input
     3
   Sample Output
     Prime
 
 */
import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int count = 2;
		int flag = 0;

		while (count <= n - 1) {
			if (n % count == 0) {
				System.out.println("Not Prime");
				flag = 1;
				break;
			}

			count++;

		}
		if (flag == 0) {
			System.out.println("Prime");
		}

	}
}