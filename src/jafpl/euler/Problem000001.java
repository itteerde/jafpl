package jafpl.euler;

public class Problem000001 {

	public static void main(String[] args) {

		System.out.println(solve());

	}

	public static String solve() {
		int sum = 0;

		for (int n = 0; n < 1000; n++) {
			if (n % 3 == 0 || n % 5 == 0) {
				sum += n;
			}
		}

		return Integer.toString(sum);

	}

}
