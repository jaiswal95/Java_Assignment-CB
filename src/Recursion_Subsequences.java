/*
 Recursion-Subsequences.
 
 Take as input str, a string. We are concerned with all the possible subsequences of str.

   a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.
   b. Write a recursive function which prints all possible subsequences for a “abcd” has following subsequences 
        “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given string (void is the return type for function). 

      Input Format
         Enter a string

            Constraints
              None

      Output Format
         Display the total no. of subsequences and also print all the subsequences in a space separated manner

            Sample Input
              abcd
            Sample Output
               d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
              16
 
 */
import java.util.Scanner;

public class Recursion_Subsequences {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		sp(str, "");
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

	}

}
