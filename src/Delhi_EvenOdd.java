/*
 DELHI'S ODD EVEN
Due to growing Traffic Problem Kejriwal wants to devise a new scheme. 
The scheme is as follows, each car will be allowed to run on Sunday 
if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. 
However to check every car for the above criteria can't be done by the Delhi Police.
You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?
Input Format:
The first line contains N , then N integers follow each denoting the number of the car.
Constraints:
N<=1000 Car No >=0 && Car No <=1000000000
Output Format
N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !
Sample Input
2
12345
12134
Sample Output
Yes
No 
 */
import java.util.Scanner;
public class Delhi_EvenOdd {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();
			int sum_even = 0;
			int sum_odd = 0;
			while (n != 0) {
				int rem = n % 10;
				if (rem % 2 == 0) {
					sum_even += rem; // If rem is even then sum_even+=rem
				} else {
					sum_odd += rem; // If rem is false then sum_odd+=rem
				}
				n /= 10; // Re-initialisation
			}
			if(sum_even%4==0 || sum_odd%3==0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
