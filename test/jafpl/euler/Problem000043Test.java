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
class Problem000043Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000043#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("115253b7721af0fdff25cd391dfc70cf", CheckGenerator.hexString((new Problem000043()).solve()));
	}
}
