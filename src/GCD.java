/*
 GCD
 
  Take the following as input.

   A number (N1)
   A number (N2)
   Write a function which returns the GCD of N1 and N2. Print the value returned.

  Input Format
    Constraints
      0 < N1 < 1000000000 0 < N2 < 1000000000

  Output Format
    Sample Input
      16 
      24
    Sample Output
       8
 */
import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int temp;
		if(!(a>=b)) {
			temp=a;
			a=b;
			b=temp;
			}
		while(b!=0) {
			int rem=a%b;
			a=b;
			b=rem;
		}
		System.out.println(a);
		
	}
}
