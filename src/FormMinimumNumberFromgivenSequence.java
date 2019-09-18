/*
Form Minimum Number From Given Sequence, 
 
Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing.
 Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.

    Input Format
       The First Line contains an Integer N, size of the array. Next Line contains N Strings separated by space.

      Constraints
        1 ≤ T ≤ 100 
        1 ≤ Length of String ≤ 8

    Output Format
        Print the minimum number for each String separated by a new Line.

       Sample Input
         4
         D I DD II
       Sample Output
         21
         12
         321 
         123
 
 */
import java.util.Scanner;

public class FormMinimumNumberFromgivenSequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();
		while (tc-- > 0) {

			String str = scn.next();

			int[] arr = new int[str.length() + 1];

			int count = 1;

			for (int i = 0; i <= str.length(); i++) {

				if (i == str.length() || str.charAt(i) == 'I') {
					arr[i] = count++;

					for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
						arr[j] = count++;
					}
				}
			}
			for (int val : arr) {
				System.out.print(val);
			}
			System.out.println();

		}
	}

}
