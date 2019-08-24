/*
 Conversion (Fahrenheit to Celsius)
 
 Take the following as input.

   Minimum Fahrenheit value
   Maximum Fahrenheit value
   Step

  Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
     0 -17
    20 -6
    40  4
    60 15
    80 26
   100 37

  Input Format
     The first line of the input contains an integer denoting the Minimum Fahrenheit value. 
     The second line of the input contains an integer denoting the Maximum Fahrenheit value. 
     The third line of the input contains an integer denoting the Step.

   Constraints
     0 < Min < 100 Min < Max < 500 0 < Step

  Output Format
    Print Fahrenheit and Celsius values separated by a tab. 
    Each step should be printed in a new line.

   Sample Input
     0 
     100 
     20
   Sample Output
    0 -17 
   20 -6 
   40 4 
   60 15 
   80 26 
  100 37
 
 */
import java.util.Scanner;

public class ConversionF_To_C {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int minF = scn.nextInt();
		int maxF = scn.nextInt();
		int step = scn.nextInt();

		for (int t = minF; t <= maxF; t = t + step) {
			 int c = (int)((5.0/9)*(t-32));
			 System.out.println(t+"\t"+c);

		}

	}

}
