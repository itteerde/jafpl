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
class Problem000027Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000027#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("69d9e3218fd7abb6ff453ea96505183d", CheckGenerator.hexString((new Problem000027()).solve()));
	}
}
