/*
 
 Von Neuman Loves Binary
 
Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.

    Input Format
     The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.

      Constraints
       N<=1000 Digits in binary representation is <=16.

    Output Format
     N lines,each containing a decimal equivalent of the binary number.

      Sample Input
        4
        101
        1111
        00110
        111111
      Sample Output
        5
        15
        6
        63
*/
import java.util.Scanner;

public class VonNeuman_Loves_Binary{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t-->0) {
		
		int n = scn.nextInt();
		int ans = 0;
		int multiplier = 1;
		
		while (n != 0) {
			int rem = n % 10;
			ans = rem * multiplier + ans;
			multiplier = multiplier * 2;
			n = n / 10;

		}
		System.out.println(ans);
		}
	}
}

