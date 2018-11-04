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
class Problem000039Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000039#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("fa83a11a198d5a7f0bf77a1987bcd006", CheckGenerator.hexString((new Problem000039()).solve()));
	}
}
