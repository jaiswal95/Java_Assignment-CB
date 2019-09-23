/*
 Recursion-Dictionary Order(smaller).
 
 Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters of 
 this string which are in dictionary order smaller than the given string.

     Input Format
        Enter a string

         Constraints
          None

     Output Format
        Display all the words which are in dictionary order smaller than the string entered

         Sample Input
           cab
         Sample Output
           acb
           abc
           bca
           bac
 
 */
import java.util.Scanner;

public class Recursion_Dict_Order_Smaller {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		DO_S(str, str, "");
	}

	public static void DO_S(String ques, String str, String ans) {

		int res = ans.compareTo(str);

		if (ques.length() == 0 && res < 0) {
			System.out.println(ans);
			return;
		}

		if (ques.length() == 0) {
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);

			DO_S(ros, str, ans + ch);
		}
	}

}
