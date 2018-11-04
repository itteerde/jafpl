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
class Problem000026Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000026#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("6aab1270668d8cac7cef2566a1c5f569", CheckGenerator.hexString((new Problem000026()).solve()));
	}
}
