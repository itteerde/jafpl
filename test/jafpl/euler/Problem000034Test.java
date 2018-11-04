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
class Problem000034Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000034#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("60803ea798a0c0dfb7f36397d8d4d772", CheckGenerator.hexString((new Problem000034()).solve()));
	}
}
