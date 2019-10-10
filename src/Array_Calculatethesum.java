
/*
 Calculate the Sum.
 
 Raj is a very smart kid who recently started learning computer programming. His coach gave him a cyclic array A having N numbers, 
 and he has to perform Q operations on this array. In each operation the coach would provide him with a number X. 
 After each operation, every element of the cyclic array would be replaced by the sum of itself and the element lying X positions behind it in the cyclic array. 
 All these replacements take place simultaneously. 
  For example, if the cyclic array was [a, b, c, d], then after the operation with X = 1, the new array would be [a+d, b+a, c+b, d+c].
   He needs to output the sum of the elements of the final array modulus 10^9+7. He made a program for it but it's not very efficient.
    You know he is a beginner, so he wants you to make an efficient program for this task because he doesn't want to disappoint his coach.

     Input Format
        The first line of each test file contains a integer N. 
        The next line contains N space separated integers which represent the elements of the cyclic array.
         The third line contains a integer Q representing the number of operations that will be applied to the array.
          Finally, Q lines follow, each one containing an integer X .

         Constraints
           1 <= N <= 100000
           1 <= Ai<= 10^9
           0 <= Q <= 1000000
           0 <= X < N

     Output Format
         Your program should output to the standard output stream the sum of the elements of the final array modulus 10^9+7.

         Sample Input
          5
          1 2 3 4 5
          2
          1
          0
         Sample Output
          60
 */
import java.util.Scanner;

public class Array_Calculatethesum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String arr[]) {

		int n = scn.nextInt();
		int m = (int) Math.pow(10, 9) + 7;
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scn.nextInt();

		int q = scn.nextInt();

		for (int i = 0; i < q; i++) {

			int temp[] = new int[n];

			for (int j = 0; j < n; j++)
				temp[j] = 0;

			int x = scn.nextInt();

			int sum = 0;

			if (x == 0) {
				for (int j = 0; j < n; j++)
					temp[j] = (a[j] << 1) % m;
			} else {
				temp[x] = (a[x] + a[0]) % m;
				int j = x - 1;
				while (j != x) {
					int index = j - x;
					if (index < 0)
						index += n;
					temp[j] = (a[j] + a[index]) % m;
					j--;
					if (j < 0)
						j = n - 1;
				}
			}
			a = temp;

		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum = (sum + a[i]) % m;
		}
		System.out.println(sum);
	}
}