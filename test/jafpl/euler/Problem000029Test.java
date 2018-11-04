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
class Problem000029Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000029#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("6f0ca67289d79eb35d19decbc0a08453", CheckGenerator.hexString((new Problem000029()).solve()));
	}
}
