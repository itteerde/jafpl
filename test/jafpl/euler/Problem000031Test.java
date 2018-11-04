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
class Problem000031Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000031#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("142dfe4a33d624d2b830a9257e96726d", CheckGenerator.hexString((new Problem000031()).solve()));
	}
}
