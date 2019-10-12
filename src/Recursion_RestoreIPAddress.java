import java.util.Scanner;

public class Recursion_RestoreIPAddress {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		ip(str, "", 0);

	}

	public static void ip(String str, String ans, int dot) {

		if (str.length() == 0) {

			if (dot == 4) {
				System.out.println(ans.substring(0, ans.length() - 1));
			}
			return;

		}
		if (str.length() > (4 - dot) * 3)
			return;

		for (int i = 1; i <= 3 && i <= str.length(); i++) {

			String val = str.substring(0, i);
			String roq = str.substring(i);
			if (isValid(val)) {
				ip(roq, ans + val + ".", dot + 1);
			}
		}

	}

	public static boolean isValid(String str) {

		if (str.length() > 1 && str.charAt(0) == '0') {
			return false;
		}
		if (Integer.parseInt(str) >= 256) {
			return false;
		}
		return true;
	}
}
