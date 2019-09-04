
/*
 
 Take the following as input.

   A number (N)
   Take N more numerical inputs
   The N inputs for a sequence S = s1, s2, .., sN. Compute if it is possible to split sequence into two sequences -
   s1 to si and si+1 to sN such that first sequence is strictly decreasing and second is strictly increasing. Print true/false as output.

  Input Format

    Constraints
      0 < N < 1000 Each number in sequence S is > 0 and < 1000000000

  Output Format
     Sample Input
       5 
       1 
       2 
       3 
       4 
       5
     Sample Output
       true
 */
import java.util.Scanner;

public class Increasing_Decreasing {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		if (Checkbiotonic(arr, n) == 1) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}

	}

	public static int Checkbiotonic(int[] arr, int n) {

		int i, j;
		for (i = 1; i < n - 1; i++) {
			if (arr[i] < arr[i - 1])
				continue;
			if (arr[i] >= arr[i - 1])
				break;
		}
		if (i == n - 2)
			return 1;
		for (j = i + 1; j < n; j++) {
			if (arr[j] > arr[j - 1])
				continue;
			if (arr[j] <= arr[j - 1])
				break;
		}
		i = j;
		if (i != n)
			return 0;
		return 1;
	}

}