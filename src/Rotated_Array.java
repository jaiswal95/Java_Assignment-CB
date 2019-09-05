/*
 Rotated Array.
 
 Suppose a sorted array A is rotated at some pivot unknown to you beforehand.

    Find the minimum element.
    Given that the array will not contain duplicates.

    Input Format
      An integer n followed by an array A of size n.

       Constraints
         1 <= n <= 10^6 1 <= arr[i] <= 10^9 , where arr[i] is any element in the array

    Output Format
       Output should contain the minimum element in that array A.

     Sample Input
       5
       3 4 5 1 2
     Sample Output
       1
 */
import java.util.Scanner;

public class Rotated_Array {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		long[] arr = new long[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextLong();
		}
		System.out.println(Rotated_Findmin(arr, n));
	}

	public static long Rotated_Findmin(long[] arr, int n) {
		int high = n - 1;
		int low = 0;
		int ans = 0, mid;
		while (low <= high) {
			if (n == 1)
				return arr[ans];
			mid = low + ((high - low) / 2);
			if ((arr[mid] < arr[(mid + 1) % n]) && (arr[mid] < arr[(mid - 1 + n) % n])) {
				return arr[mid];
			} else if (arr[mid] < arr[high]) {
				high = mid;
			} else if (arr[mid] > arr[high]) {
				low = mid + 1;
			}
		}

		return arr[ans];
	}

}
