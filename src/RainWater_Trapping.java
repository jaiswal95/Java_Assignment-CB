/*
 RAIN WATER TRAPPING(By Prefix Array Approach)
 
 You are given an input array whose each element represents the height of a line towers. The width of every tower is 1. It starts raining.
  Water is filled between the gap of towers if possible. You need to find how much water filled between these given towers.


	Input Format
      The first line consists of number of test cases T. 
      Each test case consists an integer N as number of towers and next line contains the N space separated integers.

        Constraints
          1 <= N <= 1000000 
          1 <= t <= 10 
          0 <= A[i] <= 10000000

    Output Format
      Print how much unit of water collected among towers for each test case.

         Sample Input
           2
           6
           3  0  0  2  0  4
           12
           0  1  0  2  1  0  1  3  2  1  2  1
         Sample Output
           10
           6
 */
import java.util.Scanner;

public class RainWater_Trapping {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();

			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			int left[] = new int[n];
			int right[] = new int[n];
			int left_max = Integer.MIN_VALUE;
			int right_max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {

				left[i] = Math.max(left_max, arr[i]);

				left_max = (left[i] > left_max) ? left[i] : left_max;
			}
			for (int i = n - 1; i >= 0; i--) {

				right[i] = Math.max(right_max, arr[i]);

				right_max = (right[i] > right_max) ? right[i] : right_max;
			}

			int result = 0;
			for (int i = 0; i < n; i++) {

				result += Math.min(left[i], right[i]) - arr[i];
			}
			System.out.println(result);
		}
		System.out.println();
	}

}
