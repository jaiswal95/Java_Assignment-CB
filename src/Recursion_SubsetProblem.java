
/*
   Subset_Problem-Recursion.

   Take as input N, a number. Take N more inputs and store that in an array. Take as input target, a number

      a. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.
      b. Write a recursive function which prints subsets of the array which sum to target. Return type of functions is void.

        Input Format
          Take as input N, a number. Take N more inputs and store that in an array.Take as input target, a number

             Constraints
               None

        Output Format
          Display the number of subsets and print the subsets in a space separated manner.

             Sample Input
              3
              1
              2
              3
              3
             Sample Output
              1 2  3
              2
*/
import java.util.Scanner;

public class Recursion_SubsetProblem {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		int target = scn.nextInt();
		System.out.println(sp(arr, 0, 0, target, ""));

	}

	public static int[] takeInput() {

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static int sp(int[] arr, int virtual_idx, int sum, int target, String ans) {

		if (virtual_idx == arr.length) {

			if (target == sum) {
				System.out.print(ans + " ");
				return 1;
			}

			return 0;
		}

		int count = 0;

		count += sp(arr, virtual_idx + 1, sum + arr[virtual_idx], target, ans + arr[virtual_idx] + " ");

		count += sp(arr, virtual_idx + 1, sum, target, ans);

		return count;
	}

}
