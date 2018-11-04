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
class Problem000021Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000021#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("51e04cd4e55e7e415bf24de9e1b0f3ff", CheckGenerator.hexString((new Problem000021()).solve()));
	}
}
