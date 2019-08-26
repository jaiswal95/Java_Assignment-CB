/*
Revising Quadratic Numbers 
 
 Given coefficients of a quadratic equation , you need to print the nature of the roots (real and distinct , real and equal , imaginary).

  Input Format
     First contains three coefficients a,b,c from the equation ax^2 + bx + c = 0.

    Constraints
      -100 <= a, b, c <= 100

  Output Format
      Output contains one/two lines.First line contains nature of the roots .
      The next line contains roots separated by a space if they exist. If roots are imaginary do not print the roots.

   Sample Input
       1 -11 28
   Sample Output
      Real and Distinct
       4 7
 
 */

import java.lang.Math;
import java.util.Scanner;

public class Revising_Quadratic {

	public static void calculate(int b, int d, int a) {
		int x, y;
		x = (int) ((-b + Math.sqrt(d)) / 2 * a);
		y = (int) ((-b - Math.sqrt(d)) / 2 * a);
		if (y > x)
			System.out.println(x + " " + y);
		else
			System.out.println(y + " " + x);

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int d = (int) (Math.pow(b, 2) - 4 * a * c);
		if (d == 0) {
			System.out.println("Real and Equal");
			int z = (-(b / (2 * a)));
			System.out.println(z + " " + z);
		} else if (d > 0) {
			System.out.println("Real and Distinct");
			calculate(b, d, a);
		} else {
			System.out.println("Imaginary");
		}
		return;

	}

}
