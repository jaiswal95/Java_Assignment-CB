/*
 Longest subarray with 0 and 1.
 
 You are Given an array containing only 0s and 1s, find the largest subarray which contain equal no of 0s and 1s.

    Input Format
     The first line consists of number of test cases T. For each test case,
      consists an integer n as length of the array and next line contains n space separated integers.


Constraints
1 <= T <= 10  1 <= n <= 1000000


Output Format
Print the starting index and final index of the required largest subarray. If there is no subarray then print None.


Sample Input
2
7
1 0 0 1 0 1 1
4
1 1 1 1
Sample Output
0 5
None 
 */
import java.util.Scanner;

public class Longest_Subarray_with0and1 {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			Subarray(arr,n);
			
		}
	}

	public static int Subarray(int[] arr, int n) {

		int sum = 0;
		int maxsize = -1;
		int si = 0, ei = 0;

		for (int i = 0; i < n - 1; i++) {
			sum = (arr[i] == 0) ? -1 : 1;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] == 0)
					sum += -1;
				else
					sum += 1;

				if (sum == 0 && maxsize < j - i + 1) {
					maxsize = j - i + 1;
					si = i;
				}
			}
		}

		ei = si + maxsize - 1;
		if (maxsize == -1)
			System.out.println("None");
		else
			System.out.println(si + " " + ei);

		return maxsize;
	}

}
