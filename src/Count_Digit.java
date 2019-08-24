
/*
Count Digits

 Take the following as input.
   A number
   A digit
   Write a function that returns the number of times digit is found in the number. Print the value returned.

  Input Format
    Integer (A number) Integer (A digit)

   Constraints
     0 <= N <= 1000000000 0 <= Digit <= 9

  Output Format
   Integer (count of times digit occurs in the number)

   Sample Input
     5433231 
     3
   Sample Output
     3


 */
import java.util.Scanner;

public class Count_Digit {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int key = scn.nextInt();
		int counter = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem == key) {
				counter++;
			}
			n = n / 10;
		}
		System.out.println(counter);

	}
}
