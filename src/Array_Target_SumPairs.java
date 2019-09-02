/*
 Array Target sum Pairs.
 
 Take as input N, the size of array. Take N more inputs and store that in an array. 
  Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

  Input Format
     The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

    Constraints
      Length of the arrays should be between 1 and 1000.

  Output Format
     Print all the pairs of numbers which sum to target. Print each pair in increasing order.

  Sample Input
    5
    1
    3
    4
    2
    5
    5
  Sample Output
    1 and 4
    2 and 3
 
 */
import java.util.Scanner;

public class Array_Target_SumPairs {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] arr = takeInput();
		bubblesort( arr);
		//display(arr);

		int target = scn.nextInt();
		Targetsum(arr,target);

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
	
	public static void bubblesort(int[] arr) {
		for (int count = 0; count <= arr.length - 2; count++) {

			for (int j = 0; j <= arr.length - count - 2; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static void Targetsum(int [] arr,int target) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" and "+arr[j]);
				}
			}
		}
	}

}











