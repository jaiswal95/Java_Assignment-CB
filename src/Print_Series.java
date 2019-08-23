/*
 
 Print Series
 
Take the following as input.

  A number (N1)
  A number (N2)
  Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.


 Input Format
   Constraints
     0 < N1 < 100 0 < N2 < 100

 Output Format
   Sample Input
    10 
     4
   Sample Output
     5 
    11 
    14 
    17 
    23 
    26 
    29 
    35 
    38 
    41
 
 */
import java.util.Scanner;

public class Print_Series {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int c=1;
		while(c<=n1){
			
		int ans=3*c+2;
			if(ans%n2!=0) {
			System.out.println(ans);
			}else {
				n1++;
			}
		c++;
		
	}

}
}
