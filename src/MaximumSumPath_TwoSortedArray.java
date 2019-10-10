
/*
 Maximum Sum Path in Two Arrays
  
  You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence.
   You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays.
    You can switch from one array to another array only at common elements.

      Input Format
       First line contains integer t which is number of test case. 
       For each test case, it contains two integers n and m which is the size of arrays and 
       next two lines contains n and m space separated integers respectively.

             Constraints
               1<=t<=100 
               1<=n, 
               m<=100000

      Output Format
        Print the maximum path.

       Sample Input
         1
         8 8
         2 3 7 10 12 15 30 34
         1 5 7 8 10 15 16 19
       Sample Output
         122
 */
import java.util.Scanner;

public class MaximumSumPath_TwoSortedArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int m = scn.nextInt();

			int[] one = new int[n];
			int[] two = new int[m];

			for (int i = 0; i < one.length; i++) {
				one[i] = scn.nextInt();
			}
			for (int i = 0; i < two.length; i++) {
				two[i] = scn.nextInt();
			}

			int i = 0, j = 0;
			int s1 = 0, s2 = 0;
			int total = 0;
			while (i < one.length && j < two.length) {

				if (one[i] < two[j]) {
					s1 += one[i];
					i++;
				} else if (one[i] > two[j]) {
					s2 += two[j];
					j++;
				} else {
					total += Math.max(s1, s2) + two[j];
					i++;
					j++;
					s1 = 0;
					s2 = 0;
				}
			}
			// if (i == one.length) {
			while (j < two.length) {
				s2 += two[j];
				j++;
			}
			// }

			// if (j == two.length) {
			while (i < one.length) {
				s1 += one[i];
				i++;
			}
			// }
			total += Math.max(s1, s2);
			System.out.println(total);
		}
	}
}
