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

		Recursion_GenerateSortedArray generate = new Recursion_GenerateSortedArray();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int[] A = new int[n1];
		int[] B = new int[n2];

		for (int i = 0; i < A.length; i++) {
			A[i] = scn.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = scn.nextInt();
		}

		int n = A.length;
		int m = B.length;
		generate.generate(A, B, n, m);
	}

	public void print(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	public void GenerateArray(int[] A, int[] B, int[] C, int i, int j, int m, int n, int len, boolean flag) {
		if (flag) {

			if (len != 0)
				print(C, len + 1);

			for (int k = i; k < m; k++) {
				if (len == 0) {
					C[len] = A[k];
					GenerateArray(A, B, C, k + 1, j, m, n, len, !flag);
				} else if (A[k] > C[len]) {
					C[len + 1] = A[k];
					GenerateArray(A, B, C, k + 1, j, m, n, len + 1, !flag);
				}
			}
		}

		else {
			for (int l = j; l < n; l++) {
				if (B[l] > C[len]) {
					C[len + 1] = B[l];
					GenerateArray(A, B, C, i, l + 1, m, n, len + 1, !flag);
				}
			}
		}
	}

	public void generate(int A[], int B[], int m, int n) {
		int C[] = new int[m + n];

		GenerateArray(A, B, C, 0, 0, m, n, 0, true);
	}

}
