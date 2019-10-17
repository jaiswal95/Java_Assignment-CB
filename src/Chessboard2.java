import java.util.Arrays;

public class Chessboard2 {

	public static int chess2(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + er + "-" + ec + "} ");
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int count = 0;
		// Knight
		count += chess2(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		count += chess2(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		// Rook
		if (cr == 0 || cr == er || cc == 0 || cc == ec) {

			// Horizontal
			for (int move = 1; move <= ec; move++) {
				count += chess2(cr, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}

			// Vertical
			for (int move = 1; move <= er; move++) {
				count += chess2(cr + move, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}

		}
		// Bishop
		if (cr == cc || cr + cc == ec) {

			// Diagonal
			for (int move = 1; move <= ec && move <= er; move++) {
				count += chess2(cr + move, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}B");
			}

		}

		return count;

	}
//	
//	public static char[] makeMinesPorts(boolean [] primes) {
//		
//	}

	public static boolean[] SOE(int n) {

		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int table = 2; table * table <= n; table++) {

			if (primes[table] == false) {
				continue;
			}
			for (int mult = 2; table * mult <= n; mult++) {
				primes[table * mult] = false;
			}
		}

		return primes;
	}

}
