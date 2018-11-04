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
class Problem000022Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000022#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("f2c9c91cb025746f781fa4db8be3983f", CheckGenerator.hexString((new Problem000022()).solve()));
	}
}
