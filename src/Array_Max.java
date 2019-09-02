/*
  Arrays- Max Value In Array
  
  Take as input N, the size of array. Take N more inputs and store that in an array.
   Write a function which returns the maximum value in the array. Print the value returned.

     1.It reads a number N.
     2.Take Another N numbers as input and store them in an Array.
     3.calculate the max value in the array and return that value.

   Input Format
      First line contains integer n as size of array. Next n lines contains a single integer as element of array.

     Constraints
       N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000

   Output Format
       Print the required output.

     Sample Input
       4
       2
       8
       6
       4
     Sample Output
       8
*/
import java.util.Scanner;

public class Array_Max {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();

		// display(arr);

		System.out.println(max(arr));

	}

	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;
	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static int max(int[] arr) {

		int m = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}

}
