/*
Array Target Sum Triplets.

Take as input N, the size of array. Take N more inputs and store that in an array.
 Take as input “target”, a number. Write a function which prints all triplets of numbers which sum to target.

   Input Format
       First line contains input N. Next N lines contains the elements of array and N+1 line contains target number.

      Constraints
        Length of Array should be between 1 and 1000.

   Output Format
       Print all the triplet present in the array.

     Sample Input
       9
       5
       7
       9
       1
       2
       4
       6
       8
       3
      10
     Sample Output
       1, 2 and 7
       1, 3 and 6
       1, 4 and 5
       2, 3 and 5
 
 */

import java.util.Scanner;
public class Array_TargetSum_triplets {
	
   static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			
			int[] arr = takeInput();
			bubblesort( arr);
			//display(arr);

			int target = scn.nextInt();
			TargetTriplets(arr,target);

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
		
		public static void TargetTriplets(int [] arr,int target) {
			
			for(int i=0;i<arr.length-2;i++) {
				
				for(int j=i+1;j<arr.length-1;j++) {
					
					for(int k=j+1;k<arr.length;k++) {
						
						if(arr[i]+arr[j]+arr[k]==target) {
							
							System.out.println(arr[i]+", "+ arr[j]+" and "+ arr[k]);
						}
					}
				}
			}
		}
	}
