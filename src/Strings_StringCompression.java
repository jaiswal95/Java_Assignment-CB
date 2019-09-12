/*
 Strings-String Compression.
 
  Take as input S, a string. Write a function that does basic string compression. Print the value returned. 
   E.g. for input “aaabbccds” print out a3b2c2ds.

      Input Format
        A single String str.

          Constraints
             A string of length between 1 to 1000

      Output Format
        The compressed String.

          Sample Input
           aaabbccds
          Sample Output
           a3b2c2ds
 */
import java.util.Scanner;

public class Strings_StringCompression {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int count = 1;
		System.out.print(str.charAt(0));

		int i = 0;
		while (i <= str.length() - 2) {

			char ch = str.charAt(i);
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				if (count != 1) {
					System.out.print(count);
				}
				System.out.print(str.charAt(i + 1));
				count = 1;
			}
			i++;
		}
		if(count != 1) {
			System.out.print(count);
		}

	}
}
