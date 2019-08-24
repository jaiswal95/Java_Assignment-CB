
/*
 Conversion(Any To Any)
 
 Take sb (source number system base), db (destination number system base) and sn (number in source format). 
   Write a function that converts sn to its counterpart in destination number system. Print the value returned.

  Input Format
    Constraints
     0 < N <= 1000000000

  Output Format
    Sample Input
      8
      2 
      33
    Sample Output
      11011
 */
import java.util.Scanner;

public class Conversion_AnyToAny {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int sn = scn.nextInt();
		int ans = 0;
		int multiplier = 1;
		while (sn != 0) {
			int rem = sn % 10;
			ans = rem * multiplier + ans;
			multiplier = multiplier * sb;
			sn = sn / 10;

		}
		multiplier = 1;
		sn = ans;
		ans = 0;

		while (sn != 0) {
			int rem = sn % db;
			ans = rem * multiplier + ans;
			multiplier = multiplier * 10;
			sn = sn / db;
		}
		System.out.println(ans);

	}

}
