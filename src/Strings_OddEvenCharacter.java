
/*
Strings-Odd Even Character.

 Take as input S, a string. Write a function that replaces every odd character with the character having just higher ascii code 
  and every even character with the character having just lower ascii code. Print the value returned.

   Input Format
     String

      Constraints
        Length of string should be between 1 to 1000.

   Output Format
     String

      Sample Input
       abcg
      Sample Output
       badf
 */

import java.util.Scanner;

public class Strings_OddEvenCharacter {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0) {
				System.out.print((char) (ch + 1));
			} else {
				if (i % 2 == 0)
					System.out.print((char) (ch + 1));
				else
					System.out.print((char) (ch - 1));
			}
		}
		System.out.println();
	}

}
