/*
 Google Tower of Hanoi.

        a. Write a recursive function which prints the steps required to solve the tower of Hanoi problem for N discs.
        b. Write a recursive function which returns number of steps required to solve the tower of Hanoi problem for N discs.

             Input Format
               Enter the number of discs

             Output Format
               Display the steps required to solve the tower and also print the total number of steps required

                 Sample Input
                  2
                 Sample Output
                  Move 1th disc from T1 to T3
                  Move 2th disc from T1 to T2
                  Move 1th disc from T3 to T2
                   3
 */
import java.util.Scanner;

public class Recursion_TowerOfHanoi {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		System.out.println(towerOfHanoi(n, "T1", "T2", "T3"));
	}
    
	public static int towerOfHanoi(int n, String from_rod, String to_rod, String aux_rod) {
		if (n == 1) {
			System.out.println("Move 1th disc from " + from_rod + " to " + to_rod);
			return 1;
		}
		int count =1;
		count+=towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move " + n + "th" + " disc from " + from_rod + " to " + to_rod);
		count+=towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
		return count;
	}
	

}
