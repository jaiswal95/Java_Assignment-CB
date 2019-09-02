/*
Array-Reverse an array
 
Take as input N, the size of array. Take N more inputs and store that in an array.
 Write a function that reverses the array. Print the values in reversed array.

  1. It reads a number N.
  2. Take Another N numbers as input and store them in an Array.
  3. Reverse the elements in the Array.
  4. Print the reversed Array.

    Input Format

      Constraints
         N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.

    Output Format
       
       Sample Input
         5
         0
         4
         6
         8
         9
       Sample Output
         9
         8
         6
         4
         0
 
 */
import java.util.Scanner;

public class Array_Reverse {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		reverse(arr);

		for (int val : arr) {
			System.out.print(val + " ");
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

	public static void reverse(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = temp;

		}

	}

}
