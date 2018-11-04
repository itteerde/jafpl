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
class Problem000017Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000017#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("6a979d4a9cf85135408529edc8a133d0", CheckGenerator.hexString((new Problem000014()).solve()));
	}
}
