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
class Problem000019Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000019#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("a4a042cf4fd6bfb47701cbc8a1653ada", CheckGenerator.hexString((new Problem000019()).solve()));
	}
}
