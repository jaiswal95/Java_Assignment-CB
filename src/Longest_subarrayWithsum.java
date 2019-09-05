/*
  Longest Subarray with Sum.
  
  Given an array of N integers. 
  The task is to find the maximum length subarray such that the sum of all its elements is greater than or equal to 0.

     Input Format
       The First Line contains an Integer as the number of Test cases.
       The next line contains an Integer N, as the Size of the array.
       Next Line contains N Integers separated by space.

      Constraints
        Output Format
          Print the max length of the subarray for each Test Case separated by a new Line.

        Sample Input
         1
         6
        -1 4 -2 -5 6 -8
        
        Sample Output
          5
 */
import java.util.Scanner;

public class Longest_subarrayWithsum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			int res = longestSubarray(arr, n);
			System.out.println(res);
		}
	}

	public static int search(int search[], int s, int e, int key) {

		int ans = -1;
		// Binary search
		while (s <= e) {
			int mid = (s + e) / 2;
			if (search[mid] - key >= 0) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

	public static int longestSubarray(int[] arr, int n) {
		int sum[] = new int[n + 1];
		sum[n] = 0;
		for (int i = n - 1; i >= 0; --i) {
			sum[i] = sum[i + 1] + arr[i];
		}
		int ans = 0;

		int search[] = new int[n];

		int array[] = new int[n];
		int j = 0;
		for (int i = 0; i < n; ++i) {

			if ((j == 0) || sum[i] > search[j - 1]) {
				search[j] = sum[i];
				array[j] = i;
				j++;
			}
			int s = search(search, 0, j - 1, sum[i + 1]);

			if (s != -1)
				ans = Math.max(ans, i - array[s] + 1);
		}
		return ans;
	}
}