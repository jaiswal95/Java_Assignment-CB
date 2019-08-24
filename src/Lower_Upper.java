/*
  Lower Upper
 
 Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" is character lies between 'A-Z' and 
  print "Invalid" for all other characters like $,.^# etc.


   Input Format
     Single Character .

   Output Format
     lowercase UPPERCASE Invalid

      Sample Input
        $
      Sample Output
        Invalid
 */

import java.util.Scanner;

public class Lower_Upper {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lowercase");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("UPPERCASE");
		}else {
			System.out.println("Invalid");
	}

}
}