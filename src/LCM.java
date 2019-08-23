/*
LCM
 
Take the following as input.
   A number (N1)
   A number (N2)
   Write a function which returns the LCM of N1 and N2. Print the value returned.

  Input Format
   Constraints
     0 < N1 < 1000000000 0 < N2 < 1000000000

  Output Format
   Sample Input
     4 
     6
   Sample Output
     12
*/
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        
    	Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int lcm;
        
        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;
        
        // Always true
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.print(lcm);
                break;
            }
            lcm++;
        }
    }
}