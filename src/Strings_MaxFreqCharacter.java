/*
 Strings- Maximum Frequency Character.
 
  Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

    Input Format
       String

         Constraints
           A string of length between 1 to 1000.

    Output Format
       Character

         Sample Input
          aaabacb
         Sample Output
          a
 */
import java.util.Scanner;

public class Strings_MaxFreqCharacter {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();

		System.out.println(MaxFreqChar(str));

	}

	static final int ASCII_SIZE = 256;

	public static char MaxFreqChar(String str) {
		
		// Create array to keep the count of individual characters and initialize the array as 0
		int count[] = new int[ASCII_SIZE];

		// Construct character count array from the input string.
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1;      // Initialize max count
		char result = ' '; // Initialize result

		// Traversing through the string and maintaining the count of each character
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}

}
