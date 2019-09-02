/*
Pattern Hourglass

5
5 4 3 2 1 0 1 2 3 4 5 
  4 3 2 1 0 1 2 3 4 
    3 2 1 0 1 2 3 
      2 1 0 1 2 
        1 0 1 
          0 
        1 0 1 
      2 1 0 1 2 
    3 2 1 0 1 2 3 
  4 3 2 1 0 1 2 3 4 
5 4 3 2 1 0 1 2 3 4 5 
 */

import java.util.Scanner;
  public class Pattern_Hourglass {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in) ;

        int n = scn.nextInt();

        int rows = 2 * n + 1;     

        int nst = 2 * n + 1;     
        int nsp = 0;        
        for (int i = 1; i <= rows; i++) {
            int val;
            if (i <= n + 1) 
                val = n - i + 1;
            else
                val = i - n - 1;

        
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("  ");
            }

        
   
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + " ");
                if (cst <= nst / 2)
                    val--;
                else
                    val++;
            }
         
            if (i <= n) {
                nsp++;
                nst -= 2;
            } else {
                nsp--;
                nst += 2;
            }
            System.out.println();
        }
    }

}
      
