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
class Problem000010Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000010Test#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("d915b2a9ac8749a6b837404815f1ae25", CheckGenerator.hexString((new Problem000010()).solve()));
	}

}