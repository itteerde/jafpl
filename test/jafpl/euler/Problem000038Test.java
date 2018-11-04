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
class Problem000038Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000038#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("f2a29ede8dc9fae7926dc7a4357ac25e", CheckGenerator.hexString((new Problem000038()).solve()));
	}
}
