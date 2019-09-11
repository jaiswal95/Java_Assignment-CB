/*
 Strings- Is Palindrome
 
     Take as input S, a string. Write a function that returns true if the string is a palindrome and false otherwise. Print the value returned.

        Input Format
           String

          Constraints
            String length between 1 to 1000 characters

        Output Format
           Boolean

              Sample Input
               abba
              Sample Output
               true
 */
import java.util.Scanner;

public class Strings_IsPalindrome {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();

		System.out.println(palindrome(str));

	}

	public static boolean palindrome(String str) {

		// 2 pointer Approach
		int i = 0;
		int j = str.length() - 1;
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
