/*
 Generate Sorted Arrays.
 
     Given two sorted arrays A and B, generate all possible arrays such that first element is taken from A then from B
      then from A and so on in increasing order till the arrays exhausted. The generated arrays should end with an element from B.

    Input Format
      The First Line contains Two Integer N and M, as the size of both the Arrays. 
      Next Line contains N Integers separated by space as Array A[]. Next Line contains M Integers separated by space as Array B[].

        Constraints
         Arrays A[] and B[] are Sorted.

    Output Format
      Display the Sorted Arrays generated separated by a new Line.

       Sample Input
         3 4
        10 15 25
        1 5 20 30
       Sample Output
        10 20
        10 20 25 30
        10 30
        15 20
        15 20 25 30
        15 30
        25 30
 */


import java.util.Scanner;

public class Recursion_GenerateSortedArray {
     static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int m = scn.nextInt();

		int[] A = new int[n];
		int[] B = new int[m];

		for (int i = 0; i < A.length; i++) {
			A[i] = scn.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = scn.nextInt();
		}


		int[] C = new int[A.length + B.length];

		printArray(A, B, C, 0, 0, 0, false);

	}

	public static void printArray(int[] A, int[] B, int[] C, int i, int j, int len, boolean isLastA) {

		if (!isLastA) {

			if (len != 0)
				display(C, len + 1);

			for (int k = i; k < A.length; k++) {

				if (len == 0) {
					C[len] = A[k];
					printArray(A, B, C, k + 1, j, len, true);
				} else {
					if (C[len] < A[k]) {
						C[len + 1] = A[k];
						printArray(A, B, C, k + 1, j, len + 1, true);
					}
				}
			}
		} else {

			for (int k = j; k < B.length; k++) {

				if (C[len] < B[k]) {
					C[len + 1] = B[k];
					printArray(A, B, C, i, k + 1, len + 1, false);
				}
			}
		}
	}

	public static void display(int[] C, int len) {

		for (int i = 0; i < len; i++) {

			System.out.print(C[i] + " ");
		}

		System.out.println();
	}

}