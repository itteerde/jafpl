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
class Problem000047Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000047#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("748f517ecdc29106e2738f88aa7530f4", CheckGenerator.hexString((new Problem000047()).solve()));
	}
}
