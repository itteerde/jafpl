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
class Problem000050Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000050#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("73229bab6c5dc1c7cf7a4fa123caf6bc", CheckGenerator.hexString((new Problem000050()).solve()));
	}
}
