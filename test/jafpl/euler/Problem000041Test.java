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
class Problem000041Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000041#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("d0a1bd6ab4229b2d0754be8923431404", CheckGenerator.hexString((new Problem000041()).solve()));
	}
}
