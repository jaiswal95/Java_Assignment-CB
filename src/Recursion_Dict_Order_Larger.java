/*
 Recursion-Dictionary Order Larger
 
 Take as input str, a string. Write a recursive function which prints all the words possible by rearranging 
 the characters of this string which are in dictionary order larger than the given string

     Input Format
        Enter a string

           Constraints
              None

     Output Format
        Display all the words larger than the string entered in separate lines

           Sample Input
             cab
           Sample Output
             cba
 */
import java.util.Scanner;

public class Recursion_Dict_Order_Larger {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		DO_L(str, "", str);
	}

	public static void DO_L(String ques, String ans, String str) {

		int res = ans.compareTo(str);

		if (ques.length() == 0 && res > 0) {
			System.out.println(ans);
			return;
		}

		if (ques.length() == 0) {
			return;
		}
		for (int i = 0; i <= ques.length() - 1; i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			DO_L(ros, ans + ch, str);
		}
	}

}
