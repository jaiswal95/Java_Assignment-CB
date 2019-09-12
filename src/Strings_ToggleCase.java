/*
 Strings-Toggle Case
 
 Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

    Input Format
      String

       Constraints
        Length of string should be between 1 to 1000.

    Output Format
      String

       Sample Input
         abC
       Sample Output
         ABc
 */
import java.util.Scanner;

public class Strings_ToggleCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println(changeCaseUpdate(scn.next()));

	}

	public static String changeCaseUpdate(String str) {

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {

			char ch = sb.charAt(i);

			if (Character.isLowerCase(ch)) {

				sb.setCharAt(i, Character.toUpperCase(ch));

			} else if (Character.isUpperCase(ch)) {

				sb.setCharAt(i, Character.toLowerCase(ch));

			}

		}

		return sb.toString();

	}

}
