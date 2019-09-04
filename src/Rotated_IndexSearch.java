/*
  Find out index in rotated array.
  
  	Sample input
  	  5
      3 4 5 1 2
      4
    Sample output
      1
    
 */
import java.util.Scanner;

public class Rotated_IndexSearch {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		int key = scn.nextInt();
		int start=0;
		int end= arr.length-1;
		int res=SearchRotated(arr,start,end,key);
		System.out.println(res);
	}

	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;
	}

	

	public static int SearchRotated(int[] arr, int start, int end, int key) {

		// Base Case
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (arr[mid] == key) {
			return mid;
		}

		// Mid lies in the first line.

		if (arr[start] <= arr[mid]) {

			if (key >= arr[start] && key <= arr[mid]) {
				return SearchRotated(arr, start, mid - 1, key);
			} else {
				return SearchRotated(arr, mid + 1, end, key);
			}

		}

		// Mid lies in the Second line.

		if (key >= arr[mid] && key <= arr[end]) {
			return SearchRotated(arr, mid + 1, end, key);
		}
		return SearchRotated(arr, start, mid - 1, key);

	}

}
