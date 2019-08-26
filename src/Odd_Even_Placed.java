/*
 Sum of odd placed and even placed digits
 
  Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.


   Input Format
       Constraints
         0 < N <= 1000000000

   Output Format
       Sample Input
        2635
       Sample Output
        11
        5
 */
import java.util.Scanner;

public class Odd_Even_Placed {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0;
		int even_place = 0;
		int odd_place = 0;
		while(n!=0) {
			int rem =n%10;
			if(count%2==0) {
				even_place+=rem;
			}else {
				odd_place+=rem;
			}
			count++;
			n/=10;
		}
		System.out.println(even_place+"\n"+odd_place);
	}

}
