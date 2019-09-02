/*
 Array-BinarySearch
 
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input a number M. 
Write a function which returns the index on which M is found in the array, in case M is not found -1 is returned. Print the value returned.
You can assume that the array is sorted, but you’ve to optimize the finding process. For an array of size 1024, you can make 10 comparisons at maximum.

   1. It reads a number N.
   2. Take Another N numbers as input in Ascending Order and store them in an Array.
   3. Take Another number M as input and find that number in Array.
   4. If the number M is found, index of M is returned else -1 is returned.Print the number returned.

   Input Format

     Constraints
       N cannot be Negative. Range of Numbers N and M can be between -1000000000 to 1000000000

   Output Format

     Sample Input
       5
       3
       5
       6
       9
       78
       6
     Sample Output
       2
 */
import java.util.Scanner;

public class Array_BinarySearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		int item = scn.nextInt();
		// display(arr);
		int res = binarysearch(arr, item);
		System.out.println(res);


	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}

		System.out.println();

	}

	public static int[] takeInput() {

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

    public static int binarysearch(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;
			if (item > arr[mid]) {
				lo = mid + 1;
			} else if (item < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}


}
