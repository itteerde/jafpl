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
class Problem000035Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000035#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("b53b3a3d6ab90ce0268229151c9bde11", CheckGenerator.hexString((new Problem000035()).solve()));
	}
}
