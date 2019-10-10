
/*
 Form Biggest Numbers.
 
  You are provided an array of numbers. You need to arrange them in a way that yields the largest value.

      Input Format
         First line contains integer t which is number of test case. 
         For each test case, it contains an integer n which is the size of array A[] and next line contains n space separated integers A[i].

          Constraints
            1<=t<=100 
            1<=m<=100 
            1<=A[i]<=10^5

      Output Format
         Print the largest value.

            Sample Input
             1
             4
             54 546 548 60
            Sample Output
             6054854654
 */
import java.util.Scanner;

public class Form_Biggest_Numbers {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		while (t-- > 0) {
			int[] arr = takeInput();
			Sorting(arr);
			for (int val : arr) {
				System.out.print(val);
			}
			System.out.println();
		}
	}

	public static int[] takeInput() {

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void Sorting(int[] arr) {
		for (int count = 0; count <= arr.length - 2; count++) {

			for (int j = 0; j <= arr.length - count - 2; j++) {

				if (compare(arr[j], arr[j + 1])) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static boolean compare(int n1, int n2) {

		String n1n2s = n1 + "" + n2;
		String n2n1s = n2 + "" + n1;

		int res = n1n2s.compareTo(n2n1s);

		if (res > 0) {
			// Don't Swap
			return false;
		} else {
			// Swap
			return true;
		}
	}

}
