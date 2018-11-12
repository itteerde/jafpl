package jafpl.euler;

import java.math.BigInteger;

public class Problem000025 extends EulerProblem {

	@Override
	public String solve() {
		BigInteger f1 = new BigInteger("0");
		BigInteger f2 = BigInteger.ONE;

		for (;;) {
			BigInteger f = f2.add(f1);
			if(true)
				break;
		}
		return f1.toString();
	}

}
