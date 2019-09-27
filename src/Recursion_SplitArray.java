/*
 Split Array(Recursion).
 
  Take as input N, a number. Take N more inputs and store that in an array.

     a. Write a recursive function which counts the number of ways the array could be split in two groups, 
        so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. 
        Print the value returned.

     b. Write a recursive function which keeps track of ways an array could be split in two groups, 
        so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups.
        Return type of function should be void. Print the two groups, each time you find a successful split.

      Input Format
        Take as input N, a number. Take N more inputs and store that in an array.

           Constraints
             None

      Output Format
        Display the number of ways the array can be split and display all the groups in a comma separated manner

           Sample Input
            6
            1
            2
            3
            3
            4
            5
           Sample Output
             1 2 3 3 and 4 5
             1 3 5 and 2 3 4
             1 3 5 and 2 3 4
             2 3 4 and 1 3 5
             2 3 4 and 1 3 5
             4 5 and 1 2 3 3
            6
 */
import java.util.Scanner;

public class Recursion_SplitArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();
		System.out.println(Rsa(arr, 0, 0, "", 0, ""));

	}

	public static int[] takeInput() {

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static int Rsa(int[] arr, int virtual_idx, int sum1, String ans1, int sum2, String ans2) {

		if (virtual_idx == arr.length) {

			if (sum1 == sum2) {
				System.out.println(ans1 + "and " + ans2);

				return 1;
			}

			return 0;
		}

		int count = 0;

		count += Rsa(arr, virtual_idx + 1, sum1 + arr[virtual_idx], ans1 + arr[virtual_idx] + " ", sum2, ans2);
		count += Rsa(arr, virtual_idx + 1, sum1, ans1, sum2 + arr[virtual_idx], ans2 + arr[virtual_idx] + " ");

		return count;
	}

}
