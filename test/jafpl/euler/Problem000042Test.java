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
class Problem000042Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000042#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("82aa4b0af34c2313a562076992e50aa3", CheckGenerator.hexString((new Problem000042()).solve()));
	}
}
