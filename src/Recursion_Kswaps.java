import java.util.Scanner;

public class Recursion_Kswaps {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();

		char[] arr = str.toCharArray();
		int k = scn.nextInt();

		System.out.println(Max_Integer(arr, 0, k));

	}

	public static int Max_Integer(char[] arr, int virtual_idx, int k) {

		int max = Integer.parseInt(new String(arr));

		if (k == 0) {
			return max;
		}

		for (int i = virtual_idx; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > arr[i]) {

					Swap_Character(arr, i, j);
					max = Math.max(max, Max_Integer(arr, i + 1, k - 1));
					Swap_Character(arr, i, j);
				}
			}
		}

		return max;
	}

	public static void Swap_Character(char[] arr, int i, int j) {

		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}