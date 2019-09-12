import java.util.Scanner;

public class Boston_Number {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int number = scn.nextInt();
		
		if (Primefactorization(number) == SumoftheNumbers(number))
			System.out.println("1");
		else
			System.out.println("0");

	}

	public static int SumoftheNumbers(int number) {
		int ans = 0;

		while (number != 0) {
			int rem = number % 10;
			ans += rem;
			number /= 10;
		}
		return ans;
	}

	public static int Primefactorization(int number) {
		int sum = 0;
		for (int i = 2; i < number; i++) {
			while (number % i == 0) {

				number = number / i;
				sum += i;
			}

		}
		if (number > 2) {
			sum = sum + number;

		}
		return sum;

	}
}
