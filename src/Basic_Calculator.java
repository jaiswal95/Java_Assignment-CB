/*
 Write a program that works as a simple calculator.

   1. It reads a character (ch)
   2. If ch is among '+', '-', '*', '/' or '%' it furthur takes two numbers (N1 and N2 as input). 
        It then performs appropriate appropriate operation between numbers and print the number.
   3. If ch is 'X' or 'x', the program terminates.
   4. If ch is any other character, the program should print 'Invalid operation. Try again.' and seek inputs again (starting from character).

     Write code to achieve above functionality.

    Input Format
        Constraints
         Numbers should be greater than 0 and lesser than 100000000. For division and modulus, 2nd number should not be 0.

    Output Format
        Sample Input
         * 
         1 
         2 
         / 
         4 
         2 
         + 
         3 
         2 
         ; 
         X
        Sample Output
         2 
         2 
         5 
         Invalid operation. Try again.
 */
import java.util.Scanner;

public class Basic_Calculator {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		char ch = scn.next().charAt(0);
		int n1,n2;
		
		while(ch!='x' && ch!='X') {
		
			switch(ch) {
			
			case'+':
				n1= scn.nextInt();
				n2= scn.nextInt();
				System.out.println(n1+n2);
				break;
			case'-':
				n1= scn.nextInt();
				n2= scn.nextInt();
				System.out.println(n1-n2);
				break;
			case'/':
				n1= scn.nextInt();
				n2= scn.nextInt();
				System.out.println(n1/n2);
				break;
			case'*':
				n1= scn.nextInt();
				n2= scn.nextInt();
				System.out.println(n1*n2);
				break;
			case'%':
				n1= scn.nextInt();
				n2= scn.nextInt();
				System.out.println(n1%n2);
				break;
				default:
					System.out.println("Invalid operation. Try again.");
				
				
			}
			ch=scn.next().charAt(0);
			}
		}

}
