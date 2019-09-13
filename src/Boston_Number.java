/*
 Boston Number
 
 A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ).
  The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . 
  For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. 
  Write a program to check whether a given integer is a Boston number.


Input Format
There will be only one line of input:N , the number which needs to be checked.


Constraints
1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)


Output Format
1 if the number is a Boston number. 0 if the number is a not Boston number.


Sample Input
378
Sample Output
1

 */
import java.util.Scanner;

public class Boston_Number {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int number = scn.nextInt();

		if (Primefactorization(number) == SumoftheNumbers(number))
			System.out.println("1");
		else
			System.out.println("0");

	}

	public static int SumoftheNumbers(int number) {
		int ans = 0;

		while (number != 0) {
			int rem = number % 10;
			ans += rem;
			number /= 10;
		}
		return ans;
	}

	public static int Primefactorization(int number) {
		int sum = 0;
		for (int i = 2; i <= number; i++) {

			if (number % i == 0) {
				if (i > 10) {
					int temp = i;
					while (temp != 0) {
						int rem = temp % 10;
						sum += rem;
						temp /= 10;
					}
				} else {
					sum += i;
				}
				number /= i;
				i--;
			}
		}
		return sum;
	}
}
