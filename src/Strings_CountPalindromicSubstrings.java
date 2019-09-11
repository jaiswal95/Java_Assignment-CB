/*
 Strings-Count Palindromic Substrings
 
   Take as input S, a string. Write a program that gives the count of substrings of this string which are palindromes and Print the ans.

      Input Format
         String

          Constraints
             Length of string is between 1 to 1000.

      Output Format
         Integer

           Sample Input
             abc
           Sample Output
             3
 */
import java.util.Scanner;

public class Strings_CountPalindromicSubstrings {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();

		
		 int res = countPalindrome_Substring(str);
		 System.out.println(res);

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

	public static int countPalindrome_Substring(String str) {
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String ss = str.substring(i, j);
				if (palindrome(ss)) {
					count++;
				}
			}
		}
		return count;
	}
}
