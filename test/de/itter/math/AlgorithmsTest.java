package de.itter.math;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class AlgorithmsTest {

	@Test
	public void testGCD() {

		assertEquals(14, Algorithms.gcd(123242, 546742));
		assertEquals(new BigInteger("14"), Algorithms.gcd(new BigInteger("123242"), new BigInteger("546742")));
	}

	@Test
	public void testLCM() {
		assertEquals(351, Algorithms.lcm(27, 13));
	}

	@Test
	public void testFac() {
		assertEquals(new BigInteger("720"), Algorithms.fac(6));
	}

	@Test
	public void testFactorize() {
		long[][] d30 = { { 2, 1 }, { 3, 1 }, { 5, 1 } };
		long[][] d6 = { { 2, 1 }, { 3, 1 } };
		assertEquals(d6[0][0], Algorithms.factorize(6)[0][0]);
		assertEquals(d6[1][0], Algorithms.factorize(6)[1][0]);

		assertEquals(d30[0][0], Algorithms.factorize(30)[0][0]);
		assertEquals(d30[1][0], Algorithms.factorize(30)[1][0]);
		assertEquals(d30[2][0], Algorithms.factorize(30)[2][0]);
	}

	@Test
	public void testFactorizeWithPrimeVector() {

		SiebEratosthenes sieb = new SiebEratosthenes(1000);
		Object[] primesO = sieb.primes(1000).toArray();
		long[] primes = new long[primesO.length];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = (Integer) primesO[i];
		}

		long[][] d30 = { { 2, 1 }, { 3, 1 }, { 5, 1 } };
		long[][] d6 = { { 2, 1 }, { 3, 1 } };
		assertEquals(d6[0][0], Algorithms.factorize(6, primes)[0][0]);
		assertEquals(d6[1][0], Algorithms.factorize(6, primes)[1][0]);

		assertEquals(d30[0][0], Algorithms.factorize(30, primes)[0][0]);
		assertEquals(d30[1][0], Algorithms.factorize(30, primes)[1][0]);
		assertEquals(d30[2][0], Algorithms.factorize(30, primes)[2][0]);
	}

	@Test
	public void testFib() {
		assertEquals(1, Algorithms.fib(1));
		assertEquals(55, Algorithms.fib(10));
		assertEquals(832040, Algorithms.fib(30));
	}

	@Test
	public void testFibBig() {
		assertEquals(BigInteger.ONE, Algorithms.fibBig(1));
		assertEquals(new BigInteger("55"), Algorithms.fibBig(10));
		assertEquals(new BigInteger("832040"), Algorithms.fibBig(30));
		assertEquals(new BigInteger(
				"410615886307971260333568378719267105220125108637369252408885430926905584274113403731330491660850044560830036835706942274588569362145476502674373045446852160486606292497360503469773453733196887405847255290082049086907512622059054542195889758031109222670849274793859539133318371244795543147611073276240066737934085191731810993201706776838934766764778739502174470268627820918553842225858306408301661862900358266857238210235802504351951472997919676524004784236376453347268364152648346245840573214241419937917242918602639810097866942392015404620153818671425739835074851396421139982713640679581178458198658692285968043243656709796000"),
				Algorithms.fibBig(3000));
	}

}
