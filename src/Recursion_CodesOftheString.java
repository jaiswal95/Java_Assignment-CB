/*
 Recursion-Codes of the string
 
 Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, …. z=26.
  Write a recursive function (return type Arraylist) to print all possible codes for the string.
   E.g. for “1123” possible codes are aabc, kbc, alc, aaw, kw.

      Input Format
        Enter a number

            Constraints
               None

      Output Format
         Display all the possible codes

            Sample Input
             1125
            Sample Output
             [aabe, aay, ale, kbe, ky]
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_CodesOftheString {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		//System.out.print(printCodes(str));
		printCodes_1(str,"");

	}

	// Array List
	public static ArrayList<String> printCodes(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		String ch1 = str.substring(0, 1);
		String ros1 = str.substring(1);

		ArrayList<String> rr = printCodes(ros1);
		ArrayList<String> mr = new ArrayList<>();

		if (Integer.parseInt(ch1, 10) > 0) {

			char code = (char) (Integer.parseInt(ch1, 10) + 'a' - 1);

			for (String val1 : rr) {
				mr.add(code + val1);
			}
		}

		if (str.length() >= 2) {

			String ch2 = str.substring(0, 2);
			String ros2 = str.substring(2);

			ArrayList<String> rr1 = printCodes(ros2);

			if (Integer.parseInt(ch2, 10) > 0 && Integer.parseInt(ch2) <= 26) {

				char code = (char) (Integer.parseInt(ch2, 10) + 'a' - 1);

				for (String val2 : rr1) {
					mr.add(code + val2);
				}
			}
			if (Integer.parseInt(ch2, 10) == 0) {

				for (String val2 : rr1) {
					mr.add(val2);
				}
			}
		}
		return mr;
	}

	// Recursion Print

	public static void printCodes_1(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}

		String ch1 = str.substring(0, 1);
		String ros1 = str.substring(1);

		if (Integer.parseInt(ch1, 10) > 0) {
			char code = (char) (Integer.parseInt(ch1, 10) + 'a' - 1);
			printCodes_1(ros1, ans + code);
		}

		if (str.length() >= 2) {
			String ch12 = str.substring(0, 2);
			String ros2 = str.substring(2);

			if (Integer.parseInt(ch12, 10) > 0 && Integer.parseInt(ch12) <= 26) {
				char code = (char) (Integer.parseInt(ch12, 10) + 'a' - 1);
				printCodes_1(ros2, ans + code);
			}
			if (Integer.parseInt(ch12, 10) == 0) {
				printCodes_1(ros2, ans);
			}
		}
	}

}
