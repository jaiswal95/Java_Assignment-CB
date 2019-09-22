/*
 Recursion-Keypad Codes

Take as input str, a string. str represents keys pressed on a nokia phone keypad. 
 We are concerned with all possible words that can be written with the pressed keys.

   Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz
       E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”

          a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.
          b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).

       Input Format
         Enter a number

          Constraints
            None

       Output Format
         Display the total no. of words and display all the words in a space separated manner


Sample Input
12
Sample Output
ad ae af bd be bf cd ce cf
9
 */
import java.util.Scanner;

public class Recursion_KeypadCodes {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		getKpc_1(str, "");
		System.out.println();
		System.out.println(count);

	}

	static int count = 0;

	public static void getKpc_1(String str, String ans) {
		// Base Case
		if (str.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		String code = getcode(ch);

		for (int i = 0; i < code.length(); i++) {
			getKpc_1(ros, ans + code.charAt(i));
		}

	}

	public static String getcode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jkl";
		else if (ch == '5')
			return "mno";
		else if (ch == '6')
			return "pqrs";
		else if (ch == '7')
			return "tuv";
		else if (ch == '8')
			return "wx";
		else if (ch == '9')
			return "yz";
		else if (ch == '9')
			return "@#";
		else
			return "";

	}

}
