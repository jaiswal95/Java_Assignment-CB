/*
 Recursion-Nth Triangle
 
 Take as input N, a number. 
  Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on 
    and so forth. Print the value returned.

     Input Format
       Enter a number N

          Constraints
             None

     Output Format
       Display the Nth triangle

          Sample Input
            4
          Sample Output
            10
 */
import java.util.Scanner;

public class Recursion_NthTriangle {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scn.nextInt();
		System.out.println(NT(n));

	}

	public static int NT(int n) {

		// Base Case
		if (n == 1) {
			return 1;
		}
		// Smaller Problem
		int fnm1 = NT(n - 1);

		// Self work
		int fn = fnm1 + n;

		return fn;

	}


}
