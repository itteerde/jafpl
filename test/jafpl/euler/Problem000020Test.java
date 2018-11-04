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
class Problem000020Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000020#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("443cb001c138b2561a0d90720d6ce111", CheckGenerator.hexString((new Problem000020()).solve()));
	}

}
