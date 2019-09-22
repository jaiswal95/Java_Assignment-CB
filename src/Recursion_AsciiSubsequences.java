/*
 Recursion-Ascii Subsequences
 
  Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. 
     E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

      a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.
      b. Write a recursive function which prints all possible ascii-subsequences for a given string (void is the return type for function).

    Input Format
      Enter the string

        Constraints
          None

    Output Format
      Display the number of ASCII-subsequences and display all the ASCII- subsequences

        Sample Input
          ab
        Sample Output
           b 98 a ab a98 97 97b 9798
          9
 */
import java.util.Scanner;

public class Recursion_AsciiSubsequences {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str=scn.next();
		sp(str,"");
		System.out.println();
		System.out.println(count);

	}

	static int count = 0;

	// Recursion Print
	public static void sp(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		sp(ros, ans); // No
		sp(ros, ans + ch); // Yes
		sp(ros,ans+ (int)ch );

	}

}
