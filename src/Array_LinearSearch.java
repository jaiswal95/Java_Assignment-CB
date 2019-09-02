/*
Arrays-LinearSearch 
 
 Take as input N, the size of an array. Take N more inputs and store that in an array. 
 Take another number’s input as M. Write a function which returns the index on which M is found in an array, in case M is not found -1 is returned. 
 Print the value returned.

 1. It reads a number N.
 2. Take Another N numbers as an input and store them in an Array.
 3. Take another number M as an input.
 4. If M is found in the Array the index of M is returned else -1 is returned and print the value returned.

  Input Format
     
     Constraints
       N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000. M can be between -1000000000 to 1000000000.

     Output Format
       
       Sample Input
        5
        2
        4
        6
        9
       17
       17
       Sample Output
        4
 
 */
import java.util.Scanner;

public class Array_LinearSearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		int item = scn.nextInt();
		// display(arr);
		
		int res1=linearSearch( arr,  item);
		System.out.println(res1);

	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}

		System.out.println();

	}

	public static int[] takeInput() {

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;

	}

}
