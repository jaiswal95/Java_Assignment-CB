/*
 
 Alex goes Shopping
 
  It is Alex’s birthday and she wants to go shopping.
   She only has ‘A’ units of money and she wants to spend all of her money.
  However, she can only purchase one kind of item.
   She goes to a shop which has ‘n’ types items with prices A0,A1,A2,…,An-1. 
   The shopkeeper claims that he has atleast ‘k’ items she can choose from. Help her find out if the shopkeeper is correct or not.

   Input Format
      The first line contains an integer ‘n’ denoting the number of items in the shop. 
      The second line contains ‘n’ space-separated integers describing the respective price of each item. 
      The third line contains an integer ‘q’ denoting the number of queries. 
      Each of the subsequent lines contains two space-separated integers ‘A’ and ‘k’

      Constraints
         1<=n,Ai,A<=10^5 where 0<=i<n.
         1<=q<=2*n 
         1<=k<=n 
         The array may contain duplicate elements.

   Output Format
       For each query, print Yes on a new line if the shopkeeper is correct; otherwise, print No instead.


      Sample Input
        4
        100 200 400 100
        5
        100 2
        200 3
        500 4
        600 4
        800 4
      Sample Output
      
        Yes
        Yes
        No
        No
        Yes
 */

import java.util.Scanner;

public class Alex_Goes_Shopping {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int q = scn.nextInt();

		for (int i = 1; i <= q; i++) {
			int amount = scn.nextInt();
			int item = scn.nextInt();

			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (amount % arr[j] == 0) {
					count++;
				}
			}
			if (count >= item) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
