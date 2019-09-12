import java.util.Scanner;

public class Array_Calculatethesum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String arr[]) {

		int n = scn.nextInt();
		int m = (int) Math.pow(10, 9) + 7;
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scn.nextInt();

		int q = scn.nextInt();

		for (int i = 0; i < q; i++) {

			int temp[] = new int[n];

			for (int j = 0; j < n; j++)
				temp[j] = 0;

			int x = scn.nextInt();

			int sum = 0;

			if (x == 0) {
				for (int j = 0; j < n; j++)
					temp[j] = (a[j] << 1) % m;
			} else {
				temp[x] = (a[x] + a[0]) % m;
				int j = x - 1;
				while (j != x) {
					int index = j - x;
					if (index < 0)
						index += n;
					temp[j] = (a[j] + a[index]) % m;
					j--;
					if (j < 0)
						j = n - 1;
				}
			}
			a = temp;

		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum = (sum + a[i]) % m;
		}
		System.out.println(sum);
	}
}