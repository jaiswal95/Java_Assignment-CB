/*
 Aggressive Cows.
 
   Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. 
    The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).

   His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. 
   To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, 
   such that the minimum distance between any two of them is as large as possible. 
   What is the largest minimum distance?

  Input Format
    First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively.
     The next line contains N integers containing the indexes of stalls.

  Output Format
     Print one integer: the largest minimum distance.

   Sample Input
      5 3
      1 2 8 4 9
   Sample Output
      3
 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int helper = max;
		System.out.println(distribution(arr, k, helper));

	}

	public static int distribution(int[] arr, int cows, int helper) {
		Arrays.sort(arr);
		int lo = 1, hi = helper;
		int result = 0;
		while (lo <= hi) {
			int mid = (hi + lo) / 2;
			if (isValid(cows, mid, arr)) {
				lo = mid + 1;
				result = mid;
			} else {
				hi = mid - 1;
			}
		}
		return result;

	}

	public static boolean isValid(long cows, int ans, int[] a) {
		int count = 1;
		int last_pos = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] - last_pos >= ans) {
				count++;
				last_pos = a[i];
			}
			if (count == cows) {
				return true;
			}
		}
		return false;
	}

}
