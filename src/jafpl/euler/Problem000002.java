package jafpl.euler;

public class Problem000002 {

	public static void main(String[] args) {
		int sum = 0;
		int f2 = 0;
		int f1 = 1;

		for (;;) {
			int f = f2 + f1;
			f2 = f1;
			f1 = f;
			if (f % 2 == 0 && f <= 4000000) {
				sum = sum + f;
			} else {
				if (f > 40000000) {
					System.out.println(sum);
					return;
				}
			}
		}

	}

}
