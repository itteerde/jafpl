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
class Problem000011Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000011#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("678f5d2e1eaa42f04fa53411b4f441ac", CheckGenerator.hexString((new Problem000011()).solve()));
	}

}
