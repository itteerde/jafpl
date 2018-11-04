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
class Problem000030Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000030#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("27a1779a8a8c323a307ac8a70bc4489d", CheckGenerator.hexString((new Problem000030()).solve()));
	}
}
