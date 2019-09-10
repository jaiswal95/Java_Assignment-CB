/*
  Painter Partition Problem
  
    Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards 
    i.e. if the length of a particular board is 5, it will take 5 units of time to paint the board. 
    Compute the minimum amount of time to paint all the boards.

     Note that:
        Every painter can paint only contiguous segments of boards.
        A board can only be painted by 1 painter at maximum.

       Input Format
          First line contains K which is the number of painters.
          Second line contains N which indicates the number of boards. 
          Third line contains N space separated integers representing the length of each board.

         Constraints
           1 <= K <= 10 
           1 <= N <= 10 
           1<= Length Of Each Board <= 10^8

       Output Format
          Output the minimum time required to paint the board.

        Sample Input
         2 2
         1 10
        Sample Output
         10
 */
import java.util.Scanner;

public class Painters_PartitionProblem {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int nop = scn.nextInt();
		int nob = scn.nextInt();

		int[] arr = new int[nob];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		// Binary Search
		
		int lo = 0;
		int hi = 0;
		int finalAns = 0;
		
		// Enhanced loop for Sum
		
		for (int val : arr) {
			hi += val;
		}

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItpossible(nop, nob, arr, mid)) {
				finalAns = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(finalAns);
	}

	private static boolean isItpossible(int nop, int nob, int[] arr, int mid) {

		int painter = 1;
		int time = 0;
		int i = 0; // i denotes which board is already paints.

		while (i < arr.length) {

			if (time + arr[i] <= mid) {
				time = time + arr[i];
				i++;
			} else {
				// You were not apply to paint the board.
				painter++;
				time = 0;
				if (painter > nop) {
					return false;
				}
			}
		}
		return true;
	}

}
