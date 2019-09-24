/*
 Generate Parentheses
 
   Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
    The output strings should be printed in the sorted order considering '(' has higher value than ')'.

        Input Format
          Single line containing an integral value 'n'.

            Constraints
             1<=n<=11

        Output Format
           Print the balanced parentheses strings with every possible solution on new line.

            Sample Input
             2
            Sample Output
             ()() 
             (()) 
 */
import java.util.Scanner;

public class Generate_Parentheses {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();

		VP(n, 0, 0, "");

	}

	public static void VP(int n, int open, int close, String ans) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > n || close > open) {
			return;
		}

		VP(n, open, close + 1, ans + ")");
		VP(n, open + 1, close, ans + "(");

	}

}
