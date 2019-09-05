/*
 Maximum Circular sum.
 
 You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. 
 You need to find the maximum sum of consecutive number.

   Input Format
        First line contains integer t which is number of test case.
         For each test case, it contains an integer n which is the size of numbers and next line contains n space separated integers.

     Constraints
       1<=t<=100 
       1<=n<=1000

   Output Format
     Print the maximum sum.

     Sample Input
      1
      7
      8 -8 9 -9 10 -11 12
     Sample Output
      22
 */
import java.util.Scanner;

public class Maximum_CircularSum {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(maxcircular(arr,n));
		}
	}

	public static int maxcircular(int[] arr, int n) {
		int maxkadane = kadane(arr, n);
		int a = 0;
		for (int i = 0; i < n; i++) {
			a += arr[i];
			arr[i] = -arr[i];
		}
		a = a + kadane(arr, n);
		return (a > maxkadane) ? a : maxkadane;
	}

	public static int kadane(int[] arr, int n) {
		int ms = 0, cs = 0;
		for (int i = 0; i < n; i++) {
			cs = cs + arr[i];
			if (cs < 0) {
				cs = 0;
			}
			if (cs > ms) {
				ms = cs;
			}
		}

		return ms;

	}

}
