import java.util.Scanner;

import java.util.Arrays;

public class Aggressive_Cows_Approach_II {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int no_stall = scn.nextInt();
		int no_cows = scn.nextInt();

		int[] arr = new int[no_stall];

		for (int i = 1; i < arr.length; i++) {

			arr[i] = scn.nextInt();

		}
		Arrays.sort(arr);

		int FinalAns = 0;
		int lo = 0;
		int hi = arr[arr.length - 1] - arr[0];

		while (lo <= hi) {

			int mid = (hi + lo) / 2;

			if (isItPossible(no_stall, no_cows, arr, mid)) {

				FinalAns = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}
		System.out.println(FinalAns);

	}

	
	private static boolean isItPossible(int no_stall, int no_cows, int[] arr, int mid) {

		int cowplaced = 1;
		int Lastcowplaced = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] - Lastcowplaced > mid) {
				cowplaced++;
				Lastcowplaced = arr[i];

				if (cowplaced == no_cows) {
					return true;
				}
			}
		}
		return false;

	}
}
