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
class Problem000037Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000037#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("cace46c61b00de1b60874936a093981d", CheckGenerator.hexString((new Problem000037()).solve()));
	}
}
