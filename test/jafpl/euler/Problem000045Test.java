/**
 * 
 */
package jafpl.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

/**
 * @author eriki
 *
 */
class Problem000045Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000045#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("30dfe3e3b286add9d12e493ca7be63fc", CheckGenerator.hexString((new Problem000045()).solve()));
	}
}
