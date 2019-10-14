
/*
   Balanced parenthesis(Using Stack).
   
      Take as input str, a string. The string is a mathematical expression e.g. “[a + {b + (c + d) + e} + f]”. 
       Write a function which tests if the brackets in expression are balanced or not and returns a Boolean value. Print the value returned.

          Input Format
           Enter the string

             Constraints
              None

          Output Format
           Display the boolean result

             Sample Input
              [a+{b+(c+d)+e}+f]
            Sample Output
              true
 */
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis_UsingStack {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String Expression = scn.next();

		if (Balanced(Expression)) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}

	}

	public static boolean Balanced(String Expression) {
		Stack<Character> s = new Stack<Character>();

		char[] ch = Expression.toCharArray();

		for (int i = 0; i < Expression.length(); i++) {
			if (ch[i] == '{') {
				s.push(ch[i]);
			}
			if (ch[i] == '}') {
				if ((s.peek() == '{') && !s.empty()) {
					s.pop();
				} else {
					return false;
				}
			}

			if (ch[i] == '[') {
				s.push(ch[i]);
			}
			if (ch[i] == ']') {
				if (s.peek() == '[' && !s.empty()) {
					s.pop();
				} else {
					return false;
				}
			}

			if (ch[i] == '(') {
				s.push(ch[i]);
			}
			if (ch[i] == ')') {
				if (s.peek() == '(' && !s.empty()) {
					s.pop();
				} else {
					return false;
				}
			}
		}
		if (s.empty()) {
			return true;
		} else {
			return false;
		}
	}

}
